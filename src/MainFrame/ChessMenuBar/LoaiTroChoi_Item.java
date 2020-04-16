package MainFrame.ChessMenuBar;

import MainFrame.ChessMenuBar.Dialoge.TroChoiMoiDialoge;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import MainFrame.ChessFrame.MainFrame;

//LoaiTroChoi_menu
public class LoaiTroChoi_Item extends JMenu {

    public LoaiTroChoi_Item(MainFrame ff) {
        myNewFrame = ff;
        ModeDial = new TroChoiMoiDialoge(ff);
        setText("Loai tro choi");

        //1 nguoi choi
        OnePlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myNewFrame.startAgain();
            }
        });
        //2 nguoi choi
        TwoPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ModeDial.setVisible(true);

            }
        });

        add(OnePlayer);
        add(TwoPlayer);
    }

    public String getIpAddress() {
        return ModeDial.GetIpAddress();
    }

    public String getportNumber() {
        return ModeDial.GetPortnumber();
    }

    private final TroChoiMoiDialoge ModeDial;
    private final JMenuItem OnePlayer = new JMenuItem(" 1 nguoi choi");
    private final JMenuItem TwoPlayer = new JMenuItem(" 2 nguoi choi");
    private final MainFrame myNewFrame;
}
