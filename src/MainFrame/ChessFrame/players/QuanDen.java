package MainFrame.ChessFrame.players;
//Xem ky

import java.awt.Image;
import java.awt.Point;
import java.util.Enumeration;

public class QuanDen implements Enumeration {

    public Xe XeDen1;
    public Xe XeDen2;
    public Ma MaDen1;
    public Ma MaDen2;
    public Tuong TuongDen1;
    public Tuong TuongDen2;
    public Hau HauDen;
    private Vua VuaDen;
    public Tot[] TotDen = new Tot[8];
    private int daDuocChon;
    private int dangDuocChon = -1;
    private boolean laVuaBiChieu = false;
    private Point khac;
    private int anDeBaoVeVua;

    private String Color = "black";

    public QuanDen() {
        String fileSeparator = new String(System.getProperty("file.separator"));
        XeDen1 = new Xe("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bc.png", 1, 1);
        XeDen2 = new Xe("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bc.png", 8, 1);
        MaDen1 = new Ma("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bh.png", 2, 1);
        MaDen2 = new Ma("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bh.png", 7, 1);
        TuongDen1 = new Tuong("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bb.png", 3, 1);
        TuongDen2 = new Tuong("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bb.png", 6, 1);
        HauDen = new Hau("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bq.png", 4, 1);
        VuaDen = new Vua("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bk.png", 5, 1);
        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            TotDen[i] = new Tot("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator + "bp.png", j, 2);
        }
    }

    public void setChoosen(int newChoosen) {
        daDuocChon = newChoosen;
    }

    public Point returnPosition(int i) {
        switch (i) {
            case 1:
                return XeDen1.returnPosition();
            case 2:
                return XeDen2.returnPosition();
            case 3:
                return MaDen1.returnPosition();
            case 4:
                return MaDen2.returnPosition();
            case 5:
                return TuongDen1.returnPosition();
            case 6:
                return TuongDen2.returnPosition();
            case 7:
                return HauDen.returnPosition();
            case 8:
                return VuaDen.returnPosition();
            case 9:
                return TotDen[0].returnPosition();
            case 10:
                return TotDen[1].returnPosition();
            case 11:
                return TotDen[2].returnPosition();
            case 12:
                return TotDen[3].returnPosition();
            case 13:
                return TotDen[4].returnPosition();
            case 14:
                return TotDen[5].returnPosition();
            case 15:
                return TotDen[6].returnPosition();
            case 16:
                return TotDen[7].returnPosition();

        }
        return new Point(-1, -1);

    }

    public Point returnOldPosition(int i) {
        switch (i) {
            case 1:
                return XeDen1.returnOld();
            case 2:
                return XeDen2.returnOld();
            case 3:
                return MaDen1.returnOld();
            case 4:
                return MaDen2.returnOld();
            case 5:
                return TuongDen1.returnOld();
            case 6:
                return TuongDen2.returnOld();
            case 7:
                return HauDen.returnOld();
            case 8:
                return VuaDen.returnOld();
            case 9:
                return TotDen[0].returnOld();
            case 10:
                return TotDen[1].returnOld();
            case 11:
                return TotDen[2].returnOld();
            case 12:
                return TotDen[3].returnOld();
            case 13:
                return TotDen[4].returnOld();
            case 14:
                return TotDen[5].returnOld();
            case 15:
                return TotDen[6].returnOld();
            case 16:
                return TotDen[7].returnOld();

        }
        return new Point(-1, -1);
    }

    public Image returnIconImage(int i) {
        switch (i) {
            case 1:
                return XeDen1.returnPieceImage();
            case 2:
                return XeDen2.returnPieceImage();
            case 3:
                return MaDen1.returnPieceImage();
            case 4:
                return MaDen2.returnPieceImage();
            case 5:
                return TuongDen1.returnPieceImage();
            case 6:
                return TuongDen2.returnPieceImage();
            case 7:
                return HauDen.returnPieceImage();
            case 8:
                return VuaDen.returnPieceImage();
            case 9:
                return TotDen[0].returnPieceImage();
            case 10:
                return TotDen[1].returnPieceImage();
            case 11:
                return TotDen[2].returnPieceImage();
            case 12:
                return TotDen[3].returnPieceImage();
            case 13:
                return TotDen[4].returnPieceImage();
            case 14:
                return TotDen[5].returnPieceImage();
            case 15:
                return TotDen[6].returnPieceImage();
            case 16:
                return TotDen[7].returnPieceImage();
        }
        return null;
    }

