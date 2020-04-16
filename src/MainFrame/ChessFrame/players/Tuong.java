package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;

public class Tuong {

    //Xay dung quan tuong
    private int X, Y;
    private Point pixelPoint = new Point();
    private int pixelX, pixelY;
    private boolean isAlive = true;
    private Icon pieceIcon;
    private Point P = new Point();
    private Point oldP = new Point();

    public Tuong(String nameIcon, int startX, int startY) {

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

        P.x = newPoint.x;

        P.y = newPoint.y;
        X = P.x;
        Y = P.y;

    }

    public void setX(int newX) {
        X = newX;
        P.x = newX;

    }

    public Point returnOld() {
        return oldP;
    }

    public void setPixels(int newpixelX, int newpixelY) {
        pixelPoint.x = newpixelX;
        pixelPoint.y = newpixelY;
    }

    public int getPixelX() {
        return pixelX;
    }

    public void toOld(Point Old) {
        P.x = Old.x;
        P.y = Old.y;
    }

    public int getPixelY() {
        return pixelY;
    }

    public Point getPixelPoint() {
        return pixelPoint;
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

    public boolean canMove(int x, int y) {
        int j = y;
        int i = x;
        if ((x - y) == (X - Y)) {
            return true;

        } else if ((x + y) == (X + Y)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPieceInMyWay(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;
        if ((x - y) == (X - Y)) {
            if (x > X && y > Y) {
                while ((j != Y + 1) && (i != X + 1)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if (x < X && y < Y) {
                while ((j != Y - 1) && (i != X - 1)) {
                    j++;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }

                }
            }
        } else if (((x + y)) == ((X + Y))) {
            if ((X < i) && (Y > j)) {
                while (((j != Y - 1)) && ((i != X + 1))) {
                    j++;
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((X > i) && (Y < j)) {
                while ((j != X + 1) && (i != X - 1)) {
                    j--;
                    i++;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkKing(int x, int y, Point othersPostion) {
        int j = y;
        int i = x;

        if ((x - y) == (X - Y)) {
            if (x > X && y > Y) {
                while ((j != Y) && (i != X)) {
                    j--;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if (x < X && y < Y) {
                while ((j != Y) && (i != X)) {
                    j++;
                    i++;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            }
        } else if (((x + y)) == ((X + Y))) {
            if ((X < i) && (Y > j)) {
                while (((j != Y)) && ((i != X))) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((X > i) && (Y < j)) {
                while ((j != X) && (i != X)) {
                    j--;
                    i++;

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
        return "Tuong = (" + P.x + ',' + P.y + ")";
    }

}
