package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;

public class Vua {

    //Xay dung quan vua
    private int X, Y;
    private Point pixelPoint = new Point();
    private int pixelX, pixelY;
    private boolean isAlive = true;
    private Icon pieceIcon;
    private Point oldP = new Point();
    private Point P = new Point();

    public Vua(String NameIcon, int startX, int startY) {
        pieceIcon = new Icon(NameIcon);

        X = startX;
        Y = startY;
        P.x = X;
        P.y = Y;
    }

    public Image returnPieceImage() {
        return pieceIcon.returnIcon();
    }

    public Point returnPosition() {
        return (Point) P.clone();
    }

    public int returnX() {
        X = P.x;
        return X;
    }

    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    public int getPixelX() {
        return pixelX;
    }

    public int getPixelY() {
        return pixelY;
    }

    public Point getPixelPoint() {
        return pixelPoint;
    }

    public int returnY() {
        Y = P.y;
        return Y;
    }

    public void setPoint(Point newPoint) {
        oldP.x = P.x;
        oldP.y = P.y;

        P.x = newPoint.x;

        P.y = newPoint.y;

        X = P.x;
        Y = P.y;
    }

    public void toOld(Point Old) {
        P.x = Old.x;
        P.y = Old.y;
    }

    public Point returnOld() {
        return oldP;
    }

    public void setX(int newX) {
        X = newX;
        P.x = X;
    }

    public void setY(int newY) {
        Y = newY;
        P.y = Y;
    }

    public boolean inThisPosition(int x, int y) {
        if (P.x == x && P.y == y) {
            return true;//cant kill the king anymore;
        }
        return false;
    }

    public boolean returnLife() {
        return isAlive;
    }

    public boolean canMove(int x, int y) {
        if (((y == Y) && (x == (X - 1))) || ((y == Y - 1) && (x == (X + 1)))
                || ((y == Y - 1) && (x == (X - 1))) || ((y == Y + 1) && (x == (X + 1)))
                || (((y == Y + 1) && x == (X - 1))) || ((y == Y) && (x == (X + 1)))
                || ((y == Y - 1) && x == ((X))) || ((y == Y + 1) && (x == (X)))) {
            return true;
        }
        return false;
    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Vua = (" + P.x + ',' + P.y + ")";
    }
}
