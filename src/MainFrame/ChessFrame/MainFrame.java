package MainFrame.ChessFrame;

import java.awt.Container;
import javax.swing.JFrame;
import MainFrame.ChessMenuBar.ChessMainMenuBar;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Co vua 1.0");
        setSize(650, 565);
        setLocation(250, 250);
        setResizable(false);

        contentPanel.setLayout(null);
        contentPanel.add(statusPanel);
        contentPanel.add(toolPanel);

        myChessBar = new ChessMainMenuBar(this);

        setJMenuBar(myChessBar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void startAgain() {
        contentPanel.add(mainPanel);
        mainPanel.startAgain();
    }

    public void startAsServer() {
        contentPanel.add(mainPanel);
        mainPanel.startAsServer(myChessBar.getIpAddress(), myChessBar.getPortnumber());
        setTitle("Server player");

    }

    public void start_As_Client() {
        contentPanel.add(mainPanel);
        mainPanel.startAsClient(myChessBar.getIpAddress(), myChessBar.getPortnumber());
        setTitle("Client player");
    }

    private final ChessMainMenuBar myChessBar;
    public final CongCuPanel toolPanel = new CongCuPanel();
    private final TrangThaiPanel statusPanel = new TrangThaiPanel();
    private final MainPanel mainPanel = new MainPanel(toolPanel, statusPanel);
    private Container contentPanel = getContentPane();
}
