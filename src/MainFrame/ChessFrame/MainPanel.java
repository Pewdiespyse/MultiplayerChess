package MainFrame.ChessFrame;
//Xem ky

import MainFrame.ChessFrame.players.QuanTrang;
import MainFrame.ChessFrame.players.QuanDen;
import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;

//Xay dung ban co
public class MainPanel extends JPanel {

    private QuanTrang P1 = new QuanTrang();
    private QuanDen P2 = new QuanDen();
    private final int DIVIDE = 450 / 8;
    private int move = 0;
    private Rectangle2D rec;
    private short playersTurn = 1;
    public final CongCuPanel myTool;
    private final TrangThaiPanel myStatus;
    private boolean isGameOver = false;
    private boolean amIServer = false;
    private boolean amIClient = false;
    private ServerSocket ServerSock;
    private Socket Sock;
    private BufferedReader in;
    private PrintWriter out;
    private String Box;
    private boolean local = true;
    private JButton startServer;
    private JButton startClient;
    private String myIPAdress;
    private String myPortNumber;
    private boolean isGameStarted = true;
    private recvThread recvFrom;

    public boolean getGameStatus() {
        return isGameStarted;
    }

    //  Khoi dong game trong vai tro Server
    public void startAsServer(String Ip, String Port) {

        recvFrom = new recvThread();
        isGameStarted = false;
        local = false;
        myIPAdress = Ip;
        myPortNumber = Port;

        startAgain();
        startServer = new JButton(" Start Server");
        startServer.setSize(113, 57);
        startServer.setLocation(168, 168);
        //Nhan nut Start server
        startServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    ServerSock = new ServerSocket(Integer.parseInt(myPortNumber));

                    Thread Server = new Thread(new Runnable() {
                        public synchronized void run() {

                            try {

                                Sock = ServerSock.accept();

                                in = new BufferedReader(new InputStreamReader(Sock.getInputStream()));
                                out = new PrintWriter(Sock.getOutputStream());
                                startServer.setVisible(false);
                                startServer = null;
                                recvFrom.start();

                                isGameStarted = true;

                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    });
                    Server.start();

                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showConfirmDialog(null, "Server bi loi!", "Error", JOptionPane.OK_CANCEL_OPTION);
                }
                startServer.setText("Waiting...");
            }
        });
        add(startServer);

        amIServer = true;
        repaint();
    }

    //Khoi dong game trong vai tro Client
    public void startAsClient(String Ip, String Port) {

        recvFrom = new recvThread();

        isGameStarted = false;

        startAgain();
        myIPAdress = Ip;
        myPortNumber = Port;
        local = false;
        startClient = new JButton("Start Client");
        startClient.setSize(113, 57);
        startClient.setLocation(168, 168);
        //Nhan nut Start Client
        startClient.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {

                    Sock = new Socket(myIPAdress, Integer.parseInt(myPortNumber));
                    in = new BufferedReader(new InputStreamReader(Sock.getInputStream()));
                    out = new PrintWriter(Sock.getOutputStream());

                    recvFrom.start();
                    isGameStarted = true;

                } catch (UnknownHostException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showConfirmDialog(null, "Client bi loi!", "Error", JOptionPane.OK_CANCEL_OPTION);
                }
                startClient.setVisible(false);
                startClient = null;
            }
        });

        amIClient = true;
        add(startClient);
    }

    //Khoi dong lai game
    public void startAgain() {
        P1 = new QuanTrang();
        P2 = new QuanDen();
        move = 0;
        playersTurn = 1;
        isGameOver = false;
        local = true;
        myTool.startAgain();
        myStatus.startAgain();
        amIServer = false;
        amIClient = false;
        repaint();

    }

    //Khoi tao ban co
    public MainPanel(CongCuPanel myToolPanel, TrangThaiPanel myStatusPanel) {
        setBackground(Color.CYAN);

        setSize(450, 450);
        setLocation(10, 10);

        whenMoveMouse mouseDragAndDrop = new whenMoveMouse();
        Mousehere mouseHereEvent = new Mousehere();
        addMouseMotionListener(mouseDragAndDrop);
        addMouseListener(mouseHereEvent);

        myTool = myToolPanel;
        myStatus = myStatusPanel;
        setLayout(null);
    }

    //Ve ban co
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int iWidth = 450;
        int iHeight = 450;

        // Drawing the board
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {

                g2.setColor(Color.RED);
                rec = new Rectangle2D.Double(j * iWidth / 8, (1 + i) * iWidth / 8, DIVIDE, DIVIDE);
                g2.fill(rec);
                rec = new Rectangle2D.Double((1 + j) * iWidth / 8, i * iWidth / 8, DIVIDE, DIVIDE);
                g2.fill(rec);

            }
        }

        //Dat cac quan co
        Point postionPoint;
        int postX;
        int postY;
        Image img;
        for (int i = 1; i <= 32; i++) {
            //Lay toa do quan co dung yen hoac dang di chuyen
            if (i < 17) {
                if (i == P2.getInhand()) {
                    postionPoint = P2.getPixelPoint(i);

                } else {
                    postionPoint = P2.returnPosition(i);
                }
                img = P2.returnIconImage(i);

            } else {

                if (i == P1.getInHand()) {
                    postionPoint = P1.getPixelPoint(i);

                } else {
                    postionPoint = P1.returnPosition(i);
                }
                img = P1.returnIconImage(i);
            }
            //Ve quan co dang dung yen hoac dang di chuyen
            if (i == P1.getInHand()) {
                g2.drawImage(img, postionPoint.x - 30, postionPoint.y - 40, DIVIDE - 5, DIVIDE - 5, this);
            } else if (i == P2.getInhand()) {
                g2.drawImage(img, postionPoint.x - 30, postionPoint.y - 40, DIVIDE - 5, DIVIDE - 5, this);
            } else {
                postX = rowToX(postionPoint.x);
                postY = colToY(postionPoint.y);
                g2.drawImage(img, postX + 2, postY + 2, DIVIDE - 5, DIVIDE - 5, this);
            }
        }
    }

    //Cai dat xu ly event chuot
    private class Mousehere implements MouseListener {

        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
            boolean canSend = false;
            if (!isGameOver) {

                Point newP;
                Point samePostion;
                if (P1.getInHand() != -1) {

                    newP = P1.getPixelPoint(P1.getInHand());
                    newP.x /= DIVIDE;
                    newP.y /= DIVIDE;
                    newP.x++;
                    newP.y++;
                    int otherindex;

                    Point old = P1.returnOldPosition(P1.getInHand());
                    int x = old.x;
                    int y = old.y;
                    Point present = P1.returnPosition(P1.getInHand());

                    if (amIServer || local) {

                        if (P1.getInHand() < 33 && P1.getInHand() > 24) {
                            for (int i = 1; i < 17; i++) {
                                samePostion = P2.returnPosition(i);
                                if (samePostion.x == newP.x && samePostion.y == newP.y) {
                                    if (P1.setSeentoSiliders(P1.getInHand(), samePostion)) {
                                        break;
                                    }
                                }
                            }
                        }

                        if (!(newP.x == present.x && newP.y == present.y)) {
                            if (P1.checkTheMove(newP, P1.getInHand())) {

                                boolean flag = false;

                                for (int i = 1; i <= 32; i++) {
                                    if (P1.getInHand() != i) {
                                        if (i < 17) {
                                            flag = P1.checkTheWay(newP, P2.returnPosition(i), P1.getInHand());
                                        } else {
                                            flag = P1.checkTheWay(newP, P1.returnPosition(i), P1.getInHand());
                                        }

                                        if (flag == true) {
                                            break;
                                        }
                                    }

                                }

                                if (!flag && P1.isPieceAlreadyThere(newP)) {
                                    boolean kin2 = true;
                                    Point myold = new Point();
                                    Point o = P1.returnPosition(P1.getInHand());
                                    myold.x = o.x;
                                    myold.y = o.y;
                                    Point other = new Point();
                                    Point f = new Point();
                                    boolean kill = false;
                                    int killed = -1;
                                    boolean end_move = true;

                                    ////***  Start Here to Check the King
                                    for (int k = 1; k < 17; k++) {

                                        other = P2.returnPosition(k);

                                        if (newP.x == other.x && newP.y == other.y) {

                                            int inHand = P1.getInHand();

                                            if (inHand > 24 && P1.returnsoliderSeen(inHand)) {
                                                kill = true;

                                                f.x = other.x;
                                                f.y = other.y;

                                                P2.killPiece(k);
                                            } else if (inHand <= 24) {
                                                kill = true;

                                                f.x = other.x;
                                                f.y = other.y;

                                                P2.killPiece(k);
                                            } else {
                                                P1.changePosition(myold, inHand);
                                                end_move = false;

                                                break;
                                            }

                                            killed = k;//!!!

                                            break;
                                        }

                                    }

                                    if (end_move) {
                                        P1.changePosition(newP, P1.getInHand());// Here is the mOve ended
                                    }
                                    P1.checkKing(false);
                                    if (P1.seeKingCheck(P2)) // Vua P1 se bi chieu nen khong di duoc, quay lai vi tri cu
                                    {
                                        P1.changePosition(myold, P1.getInHand());
                                        P1.checkKing(true);
                                        end_move = false;
                                    }
                                    if (kill && P1.returnCheckKing()) {
                                        P2.changePosition(f, killed);

                                    }

                                    if (!P1.returnCheckKing()) {

                                        if (P2.seeKingCheck(P1)) // Vua P2 se bi chieu nen khong di duoc, quay lai vi tri cu
                                        {

                                            P2.checkKing(true);
                                            end_move = false;
                                            if (P2.checkMateGAMEOVER(P1)) {
                                                gameOver();
                                                Box = Integer.toString(P2.getInhand()) + Integer.toString(newP.x) + Integer.toString(newP.y);
                                                canSend = true;
                                            } else {
                                                Box = Integer.toString(P1.getInHand()) + Integer.toString(newP.x) + Integer.toString(newP.y);

                                                checkStatus();
                                                canSend = true;
                                            }
                                        }

                                        if (end_move) {
                                            Box = Integer.toString(P1.getInHand()) + Integer.toString(newP.x) + Integer.toString(newP.y);

                                            changeTurn();
                                            canSend = true;
                                        }

                                    }

                                }

                            }
                        }

                        P1.setInHand(-1);

                        repaint();

                        if (canSend && ((amIServer || amIClient))) {

                            sendMove();
                        }

                        if (isGameOver) {
                            JOptionPane.showConfirmDialog(null, "Chieu het co\n Quan trang thang!", "Game Over", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                } //////////////////////////////Black//////////////////////////////////////////////
                else if (P2.getInhand() != -1)//white
                {

                    if (amIClient || local) {
                        newP = P2.getPixelPoint(P2.getInhand());
                        newP.x /= DIVIDE;
                        newP.y /= DIVIDE;
                        newP.x++;
                        newP.y++;
                        boolean Kingch = false;
                        Point old = P2.returnOldPosition(P2.getInhand());
                        Point present = P2.returnPosition(P2.getInhand());

                        if (P2.getInhand() < 17 && P2.getInhand() > 8) {
                            for (int i = 17; i < 33; i++) {
                                samePostion = P1.returnPosition(i);

                                if (samePostion.x == newP.x && samePostion.y == newP.y) {
                                    if (P2.setSeenToSiliders(P2.getInhand(), samePostion)) {

                                        break;
                                    }
                                }
                            }
                        }

                        if (!(newP.x == present.x && newP.y == present.y)) {
                            if (P2.checkTheMove(newP, P2.getInhand())) {
                                boolean flag = false;
                                for (int i = 1; i <= 32; i++) {
                                    if (P2.getInhand() != i) {
                                        if (i < 17) {
                                            flag = P2.checkTheWay(newP, P2.returnPosition(i), P2.getInhand());
                                        } else {
                                            flag = P2.checkTheWay(newP, P1.returnPosition(i), P2.getInhand());
                                        }

                                        if (flag) {
                                            break;
                                        }
                                    }
                                }

                                for (int i = 1; i <= 16 && !flag; i++) {
                                    if (P2.getInhand() != i) {
                                        if (flag == false) {
                                            samePostion = P2.returnPosition(i);
                                            if (newP.x == samePostion.x && newP.y == samePostion.y) {
                                                flag = true;
                                                break;

                                            }
                                        }

                                    }

                                    if (flag) {
                                        break;
                                    }
                                }

                                if (!flag) {
                                    Point kingPostion2 = P2.returnPosition(8);
                                    Point myOld = new Point();
                                    Point o = P2.returnPosition(P2.getInhand());
                                    myOld.x = o.x;
                                    myOld.y = o.y;
                                    Point other = new Point();
                                    Point f = new Point();
                                    boolean kill = false;
                                    boolean endMove = true;
                                    int killed = -1;

                                    for (int k = 17; k < 33; k++) {
                                        other = P1.returnPosition(k);
                                        if (newP.x == other.x && newP.y == other.y) {

                                            int inHand = P2.getInhand();

                                            if (inHand > 8 && P2.returnSoliderSeen(inHand)) {
                                                kill = true;

                                                other = P1.returnPosition(k);

                                                f.x = other.x;
                                                f.y = other.y;

                                                P1.killPiece(k);
                                            } else if (inHand <= 8) {
                                                kill = true;

                                                other = P1.returnPosition(k);

                                                f.x = other.x;
                                                f.y = other.y;
                                                P1.killPiece(k);
                                            } else {
                                                endMove = false;
                                                P2.changePosition(myOld, inHand);
                                            }

                                            killed = k;
                                            break;

                                        }

                                    }

                                    if (endMove) {
                                        P2.changePosition(newP, P2.getInhand());
                                    }

                                    P2.checkKing(false);
                                    if (P2.seeKingCheck(P1)) // Vua P2 se bi chieu nen khong di duoc, quay lai vi tri cu
                                    {
                                        P2.changePosition(myOld, P2.getInhand());
                                        P2.checkKing(true);

                                        endMove = false;

                                    }
                                    if (kill && P2.returnCheckKing()) {

                                        P1.changePosition(f, killed);
                                    }

                                    if (P2.returnCheckKing()) {
                                        P2.changePosition(myOld, P2.getInhand());
                                    }

                                    if (!P2.returnCheckKing()) {
                                        if (P1.seeKingCheck(P2)) // Vua P1 se bi chieu nen khong di duoc, quay lai vi tri cu
                                        {

                                            P1.checkKing(true);
                                            endMove = false;

                                            if (P1.checkMateGAMEOVER(P2)) {
                                                Box = Integer.toString(P2.getInhand()) + Integer.toString(newP.x) + Integer.toString(newP.y);
                                                gameOver();

                                                canSend = true;
                                            } else {
                                                Box = Integer.toString(P2.getInhand()) + Integer.toString(newP.x) + Integer.toString(newP.y);
                                                checkStatus();
                                                canSend = true;
                                            }
                                        }

                                        if (endMove) {
                                            Box = Integer.toString(P2.getInhand()) + Integer.toString(newP.x) + Integer.toString(newP.y);
                                            changeTurn();
                                            canSend = true;
                                        }

                                    }

                                }
                            }
                        }
                        P2.setInHand(-1);

                        repaint();

                        if (canSend && ((amIServer || amIClient))) {
                            sendMove();
                        }
                        if (isGameOver) {
                            JOptionPane.showConfirmDialog(null, "Chieu het co\n Quan den thang", "Game Over", JOptionPane.DEFAULT_OPTION);
                        }

                    }
                }
            }
        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }

    //Xu ly animation nuoc di cua ca 2 ben
    public boolean getBoardPosition(int x, int y) {
        if (!isGameOver && isGameStarted) {
            if ((amIServer && playersTurn == 1) || (local) || (amIClient && playersTurn == 2)) {

                int newX = x / DIVIDE;
                int newY = y / DIVIDE;
                newX++;
                newY++;

                if (newX > 8 || newY > 8 || newX < 1 || newY < 1) {
                    repaint();
                    return false;

                }

                if (playersTurn == 1 && P1.getInHand() == -1)//Player 1
                {
                    for (int i = 17; i <= 32; i++) {
                        Point p = P1.returnPosition(i);
                        if (p.x == newX && p.y == newY) {
                            P1.setInHand(i);
                            whenHandleAndPiece(x, y);
                            return true;
                        }
                    }
                } else if (playersTurn == 2 && P2.getInhand() == -1)//Player 2
                {
                    for (int i = 1; i <= 16; i++) {
                        Point p = P2.returnPosition(i);
                        if (p.x == newX && p.y == newY) {
                            P2.setInHand(i);
                            whenHandleAndPiece(x, y);
                            return true;
                        }
                    }
                } else if (playersTurn == 1 && P1.getInHand() != -1)//Player 1
                {
                    whenHandleAndPiece(x, y);
                    return true;
                } else if (playersTurn == 2 && P2.getInhand() != -1)//Player 2
                {
                    whenHandleAndPiece(x, y);
                    return true;
                }
                P1.setInHand(-1);
                move = 0;

                return false;
            }
        }
        return false;
    }

    //Thay doi vi tri icon khi chon quan co va di
    public boolean whenHandleAndPiece(int x, int y) {

        if (playersTurn == 1 && P1.getInHand() != -1) {
            P1.changePixel(x, y, P1.getInHand());
            return true;
        } else if (playersTurn == 2 && P2.getInhand() != -1) {
            P2.changePixel(x, y, P2.getInhand());
            return true;
        }
        return false;
    }

    //Di den vi tri X cua icon
    private int rowToX(int r) {
        int myx;
        int iHeight = this.getHeight();
        myx = (r * iHeight / 8) - DIVIDE;
        return myx;
    }

    //Di den vi tri Y cua icon
    private int colToY(int c) {
        int myy;
        int iWidth = getWidth();
        myy = (c * iWidth / 8) - DIVIDE;
        return myy;
    }

    //Xu ly drag chuot
    private class whenMoveMouse implements MouseMotionListener {

        public void mouseDragged(MouseEvent e) {

            int x = e.getX();
            int y = e.getY();
            if (controllGameType(x, y)) {

                repaint();
            }

        }

        public void mouseMoved(MouseEvent e) {

        }

    }

    //Xy ly che do choi cua game
    public boolean controllGameType(int x, int y) {

        if (amIServer == true || amIClient == true && isGameStarted) {
            if (amIServer && playersTurn == 1) {
                return getBoardPosition(x, y);
            } else if (amIClient && playersTurn == 2) {
                return getBoardPosition(x, y);
            } else {
                return false;
            }
        } else {
            return getBoardPosition(x, y);
        }
    }

    //Doi luot che do LOCAL
    private void changeTurn() {
        if (playersTurn == 1) {
            playersTurn = 2;
            myTool.addToHistory("Trang : " + P1.Tell_me_About_last_move());
            myStatus.changeStatus(" Luot quan DEN");
            myTool.changeToTimer2();
        } else if (playersTurn == 2) {
            playersTurn = 1;
            myTool.addToHistory("Den : " + P2.tellMeAboutLastMove());
            myTool.changeToTimer1();
            myStatus.changeStatus(" Luot quan TRANG");
        }

    }

    //Doi luot che do NETWORK
    private void changeNetTurn() {
        if (playersTurn == 2) {

            myTool.addToHistory("Trang : " + P1.Tell_me_About_last_move());
            myStatus.changeStatus(" Luot quan DEN");
            myTool.changeToTimer2();
        } else if (playersTurn == 1) {

            myTool.addToHistory("Den : " + P2.tellMeAboutLastMove());
            myTool.changeToTimer1();
            myStatus.changeStatus(" Luot quan TRANG");
        }

    }

    //Chuyen trang thai CHIEU che do NETWORK
    private void checkNetGameStatus() {
        if (playersTurn == 1) {
            myTool.addToHistory("Trang : " + P1.Tell_me_About_last_move());
            myTool.changeToTimer2();
        } else if (playersTurn == 2) {
            myTool.addToHistory("Den : " + P2.tellMeAboutLastMove());
            myTool.changeToTimer1();
        }
        myStatus.changeStatus(" Chieu! ");
    }

    //Chuyen trang thai CHIEU che do LOCAL
    private void checkStatus() {
        if (playersTurn == 1) {

            playersTurn = 2;
            myTool.addToHistory("Trang : " + P1.Tell_me_About_last_move());
            myTool.changeToTimer2();
        } else if (playersTurn == 2) {

            playersTurn = 1;
            myTool.addToHistory("Den : " + P2.tellMeAboutLastMove());
            myTool.changeToTimer1();
        }

        myStatus.changeStatus(" Chieu! ");
    }

    //Bat flag ket thuc game va hien thi tren status
    private void gameOver() {
        myStatus.changeStatus(" Chieu het co! ");
        isGameOver = true;
    }

    //Gui nuoc di sang CLIENT hoac SERVER
    public void sendMove() {
        out.print(Box);
        out.print("\r\n");
        out.flush();

    }

    //Nhan nuoc di tu CLIENT hoac SERVER roi hien thi len ban co
    class recvThread extends Thread {

        public synchronized void run() {

            while (true) {

                try {

                    Box = in.readLine();

                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("ERROR");
                }

                if (Box != null) {

                    int newInHand = Integer.parseInt(Box);
                    int newX = Integer.parseInt(Box);
                    int newY = Integer.parseInt(Box);

                    newInHand /= 100;
                    newX -= (newInHand * 100);
                    newX /= 10;
                    newY -= (newInHand * 100) + (newX * 10);

                    if (playersTurn == 1) {

                        P1.setInHand(newInHand);
                        playersTurn = 2;

                        P1.changePosition(new Point(newX, newY), newInHand);

                        P2.killPiece(P1.getPieceAlreadyThereFromEnemy(new Point(newX, newY), P2));
                        P2.checkKing(false);

                        if (P2.seeKingCheck(P1)) {

                            P2.checkKing(true);

                            if (P2.checkMateGAMEOVER(P1)) {
                                System.out.println("mate");
                                gameOver();

                            } else {

                                checkNetGameStatus();

                            }
                        } else {
                            changeNetTurn();
                        }

                        P1.setInHand(-1);

                    } else {
                        P2.setInHand(newInHand);
                        P2.changePosition(new Point(newX, newY), newInHand);

                        P1.killPiece(P2.getPieceAlreadyThereFromEnemy(new Point(newX, newY), P1));
                        playersTurn = 1;

                        P1.checkKing(false);
                        if (P1.seeKingCheck(P2)) {
                            P1.checkKing(true);

                            if (P1.checkMateGAMEOVER(P2)) {

                                System.out.println("mate");
                                gameOver();

                            } else {

                                checkNetGameStatus();

                            }
                        } else {
                            changeNetTurn();
                        }

                        P2.setInHand(-1);
                    }
                    repaint();
                }

            }
        }
    }
}