    public void changePosition(Point newPoint, int i) {
        switch (i) {
            case 1:
                XeDen1.setPoint(newPoint);
                break;
            case 2:
                XeDen2.setPoint(newPoint);
                break;
            case 3:
                MaDen1.setPoint(newPoint);
                break;
            case 4:
                MaDen2.setPoint(newPoint);
                break;
            case 5:
                TuongDen1.setPoint(newPoint);
                break;
            case 6:
                TuongDen2.setPoint(newPoint);
                break;
            case 7:
                HauDen.setPoint(newPoint);
                break;
            case 8:
                VuaDen.setPoint(newPoint);
                break;
            case 9:
                TotDen[0].setPoint(newPoint);
                break;
            case 10:
                TotDen[1].setPoint(newPoint);
                break;
            case 11:
                TotDen[2].setPoint(newPoint);
                break;
            case 12:
                TotDen[3].setPoint(newPoint);
                break;
            case 13:
                TotDen[4].setPoint(newPoint);
                break;
            case 14:
                TotDen[5].setPoint(newPoint);
                break;
            case 15:
                TotDen[6].setPoint(newPoint);
                break;
            case 16:
                TotDen[7].setPoint(newPoint);
                break;
        }
    }

    public void changePositionToOld(Point newPoint, int i) {
        switch (i) {
            case 1:
                XeDen1.toOld(newPoint);
                break;
            case 2:
                XeDen2.toOld(newPoint);
                break;
            case 3:
                MaDen1.toOld(newPoint);
                break;
            case 4:
                MaDen2.toOld(newPoint);
                break;
            case 5:
                TuongDen1.toOld(newPoint);
                break;
            case 6:
                TuongDen2.toOld(newPoint);
                break;
            case 7:
                HauDen.toOld(newPoint);
                break;
            case 8:
                VuaDen.toOld(newPoint);
                break;
            case 9:
                TotDen[0].toOld(newPoint);
                break;
            case 10:
                TotDen[1].toOld(newPoint);
                break;
            case 11:
                TotDen[2].toOld(newPoint);
                break;
            case 12:
                TotDen[3].toOld(newPoint);
                break;
            case 13:
                TotDen[4].toOld(newPoint);
                break;
            case 14:
                TotDen[5].toOld(newPoint);
                break;
            case 15:
                TotDen[6].toOld(newPoint);
                break;
            case 16:
                TotDen[7].toOld(newPoint);
                break;
        }
    }

