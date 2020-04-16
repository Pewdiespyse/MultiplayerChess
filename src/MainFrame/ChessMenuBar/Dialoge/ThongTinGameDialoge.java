package MainFrame.ChessMenuBar.Dialoge;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JPanel;
import MainFrame.ChessFrame.MainFrame;

public class ThongTinGameDialoge extends JDialog {

    //Dialoge thong tin tro choi
    public ThongTinGameDialoge(final MainFrame ff) {
        super(ff, "Thong tin tro choi", true);

        setSize(275, 200);
        setLocation(100, 100);
        panel.setLayout(null);
        Container cp = getContentPane();

        panel.setSize(275, 200);

        button = new JButton("OK");
        button.setSize(80, 24);
        button.setLocation(90, 120);

        titleText.setLocation(50, 10);
        titleText.setSize(160, 24);

        contentText1.setLocation(25, 50);
        contentText1.setSize(250, 24);

        contentText2.setLocation(25, 65);
        contentText2.setSize(250, 24);

        contentText3.setLocation(25, 80);
        contentText3.setSize(250, 24);

        myNewFrame = ff;

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.setLayout(null);
        panel.add(button);
        panel.add(titleText);
        panel.add(contentText1);
        panel.add(contentText2);
        panel.add(contentText3);

        cp.add(panel);
    }

    private final JButton button;
    private final JPanel panel = new JPanel();
    private final JLabel titleText = new JLabel("CHESS FINAL PROJECT 1.0");
    private final JLabel contentText1 = new JLabel("Java application programming class");
    private final JLabel contentText2 = new JLabel("Information Technology K2014 Faculty");
    private final JLabel contentText3 = new JLabel("Ho Chi Minh University of Science");
    private MainFrame myNewFrame;
    private ButtonGroup Buttongroup = new ButtonGroup();

    public void paintComponents(Graphics g) {
        super.paintComponents(g);

    }

}
