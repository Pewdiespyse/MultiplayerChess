package MainFrame.ChessFrame;

import MainFrame.ChessFrame.ThreadTimer.ThreadTimer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

//Xay dung thanh cong cu ben phai ban co
public class CongCuPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public CongCuPanel() {
        setSize(200, 600);
        setLocation(460, 0);
        setLayout(null);

        JLPlayer1.setSize(60, 25);
        JLPlayer1.setLocation(20, 10);
        JLPlayer1.setEnabled(false);
        JLPlayer1.setBackground(Color.RED);
        JLPlayer1.setDisabledTextColor(Color.BLACK);
        JLPlayer1.setFont(new Font("Arial", Font.BOLD, 12));

        Clock1.setSize(100, 25);
        Clock1.setLocation(100, 22);

        JLDen.setSize(60, 25);
        JLDen.setLocation(20, 34);
        JLDen.setEnabled(false);
        JLDen.setBackground(Color.YELLOW);
        JLDen.setFont(new Font("Arial", Font.BOLD, 12));
        JLDen.setDisabledTextColor(Color.BLACK);

        JLPlayer2.setSize(60, 25);
        JLPlayer2.setLocation(20, 464);
        JLPlayer2.setEnabled(false);
        JLPlayer2.setBackground(Color.RED);
        JLPlayer2.setDisabledTextColor(Color.BLACK);
        JLPlayer2.setFont(new Font("Arial", Font.BOLD, 12));

        Clock2.setSize(100, 25);
        Clock2.setLocation(100, 454);

        JLTrang.setSize(60, 25);
        JLTrang.setLocation(20, 440);
        JLTrang.setEnabled(false);
        JLTrang.setBackground(Color.YELLOW);
        JLTrang.setFont(new Font("Arial", Font.BOLD, 12));
        JLTrang.setDisabledTextColor(Color.BLACK);

        JLTimer1.setSize(90, 49);
        JLTimer1.setLocation(79, 10);
        JLTimer1.setEnabled(false);
        JLTimer1.setBackground(Color.ORANGE);
        JLTimer1.setFont(new Font("Arial", Font.BOLD, 12));
        JLTimer1.setDisabledTextColor(Color.BLACK);

        JLTimer2.setSize(90, 49);
        JLTimer2.setLocation(79, 440);
        JLTimer2.setEnabled(false);
        JLTimer2.setBackground(Color.ORANGE);
        JLTimer2.setFont(new Font("Arial", Font.BOLD, 12));
        JLTimer2.setDisabledTextColor(Color.BLACK);

        JLHistory.setSize(151, 25);
        JLHistory.setLocation(19, 71);
        JLHistory.setEnabled(false);
        JLHistory.setBackground(Color.RED);
        JLHistory.setFont(new Font("Arial", Font.BOLD, 12));
        JLHistory.setDisabledTextColor(Color.BLACK);

        add(JLPlayer1);
        add(JLDen);
        add(JLPlayer2);
        add(JLTrang);
        add(Clock1);
        add(Clock2);
        add(JLTimer1);
        add(JLTimer2);
        add(JLHistory);

        HistoryScroll.setSize(150, 330);
        HistoryScroll.setLocation(20, 95);
        add(HistoryScroll);
    }

    public void addToHistory(Object newItem) {
        HistoryList.addElemenToList(newItem);
    }

    public void changeToTimer1() {
        Timer1.resume();
        Timer2.suspend();
    }

    public void changeToTimer2() {
        Timer2.resume();
        Timer1.suspend();
    }

    public void stopTimers() {
        Timer1.stop();
        Timer2.stop();
    }

    private final JTextField JLPlayer1 = new JTextField(" Player 2 ");
    private final JTextField JLPlayer2 = new JTextField(" Player 1 ");
    private final JTextField JLTrang = new JTextField("  TRANG ");
    private final JTextField JLDen = new JTextField("     DEN ");
    private final JTextField JLTimer1 = new JTextField("");
    private final JTextField JLTimer2 = new JTextField("");
    private final JTextField JLHistory = new JTextField("      LICH SU TRO CHOI");
    private final myHistoryList HistoryList = new myHistoryList();
    private final short number_of_turn = 1;
    private final JScrollPane HistoryScroll = new JScrollPane(HistoryList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private final JLabel Clock1 = new JLabel();
    private final JLabel Clock2 = new JLabel();
    private ThreadTimer Timer1;
    private ThreadTimer Timer2;

    public void startAgain() {
        if (Timer1 != null) {
            Timer1.stop();
            Timer2.stop();
        }

        Timer1 = new ThreadTimer(Clock2);
        Timer2 = new ThreadTimer(Clock1);

        Timer1.start();
        Timer2.start();

        Timer1.suspend();
        Timer2.suspend();

        HistoryList.clean_list();

    }

}

class myHistoryList extends JList {

    myHistoryList() {

        this.setBackground(Color.GRAY);
        setModel(listModel);
    }

    public void clean_list() {
        listModel.clear();
    }

    public void addElemenToList(Object newItem) {
        listModel.addElement(newItem);
    }
    private DefaultListModel listModel = new DefaultListModel();
}

class myStatusFileds extends JTextField {

    myStatusFileds() {
        this.setEnabled(false);
    }
}