    public void changePixel(int newPixelX, int newPixelY) {
        switch (daDuocChon) {
            case 1:
                XeDen1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                XeDen2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                MaDen1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                MaDen2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                TuongDen1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                TuongDen2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                HauDen.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                VuaDen.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                TotDen[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                TotDen[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                TotDen[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                TotDen[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                TotDen[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                TotDen[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                TotDen[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                TotDen[7].setPixels(newPixelX, newPixelY);
                break;
        }
    }

    public Point getPixelPoint(int i) {
        daDuocChon = i;
        switch (daDuocChon) {
            case 1:
                return XeDen1.getPixelPoint();
            case 2:
                return XeDen2.getPixelPoint();
            case 3:
                return MaDen1.getPixelPoint();
            case 4:
                return MaDen2.getPixelPoint();
            case 5:
                return TuongDen1.getPixelPoint();
            case 6:
                return TuongDen2.getPixelPoint();
            case 7:
                return HauDen.getpixelPoint();
            case 8:
                return VuaDen.getPixelPoint();
            case 9:
                return TotDen[0].getPixelPoint();
            case 10:
                return TotDen[1].getPixelPoint();
            case 11:
                return TotDen[2].getPixelPoint();
            case 12:
                return TotDen[3].getPixelPoint();
            case 13:
                return TotDen[4].getPixelPoint();
            case 14:
                return TotDen[5].getPixelPoint();
            case 15:
                return TotDen[6].getPixelPoint();
            case 16:
                return TotDen[7].getPixelPoint();
        }
        return null;
    }

    public void changePixel(int newPixelX, int newPixelY, int i) {
        daDuocChon = i;
        switch (daDuocChon) {
            case 1:
                XeDen1.setPixels(newPixelX, newPixelY);
                break;
            case 2:
                XeDen2.setPixels(newPixelX, newPixelY);
                break;
            case 3:
                MaDen1.setPixels(newPixelX, newPixelY);
                break;
            case 4:
                MaDen2.setPixels(newPixelX, newPixelY);
                break;
            case 5:
                TuongDen1.setPixels(newPixelX, newPixelY);
                break;
            case 6:
                TuongDen2.setPixels(newPixelX, newPixelY);
                break;
            case 7:
                HauDen.setPixels(newPixelX, newPixelY);
                break;
            case 8:
                VuaDen.setPixels(newPixelX, newPixelY);
                break;
            case 9:
                TotDen[0].setPixels(newPixelX, newPixelY);
                break;
            case 10:
                TotDen[1].setPixels(newPixelX, newPixelY);
                break;
            case 11:
                TotDen[2].setPixels(newPixelX, newPixelY);
                break;
            case 12:
                TotDen[3].setPixels(newPixelX, newPixelY);
                break;
            case 13:
                TotDen[4].setPixels(newPixelX, newPixelY);
                break;
            case 14:
                TotDen[5].setPixels(newPixelX, newPixelY);
                break;
            case 15:
                TotDen[6].setPixels(newPixelX, newPixelY);
                break;
            case 16:
                TotDen[7].setPixels(newPixelX, newPixelY);
                break;
        }
    }

    public boolean killPiece(int i) {
        Point out = new Point(20, 20);
        switch (i) {
            case 1:
                XeDen1.setPoint(out);
                return true;
            case 2:
                XeDen2.setPoint(out);
                return true;
            case 3:
                MaDen1.setPoint(out);
                return true;
            case 4:
                MaDen2.setPoint(out);
                return true;
            case 5:
                TuongDen1.setPoint(out);
                return true;
            case 6:
                TuongDen2.setPoint(out);
                return true;
            case 7:
                HauDen.setPoint(out);
                return true;
            case 8:
                return true;// Quan vua khong bao gio bi an
            case 9:
                TotDen[0].setPoint(out);
                return true;
            case 10:
                TotDen[1].setPoint(out);
                return true;
            case 11:
                TotDen[2].setPoint(out);
                return true;
            case 12:
                TotDen[3].setPoint(out);
                return true;
            case 13:
                TotDen[4].setPoint(out);
                return true;
            case 14:
                TotDen[5].setPoint(out);
                return true;
            case 15:
                TotDen[6].setPoint(out);
                return true;
            case 16:
                TotDen[7].setPoint(out);
                return true;
        }
        return false;
    }

    public boolean checkTheMove(Point newP, int i) {
        daDuocChon = i;
        switch (daDuocChon) {

            case 1:
                return XeDen1.canMove(newP.x, newP.y);
            case 2:
                return XeDen2.canMove(newP.x, newP.y);
            case 3:
                return MaDen1.canMove(newP.x, newP.y);
            case 4:
                return MaDen2.canMove(newP.x, newP.y);
            case 5:
                return TuongDen1.canMove(newP.x, newP.y);
            case 6:
                return TuongDen2.canMove(newP.x, newP.y);
            case 7:
                return HauDen.canMove(newP.x, newP.y);
            case 8:
                return VuaDen.canMove(newP.x, newP.y);
            case 9:
                return TotDen[0].canMove(newP.x, newP.y, Color);
            case 10:
                return TotDen[1].canMove(newP.x, newP.y, Color);
            case 11:
                return TotDen[2].canMove(newP.x, newP.y, Color);
            case 12:
                return TotDen[3].canMove(newP.x, newP.y, Color);
            case 13:
                return TotDen[4].canMove(newP.x, newP.y, Color);
            case 14:
                return TotDen[5].canMove(newP.x, newP.y, Color);
            case 15:
                return TotDen[6].canMove(newP.x, newP.y, Color);
            case 16:
                return TotDen[7].canMove(newP.x, newP.y, Color);
        }
        return false;
    }

    public boolean setSeenToSiliders(int i, Point P) {
        switch (i) {
            case 9:
                return TotDen[0].setSeenByChecking(P, "black");
            case 10:
                return TotDen[1].setSeenByChecking(P, "black");
            case 11:
                return TotDen[2].setSeenByChecking(P, "black");
            case 12:
                return TotDen[3].setSeenByChecking(P, "black");
            case 13:
                return TotDen[4].setSeenByChecking(P, "black");
            case 14:
                return TotDen[5].setSeenByChecking(P, "black");
            case 15:
                return TotDen[6].setSeenByChecking(P, "black");
            case 16:
                return TotDen[7].setSeenByChecking(P, "black");
        }
        return false;
    }

    public boolean returnSoliderSeen(int i) {
        switch (i) {

            case 9:
                return TotDen[0].returnMyseen();
            case 10:
                return TotDen[1].returnMyseen();
            case 11:
                return TotDen[2].returnMyseen();
            case 12:
                return TotDen[3].returnMyseen();
            case 13:
                return TotDen[4].returnMyseen();
            case 14:
                return TotDen[5].returnMyseen();
            case 15:
                return TotDen[6].returnMyseen();
            case 16:
                return TotDen[7].returnMyseen();
        }
        return false;
    }

    public boolean checkTheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {
            case 1:
                return XeDen1.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 2:
                return XeDen2.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 5:
                return TuongDen1.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 6:
                return TuongDen2.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 7:
                return HauDen.isPieceInMYway(newP.x, newP.y, postionFromOthers);
            case 9:
                return TotDen[0].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 10:
                return TotDen[1].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 11:
                return TotDen[2].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 12:
                return TotDen[3].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 13:
                return TotDen[4].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 14:
                return TotDen[5].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 15:
                return TotDen[6].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 16: {
                return TotDen[7].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            }
        }
        return false;
    }

    public boolean checkKing(Point p1, Point p2, int i) {
        switch (i) {

            case 1:
                return XeDen1.checkKing(p1.x, p1.y, p2);
            case 2:
                return XeDen2.checkKing(p1.x, p1.y, p2);
            case 3:
                return MaDen1.canMove(p1.x, p1.y);
            case 4:
                return MaDen2.canMove(p1.x, p1.y);
            case 5:
                return TuongDen1.checkKing(p1.x, p1.y, p2);
            case 6:
                return TuongDen2.checkKing(p1.x, p1.y, p2);
            case 7:
                return HauDen.checkKing(p1.x, p1.y, p2);

            case 9:
                return TotDen[0].canMove(p1.x, p1.y, Color);
            case 10:
                return TotDen[1].canMove(p1.x, p1.y, Color);
            case 11:
                return TotDen[2].canMove(p1.x, p1.y, Color);
            case 12:
                return TotDen[3].canMove(p1.x, p1.y, Color);
            case 13:
                return TotDen[4].canMove(p1.x, p1.y, Color);
            case 14:
                return TotDen[5].canMove(p1.x, p1.y, Color);
            case 15:
                return TotDen[6].canMove(p1.x, p1.y, Color);
            case 16:
                return TotDen[7].canMove(p1.x, p1.y, Color);
        }
        return false;
    }

    public int returnChosen() {
        return daDuocChon;
    }

    public void setInHand(int i) {
        dangDuocChon = i;
    }

    public int getInhand() {
        return dangDuocChon;
    }

    public boolean CanMove(int x, int y) {
        return true;
    }

    public void checkKing(boolean newkingcheck) {
        laVuaBiChieu = newkingcheck;
    }

    public boolean returnCheckKing() {
        return laVuaBiChieu;
    }

    public boolean seeKingCheck(QuanTrang White) {
        Point My_King_Postion = VuaDen.returnPosition();
        boolean flag = false;

        for (int i = 17; i < 33; i++) {
            if (i < 25) {
                if (White.checkTheMove(My_King_Postion, i)) {
                    flag = true;
                    for (int j = 1; j < 33; j++) {
                        if (j < 17) {
                            if (White.checkTheWay(My_King_Postion, returnPosition(j), i)) {

                                flag = false;
                            }
                        } else {
                            if (j != 8) {
                                if (White.checkTheWay(My_King_Postion, White.returnPosition(j), i)) {
                                    flag = false;

                                }
                            }
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            } else {

                if (White.setSeentoSiliders(i, My_King_Postion)) {
                    break;
                }
            }

            if (i == 32) {
                return false;
            }
        }
        return true;
    }

    public boolean checkMateGAMEOVER(QuanTrang Enemy) {
        if (!generateKingMoves(Enemy)) {
            dangDuocChon = -1;
            System.out.println("I Killed King  2");
            return false;
        } else if (!generateCastleMoves(Enemy, XeDen1)) {
            dangDuocChon = -1;
            System.out.println("I Killed Castle 2");
            return false;
        } else if (!generateCastleMoves(Enemy, XeDen2)) {
            dangDuocChon = -1;
            System.out.println("I Killed Castle 2");
            return false;
        } else if (!generateElephantMoves(Enemy, TuongDen1)) {
            dangDuocChon = -1;
            System.out.println("I Killed ELephent2");
            return false;
        } else if (!generateElephantMoves(Enemy, TuongDen2)) {
            dangDuocChon = -1;
            System.out.println("I Killed ELephent2");
            return false;
        } else if (!generateHorseMoves(Enemy, MaDen1)) {
            dangDuocChon = -1;
            System.out.println("I Killed Horse 2");
            return false;
        } else if (!generateHorseMoves(Enemy, MaDen2)) {
            dangDuocChon = -1;
            System.out.println("I Killed Horse 2");
            return false;
        } else if (!generateQueenMoves(Enemy)) {
            dangDuocChon = -1;
            System.out.println("I Killed Queen 2");
            return false;
        }
        for (int i = 0; i <= 7; i++) {
            dangDuocChon = 9 + i;
            if (!generateSoldierMoves(Enemy, TotDen[i])) {
                dangDuocChon = -1;
                System.out.println("I Killed Solider 2");
                return false;
            }
        }
        dangDuocChon = -1;
        return true;
    }

    public boolean isPieceAlreadyThere(Point newP) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            if (getInhand() != i) {
                samePostion = returnPosition(i);
                if (newP.x == samePostion.x && newP.y == samePostion.y) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isPieceAlreadyThereFromEnemy(Point newP, QuanTrang enemy) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {

            samePostion = enemy.returnPosition(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {
                return false;
            }
        }
        return true;
    }

    public int getPieceAlreadyThereFromEnemy(Point newP, QuanTrang enemy) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {
            samePostion = enemy.returnPosition(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {
                return i;
            }
        }
        return -1;
    }

    public boolean generateKingMoves(QuanTrang enemy) {
        boolean isSomethingKilled = false;
        Point Oldp = new Point();

        Point placeCheck = new Point();
        dangDuocChon = 8;

        int x = VuaDen.returnX();
        int y = VuaDen.returnY();

        Oldp.x = x;
        Oldp.y = y;

        if (x + 1 <= 8) {
            VuaDen.setX(x + 1);
            VuaDen.setY(y);
            placeCheck.x = x + 1;
            placeCheck.y = y;

            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    VuaDen.setPoint(Oldp);
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    return false;
                }
            }
        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y + 1 <= 8) {

            VuaDen.setX(x);
            VuaDen.setY(y + 1);
            placeCheck.x = x;
            placeCheck.y = y + 1;
            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    VuaDen.setPoint(Oldp);
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    return false;
                }
            }
        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }

        if (y - 1 > 0) {
            VuaDen.setX(x);
            VuaDen.setY(y - 1);

            placeCheck.x = x;
            placeCheck.y = y - 1;

            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    VuaDen.setPoint(Oldp);
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    return false;
                }
            }
        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (x - 1 > 0) {
            VuaDen.setX(x - 1);
            VuaDen.setY(y);

            placeCheck.x = x - 1;
            placeCheck.y = y;
            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    VuaDen.setPoint(Oldp);
                    return false;
                }
            }
        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {
            VuaDen.setX(x - 1);
            VuaDen.setY(y - 1);

            placeCheck.x = x - 1;
            placeCheck.y = y - 1;

            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    VuaDen.setPoint(Oldp);
                    return false;
                }
            }

        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {
            VuaDen.setX(x + 1);
            VuaDen.setY(y + 1);

            placeCheck.x = x + 1;
            placeCheck.y = y + 1;
            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    VuaDen.setPoint(Oldp);
                    return false;
                }
            }
        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            VuaDen.setX(x + 1);
            VuaDen.setY(y - 1);

            placeCheck.x = x + 1;
            placeCheck.y = y - 1;
            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    VuaDen.setPoint(Oldp);
                    return false;
                }
            }
        }
        VuaDen.setPoint(Oldp);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {
            VuaDen.setX(x - 1);
            VuaDen.setY(y + 1);

            placeCheck.x = x - 1;
            placeCheck.y = y + 1;
            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    VuaDen.setPoint(Oldp);
                    return false;
                }
            }
        }
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }

        VuaDen.setPoint(Oldp);
        return true;
    }

    public boolean generateCastleMoves(QuanTrang enemy, Xe BC) {
        boolean isSomethingKilled = false;
        Point oldP = new Point();

        Point placeCheck = new Point();
        int x1 = BC.returnX();
        int y1 = BC.returnY();

        if (BC == XeDen1) {
            dangDuocChon = 1;
        } else {
            dangDuocChon = 2;
        }

        oldP.x = x1;
        oldP.y = y1;

        placeCheck.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {
                BC.setX(i);
                placeCheck.x = i;

                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }

                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            BC.setX(oldP.x);
                            BC.setY(oldP.y);

                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            return false;
                        }
                    }
                }

                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }

            }
            BC.setX(oldP.x);
            placeCheck.x = oldP.x;

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }
            for (int i = 1; i <= 8; i++) {
                BC.setY(i);
                placeCheck.y = i;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            BC.setX(oldP.x);
                            BC.setY(oldP.y);

                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            return false;
                        }
                    }
                }

                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }

            }
            BC.setY(oldP.y);
        }

        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        BC.setX(oldP.x);
        BC.setY(oldP.y);
        return true;
    }

    public boolean generateElephantMoves(QuanTrang enemy, Tuong BE) {
        boolean isSomethingKilled = false;
        Point oldP = new Point();
        Point placeCheck = new Point();

        oldP = BE.returnPosition();

        if (BE == TuongDen1) {
            dangDuocChon = 5;
        } else {
            dangDuocChon = 6;
        }

        if (oldP.x != 20) {
            for (int x = oldP.x, y = oldP.y; x >= 1 && y <= 8; x--, y++) {

                BE.setX(x);
                BE.setY(y);
                placeCheck.x = x;
                placeCheck.y = y;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {

                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            BE.setPoint(oldP);
                            return false;
                        }
                    }
                }

                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }

            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }
            for (int x = oldP.x, y = oldP.y; y >= 1 && x <= 8; x++, y--) {

                BE.setX(x);
                BE.setY(y);
                placeCheck.x = x;
                placeCheck.y = y;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            BE.setPoint(oldP);
                            return false;
                        }
                    }
                }
                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }
            }
            BE.setPoint(oldP);
        }
        BE.setPoint(oldP);

        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        return true;
    }

    public boolean generateHorseMoves(QuanTrang enemy, Ma BH) {
        Point oldP = new Point();
        boolean isSomethingKilled = false;
        oldP = BH.returnPosition();

        Point placeCheck = new Point();

        if (BH == MaDen1) {
            dangDuocChon = 3;
        } else {
            dangDuocChon = 4;
        }

        int x = oldP.x;
        int y = oldP.y;

        if (x != 20) {
            if (x + 1 <= 8 && y + 1 <= 8) {
                BH.setX(x + 1);
                BH.setY(y + 2);
                placeCheck.x = x + 1;
                placeCheck.y = y + 2;

                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        BH.setPoint(oldP);

                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }

                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x + 1 <= 8 && y - 2 >= 1) {
                BH.setX(x + 1);
                BH.setY(y - 2);
                placeCheck.x = x + 1;
                placeCheck.y = y - 2;
                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                BH.setX(x + 2);
                BH.setY(y + 1);
                placeCheck.x = x + 2;
                placeCheck.y = y + 1;

                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                BH.setX(x + 2);
                BH.setY(y - 1);
                placeCheck.x = x + 2;
                placeCheck.y = y - 1;
                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                BH.setX(x - 1);
                BH.setY(y + 2);
                placeCheck.x = x - 1;
                placeCheck.y = y + 2;

                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                BH.setX(x - 1);
                BH.setY(y - 2);
                placeCheck.x = x - 1;
                placeCheck.y = y - 2;
                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                BH.setX(x - 2);
                BH.setY(y + 1);
                placeCheck.x = x - 2;
                placeCheck.y = y + 1;

                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }
                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                BH.setX(x - 2);
                BH.setY(y - 1);
                placeCheck.x = x - 2;
                placeCheck.y = y - 1;

                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        if (isSomethingKilled) {
                            enemy.changePosition(khac, anDeBaoVeVua);
                            isSomethingKilled = false;
                        }
                        BH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

        }
        BH.setPoint(oldP);
        return true;
    }

    public boolean generateQueenMoves(QuanTrang enemy) {
        boolean isSomethingKilled = false;

        Point oldP = new Point();

        oldP = HauDen.returnPosition();

        Point placeCheck = new Point();

        dangDuocChon = 7;

        if (oldP.x != 20) {
            for (int x = oldP.x, y = oldP.y; x >= 1 && y <= 8; x--, y++) {

                HauDen.setX(x);
                HauDen.setY(y);
                placeCheck.x = x;
                placeCheck.y = y;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }

                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauDen.setPoint(oldP);

                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            return false;
                        }
                    }
                }
                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }
            for (int x = oldP.x, y = oldP.y; y >= 1 && x <= 8; x++, y--) {
                HauDen.setX(x);
                HauDen.setY(y);
                placeCheck.x = x;
                placeCheck.y = y;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauDen.setPoint(oldP);
                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            return false;
                        }
                    }
                }
                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }
            }
            HauDen.setPoint(oldP);
            placeCheck.x = oldP.x;
            placeCheck.y = oldP.y;

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            for (int i = 1; i <= 8; i++) {
                HauDen.setX(i);

                placeCheck.x = i;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauDen.setX(oldP.x);
                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            return false;
                        }
                    }
                }
                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }
            }
            HauDen.setX(oldP.x);
            placeCheck.x = oldP.x;

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            for (int i = 1; i <= 8; i++) {
                HauDen.setY(i);
                placeCheck.y = i;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauDen.setY(oldP.y);
                            if (isSomethingKilled) {
                                enemy.changePosition(khac, anDeBaoVeVua);
                                isSomethingKilled = false;
                            }
                            return false;
                        }
                    }
                }
                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }
            }
            HauDen.setY(oldP.y);
        }
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        return true;
    }

    public boolean generateSoldierMoves(QuanTrang enemy, Tot Sold) {
        Point oldP = new Point();
        oldP = Sold.returnPosition();
        Point placeCheck = new Point();
        placeCheck.x = oldP.x;
        placeCheck.y = oldP.y;

        if (oldP.x != 20) {
            if (Sold.canMove(oldP.x, oldP.y + 2, Color) && oldP.y + 2 >= 1) {
                Sold.setY(oldP.y + 2);

                placeCheck.y = oldP.y + 2;

                if (isPieceAlreadyThere(placeCheck)) {
                    if (isPieceAlreadyThereFromEnemy(placeCheck, enemy)) {
                        if (!seeKingCheck(enemy)) {

                            Sold.setPoint(oldP);
                            return false;
                        }
                    }
                }
            }
            if (Sold.canMove(oldP.x, oldP.y + 1, Color) && oldP.y + 1 >= 1) {
                Sold.setY(oldP.y + 1);
                placeCheck.y = oldP.y + 1;

                if (isPieceAlreadyThere(placeCheck)) {
                    if (isPieceAlreadyThereFromEnemy(placeCheck, enemy)) {
                        if (!seeKingCheck(enemy)) {
                            Sold.setPoint(oldP);

                            return false;
                        }
                    }
                }
            }

            if (isPieceAlreadyThereFromEnemy(new Point(oldP.x - 1, oldP.y + 1), enemy)) {
                if (killToProtectKing(enemy, new Point(oldP.x - 1, oldP.y + 1))) {

                    if (!seeKingCheck(enemy)) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        Sold.setPoint(oldP);
                        return false;
                    }
                    enemy.changePosition(khac, anDeBaoVeVua);
                }
            }

            if (!isPieceAlreadyThereFromEnemy(new Point(oldP.x + 1, oldP.y + 1), enemy)) {
                if (killToProtectKing(enemy, new Point(oldP.x + 1, oldP.y + 1))) {
                    if (!seeKingCheck(enemy)) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        Sold.setPoint(oldP);

                        return false;
                    }
                    enemy.changePosition(khac, anDeBaoVeVua);

                }
            }
        }

        Sold.setPoint(oldP);
        return true;
    }

    public boolean checkTheWayToPosition(QuanTrang enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            if (dangDuocChon != i)// check if there is peices in the WAY
            {
                if (i < 17) {
                    flag = checkTheWay(newP, enemy.returnPosition(i), dangDuocChon);//Means there is somting in the Way so can't move
                } else {
                    flag = checkTheWay(newP, returnPosition(i), dangDuocChon);
                }

                if (flag == true) {
                    return false;
                }//Means  there is a Pice in the Way
            }
        }
        return true;
    }

    public boolean killToProtectKing(QuanTrang enemy, Point newP) {
        for (int i = 17; i <= 32; i++) {
            khac = enemy.returnPosition(i);
            if (khac.x == newP.x && khac.y == newP.y) {
                anDeBaoVeVua = i;
                enemy.killPiece(i);
                return true;
            }
        }

        return false;
    }

    public boolean hasMoreElements() {
        return false;
    }

    public Object nextElement() {
        return new Object();
    }

    public String tellMeAboutLastMove() {
        switch (dangDuocChon) {
            case 1:
                return XeDen1.tellMe();
            case 2:
                return XeDen2.tellMe();
            case 3:
                return MaDen1.tellMe();
            case 4:
                return MaDen2.tellMe();
            case 5:
                return TuongDen1.tellMe();
            case 6:
                return TuongDen2.tellMe();
            case 7:
                return HauDen.tellMe();
            case 8:
                return VuaDen.tellMe();
            case 9:
                return TotDen[0].tellMe();
            case 10:
                return TotDen[1].tellMe();
            case 11:
                return TotDen[2].tellMe();
            case 12:
                return TotDen[3].tellMe();
            case 13:
                return TotDen[4].tellMe();
            case 14:
                return TotDen[5].tellMe();
            case 15:
                return TotDen[6].tellMe();
            case 16:
                return TotDen[7].tellMe();
        }
        return null;
    }

}
