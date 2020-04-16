package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;

public class Tot {

    //Xay dung quan tot
    private int X, Y;
    private Point pixelPoint = new Point();
    private int pixelX, pixelY;
    private boolean isAlive = true;
    private boolean isMovedBefore = false;
    private Icon pieceIcon;
    private Point P = new Point();
    private Point oldP = new Point();
    private boolean mySeen = false;

    public Tot(String nameIcon, int startX, int startY) {

        pieceIcon = new Icon(nameIcon);

        X = startX;
        Y = startY;
        P.x = X;
        P.y = Y;
    }

    public Image returnPieceImage() {
        return pieceIcon.returnIcon();
    }

    public boolean returnLife() {
        return isAlive;
    }

    public int returnX() {
        return X;
    }

    public void setPoint(Point newPoint) {
        oldP.x = P.x;
        oldP.y = P.y;
        X = P.x = newPoint.x;
        Y = P.y = newPoint.y;
        P.x = X;
        P.y = Y;
        isMovedBefore = true;
        mySeen = false;
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
        return Y;
    }

    public Point returnPosition() {
        return (Point) P.clone();
    }

    public boolean inThisPosition(int x, int y) {
        if (P.x == x && P.y == y) {
            return true;
        }
        return false;
    }

    //Quan TRANG chi co the di len, quan DEN chi co the di xuong
    public boolean canMove(int x, int y, String typeColor) {
        if ((typeColor.equals("black"))) {
            if ((((y - 1 == Y) && (x == (X)))) /*&&!Check_Solider_Sees(x,y)*/) {
                return true;
            } else if ((((y - 2 == Y) && (x == (X)))) && !isMovedBefore) {

                return true;
            } else if ((y - 1 == Y && x + 1 == (X) || (y - 1 == Y && x - 1 == (X))) && mySeen) {
                return true;
            } else {
                return false;
            }
        } else if (typeColor == "white") {
            if (((y + 1 == Y) && (x == (X))) /*&&!Check_Solider_Sees(x,y)*/) {
                return true;
            } else if ((((y + 2 == Y) && (x == (X)))) && !isMovedBefore) {
                return true;
            } else if ((y + 1 == Y && x + 1 == (X) || (y + 1 == Y && x - 1 == (X))) && mySeen) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //
    public boolean isPieceInMyWay(int x, int y, Point othersPostion, String typeColor) {
        if (Y - y == 2 || Y - y == -2) {
            if ((typeColor.equals("black"))) {

                if ((((y - 1 == othersPostion.y) && (x == (othersPostion.x)))) && !isMovedBefore) {
                    return true;
                } else {
                    return false;
                }
            } else if (typeColor.equals("white")) {
                if (((y + 1 == othersPostion.y) && (x == (othersPostion.x)) && !isMovedBefore)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    //
    public void toOld(Point Old) {
        P.x = Old.x;
        P.y = Old.y;
    }

    //
    public void setMySeen(boolean newBoolean) {
        mySeen = newBoolean;
    }

    //
    public boolean returnMyseen() {
        return mySeen;
    }

    //Kiem tra vi tri newP co the duoc an boi quan tot neu la ke dich hay khong
    public boolean setSeenByChecking(Point newP, String Color) {
        mySeen = false;
        if ((Color.equals("black"))) {
            if ((newP.y - 1 == Y && newP.x + 1 == (X) || (newP.y - 1 == Y && newP.x - 1 == (X)))) {
                mySeen = true;
                return true;
            } else {
                return false;
            }
        } else if (Color.equals("white")) {
            if ((newP.y + 1 == Y && newP.x + 1 == (X) || (newP.y + 1 == Y && newP.x - 1 == (X)))) {
                mySeen = true;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Tot = (" + P.x + ',' + P.y + ")";
    }
}
