package MainFrame.ChessMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

//Thoat_Item
public class Thoat_Item extends JMenuItem {

    public Thoat_Item() {
        setText("Thoat");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
