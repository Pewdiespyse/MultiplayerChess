package MainFrame.ChessMenuBar;

import MainFrame.ChessMenuBar.Dialoge.ThongTinGameDialoge;
import javax.swing.JMenuItem;
import MainFrame.ChessFrame.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThongTinGame_Item extends JMenuItem {

    //Thong tin tro choi
    public ThongTinGame_Item(MainFrame ff) {
        ACGdial = new ThongTinGameDialoge(ff);
        setText("Thong tin tro choi");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ACGdial.setVisible(true);
            }
        });
    }
    private final ThongTinGameDialoge ACGdial;

}
