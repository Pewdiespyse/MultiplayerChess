package MainFrame.ChessMenuBar;

import MainFrame.ChessMenuBar.Dialoge.ThongTinNhomDialoge;
import javax.swing.JMenuItem;
import MainFrame.ChessFrame.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThongTinNhom_Item extends JMenuItem {

    //Thong tin thanh vien nhom
    public ThongTinNhom_Item(MainFrame ff) {
        AGPdial = new ThongTinNhomDialoge(ff);
        setText("Thong tin nhom");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AGPdial.setVisible(true);
            }
        });
    }
    private final ThongTinNhomDialoge AGPdial;
}
