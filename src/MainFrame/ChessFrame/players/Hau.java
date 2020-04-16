package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;

public class Hau {

    //Xay dung quan hau
    private int X, Y;
    private Point pixelPoint = new Point();
    private int pixelX, pixelY;
    private boolean isAlive = true;
    private Icon pieceIcon;
    private Point P = new Point();
    private Point oldP = new Point();

    public Hau(String nameIcon, int startX, int startY) {
        pieceIcon = new Icon(nameIcon);

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

    public Point getpixelPoint() {
        return pixelPoint;
    }

    public int returnY() {
        return Y;
    }

    public void setPoint(Point newPoint) {
        oldP.x = P.x;
        oldP.y = P.y;
        X = P.x = newPoint.x;
        Y = P.y = newPoint.y;
    }

    public void setX(int newX) {
        X = newX;
        P.x = X;
    }

    public Point returnOld() {
        return oldP;
    }

    public void setY(int newY) {
        Y = newY;
        P.y = Y;
    }

    public void toOld(Point Old) {
        P.x = Old.x;
        P.y = Old.y;
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
        if (((y == Y) && (x > (X) || (x < X)))) {
            return true;
        } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
            return true;
        } else if ((x - y) == (X - Y)) {
            return true;
        } else if ((x + y) == (X + Y)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPieceInMYway(int x, int y, Point othersPostion) {
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
        } else if ((x - y) == (X - Y)) {
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
        } else if ((x + y) == (X + Y)) {
            if ((X < i) && (Y > j)) {
                while ((j != Y - 1) && (i != X + 1)) {
                    j++;
                    i--;

                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((X > i) && (Y < j)) {
                while ((j != Y + 1) && (i != X - 1)) {
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
        } else if ((x - y) == (X - Y)) {
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
        } else if ((x + y) == (X + Y)) {
            if ((X < i) && (Y > j)) {
                while ((j != Y) && (i != X)) {
                    j++;
                    i--;
                    if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
                        return true;
                    }
                }
            } else if ((X > i) && (Y < j)) {
                while ((j != Y) && (i != X)) {
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
        return "Hau = (" + P.x + ',' + P.y + ")";
    }

}
