package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;

public class Ma {

    //Xay dung quan ma
    private int X, Y;
    private Point pixelPoint = new Point();
    private int pixelX, pixelY;
    private boolean isAlive = true;
    private Point oldP = new Point();
    private Icon pieceIcon;
    private Point P = new Point();

    public Ma(String nameIcon, int startX, int startY) {

        pieceIcon = new Icon(nameIcon);

        X = startX;
        Y = startY;
        P.x = X;
        P.y = Y;
    }

    public Point returnPosition() {
        return (Point) P.clone();
    }

    public Image returnPieceImage() {
        return pieceIcon.returnIcon();
    }

    public int returnX() {
        return X;
    }

    public void setPoint(Point newPoint) {
        oldP.x = P.x;
        oldP.y = P.y;
        X = P.x = newPoint.x;
        Y = P.y = newPoint.y;
    }

    public Point returnOld() {
        return (Point) oldP.clone();
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

    public void setX(int newX) {
        X = newX;
        P.x = X;
    }

    public void setY(int newY) {
        Y = newY;
        P.y = Y;
    }

    public int returnY() {
        return Y;
    }

    public boolean returnLife() {
        return isAlive;
    }

    public boolean inThisPosition(int x, int y) {
        if (P.x == x && P.y == y) {
            return true;
        }
        return false;
    }

    public void toOld(Point Old) {

        P.x = Old.x;
        P.y = Old.y;
    }

    public boolean canMove(int x, int y) {

        if ((x + 1 == X) && (y + 2 == Y) || (x + 1 == X) && (y - 2 == Y) || (x - 1 == X) && (y + 2 == Y) || (x - 1 == X) && (y - 2 == Y) || (x + 2 == X) && (y + 1 == Y)
                || (x + 2 == X) && (y - 1 == Y) || (x - 2 == X) && (y + 1 == Y) || (x - 2 == X) && (y - 1 == Y)) {
            return true;
        } else {
            return false;
        }
    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Ma = (" + P.x + ',' + P.y + ")";
    }
}
