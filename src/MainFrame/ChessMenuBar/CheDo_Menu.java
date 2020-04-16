package MainFrame.ChessMenuBar;

import javax.swing.JMenu;
import MainFrame.ChessFrame.MainFrame;

//CheDo_menu
public class CheDo_Menu extends JMenu {

    public CheDo_Menu(MainFrame ff) {
        ModeItem = new LoaiTroChoi_Item(ff);
        setText("Che do");

        add(ModeItem);
        addSeparator();
        add(ExitItem);

    }

    public String getIPaddress() {
        return ModeItem.getIpAddress();
    }

    public String getportNumber() {
        return ModeItem.getportNumber();
    }

    private final LoaiTroChoi_Item ModeItem;
    private final Thoat_Item ExitItem = new Thoat_Item();

}
