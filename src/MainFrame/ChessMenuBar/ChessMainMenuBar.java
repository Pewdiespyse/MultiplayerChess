package MainFrame.ChessMenuBar;

import javax.swing.JMenuBar;
import MainFrame.ChessFrame.MainFrame;

//Main menu
public class ChessMainMenuBar extends JMenuBar {

    public ChessMainMenuBar(MainFrame ff) {
        FMenu = new CheDo_Menu(ff);
        HMenu = new TroGiup_Menu(ff);
        add(FMenu);
        add(HMenu);

    }

    public String getIpAddress() {
        return FMenu.getIPaddress();
    }

    public String getPortnumber() {
        return FMenu.getportNumber();
    }

    private final CheDo_Menu FMenu;
    private final TroGiup_Menu HMenu;
}
