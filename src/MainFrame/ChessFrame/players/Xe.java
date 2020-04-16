package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;

public class Xe {

    //Xay dung quan xe
    private int X, Y;
    private int pixelX, pixelY;
    private Point pixelPoint = new Point();
    private boolean isAlive = true;
    private Icon pieceIcon;
    private Point P = new Point();
    private Point oldP = new Point();

    public Xe(String NameIcon, int startX, int startY) {

        pieceIcon = new Icon(NameIcon);

        X = startX;
        Y = startY;
        P.x = X;
        P.y = Y;
    }

    //Tra ve icon cua quan co
    public Image returnPieceImage() {
        return pieceIcon.returnIcon();
    }

    //Set toa do pixel
    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    //Tra ve toa do X
    public int returnX() {
        X = P.x;
        return X;
    }

    //Tra ve toa do Y
    public int returnY() {
        Y = P.y;
        return Y;
    }

    //Lay toa do pixelX
    public int getPixelX() {
        return pixelX;
    }

    //Lay to do pixelY
    public int getPixelY() {
        return pixelY;
    }

    //Lay toa do pixel
    public Point getPixelPoint() {
        return pixelPoint;
    }

    //Set lai toa do cu
    public void toOld(Point Old) {

        P.x = Old.x;
        P.y = Old.y;

    }

    //Set toa do moi
    public void setPoint(Point newPoint) {
        oldP.x = P.x;
        oldP.y = P.y;
        X = P.x = newPoint.x;
        Y = P.y = newPoint.y;
    }

    //Set toa do X
    public void setX(int newX) {
        X = newX;
        P.x = newX;
    }

    //Set toa do Y
    public void setY(int newY) {
        Y = newY;
        P.y = newY;
    }

    //Lay toa do cu
    public Point returnOld() {
        return oldP;
    }

    //Lay toa do hien tai
    public Point returnPosition() {
        return (Point) P.clone();
    }

    //Kiem tra quan co bi an hay chua
    public boolean returnLife() {
        return isAlive;
    }

    //Kiem tra quan co dang o vi tri (x, y) hay khong
    public boolean inThisPosition(int x, int y) {
        if (P.x == x && P.y == y) {
            return true;
        }
        return false;
    }

    //Kiem tra vi tri (x,y) co the di hay khong
    public boolean canMove(int x, int y) {
        if (((y == Y) && (x > (X) || (x < (X))))) {
            return true;
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            return true;
        } else {

            return false;
        }

    }

    //Kiem tra duong di toi vi tri (x, y) co bi can boi othersPosition hay khong
    public boolean isPieceInMyWay(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (((y == Y) && (x > (X) || (x < (X))))) {

            if ((X < i)) {
                while ((i != X + 1)) {
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i)))//there Same Color piece
                    {
                        return true;
                    }
                }
            } else if ((X > i)) {
                while ((i != X - 1)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            if ((Y < j)) {
                while ((j != Y + 1)) {
                    j--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((Y > j)) {
                while ((j != Y - 1)) {
                    j++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }

            }
        }
        return false;

    }

    //Kiem tra vi tri di den (x, y) co chieu duoc tuong o toa do otherPosition hay khong
    public boolean checkKing(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if (((y == Y) && (x > (X) || (x < (X))))) {

            if ((X < i)) {
                while ((i != X)) {
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i)))//there Same Color piece
                    {
                        return true;
                    }
                }
            } else if ((X > i)) {
                while ((i != X)) {
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            if ((Y < j)) {
                while ((j != Y)) {
                    j--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((Y > j)) {
                while ((j != Y)) {
                    j++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }

            }
        }
        return false;

    }

    public Point generatePossibleMoves() {
        return new Point();
    }

    public String tellMe() {
        return "Xe = (" + P.x + ',' + P.y + ")";
    }
}
