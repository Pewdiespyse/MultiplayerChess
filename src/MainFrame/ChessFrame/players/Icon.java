package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Toolkit;

public class Icon {

    private Toolkit kit = Toolkit.getDefaultToolkit();
    private Image image;

    public Icon(String NameIcon) //throws IOException
    {
        image = kit.getImage(NameIcon);
    }

    public Image returnIcon() {
        return image;
    }
}
