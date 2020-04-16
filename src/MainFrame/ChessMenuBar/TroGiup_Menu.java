package MainFrame.ChessMenuBar;

import javax.swing.JMenu;
import MainFrame.ChessFrame.MainFrame;

//TroGiup_menu
public class TroGiup_Menu extends JMenu {

    public TroGiup_Menu(MainFrame ff) {
        this.AboutUs = new ThongTinNhom_Item(ff);
        this.AboutGame = new ThongTinGame_Item(ff);
        setText("Tro giup");
        add(AboutGame);
        add(AboutUs);
    }

    private final ThongTinGame_Item AboutGame;
    private final ThongTinNhom_Item AboutUs;
}
