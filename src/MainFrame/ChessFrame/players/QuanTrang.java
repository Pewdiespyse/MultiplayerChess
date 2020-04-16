package MainFrame.ChessFrame.players;
//////Xem ky

import java.awt.Image;
import java.awt.Point;

//Xay dung nguoi choi 1
public class QuanTrang {

    //Cac quan co
    public Xe XeTrang1;
    public Xe XeTrang2;
    public Ma MaTrang1;
    public Ma MaTrang2;
    public Hau HauTrang;
    public Tuong TuongTrang1;
    public Tuong TuongTrang2;
    public Tot[] TotTrang = new Tot[8];
    public Vua VuaTrang;
    //Thong tin nguoi choi
    private int dangDuocChon = -1; //Quan trang dang duoc chon de di
    private boolean laVuaBiChieu = false; //Bi chieu
    private int daDuocChon; //Quan da duoc chon de di
    String Color = "white"; //Quan mau trang
    private Point khac; //
    int anDeBaoVeVua; //

    public QuanTrang() {
        //Khoi tao cac quan co cua nguoi choi 1
        String fileSeparator = new String(System.getProperty("file.separator"));
        XeTrang1 = new Xe("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wc.png", 8, 8);
        XeTrang2 = new Xe("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wc.png", 1, 8);
        MaTrang1 = new Ma("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wh.png", 2, 8);
        MaTrang2 = new Ma("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wh.png", 7, 8);
        TuongTrang1 = new Tuong("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wb.png", 3, 8);
        TuongTrang2 = new Tuong("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wb.png", 6, 8);
        HauTrang = new Hau("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wq.png", 4, 8);
        VuaTrang = new Vua("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wk.png", 5, 8);
        int j = 1;
        for (int i = 0; i <= 7; i++, j++) {
            TotTrang[i] = new Tot("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" + fileSeparator + "wp.png", j, 7);
        }
    }

    //Tra ve vi tri bat ky quan nao cua ben trang
    public Point returnPosition(int i) {
        switch (i) {
            case 17:
                return XeTrang1.returnPosition();
            case 18:
                return XeTrang2.returnPosition();
            case 19:
                return MaTrang1.returnPosition();
            case 20:
                return MaTrang2.returnPosition();
            case 21:
                return TuongTrang1.returnPosition();
            case 22:
                return TuongTrang2.returnPosition();
            case 23:
                return HauTrang.returnPosition();
            case 24:
                return VuaTrang.returnPosition();
            case 25:
                return TotTrang[0].returnPosition();
            case 26:
                return TotTrang[1].returnPosition();
            case 27:
                return TotTrang[2].returnPosition();
            case 28:
                return TotTrang[3].returnPosition();
            case 29:
                return TotTrang[4].returnPosition();
            case 30:
                return TotTrang[5].returnPosition();
            case 31:
                return TotTrang[6].returnPosition();
            case 32:
                return TotTrang[7].returnPosition();
        }
        return new Point(-1, -1);
    }

    //Tra ve vi tri cu cua bat ky quan nao cua quan trang
    public Point returnOldPosition(int i) {

        switch (i) {
            case 17:
                return XeTrang1.returnOld();
            case 18:
                return XeTrang2.returnOld();
            case 19:
                return MaTrang1.returnOld();
            case 20:
                return MaTrang2.returnOld();
            case 21:
                return TuongTrang1.returnOld();
            case 22:
                return TuongTrang2.returnOld();
            case 23:
                return HauTrang.returnOld();
            case 24:
                return VuaTrang.returnOld();
            case 25:
                return TotTrang[0].returnOld();
            case 26:
                return TotTrang[1].returnOld();
            case 27:
                return TotTrang[2].returnOld();
            case 28:
                return TotTrang[3].returnOld();
            case 29:
                return TotTrang[4].returnOld();
            case 30:
                return TotTrang[5].returnOld();
            case 31:
                return TotTrang[6].returnOld();
            case 32:
                return TotTrang[7].returnOld();
        }
        return new Point(-1, -1);
    }

    //Tra ve icon cua bat ky quan nao cua quan trang
    public Image returnIconImage(int i) {

        switch (i) {

            case 17: {
                return XeTrang1.returnPieceImage();
            }
            case 18: {
                return XeTrang2.returnPieceImage();
            }
            case 19: {
                return MaTrang1.returnPieceImage();
            }
            case 20: {
                return MaTrang2.returnPieceImage();
            }
            case 21:
                return TuongTrang1.returnPieceImage();
            case 22:
                return TuongTrang2.returnPieceImage();
            case 23:
                return HauTrang.returnPieceImage();
            case 24:
                return VuaTrang.returnPieceImage();
            case 25:
                return TotTrang[0].returnPieceImage();
            case 26:
                return TotTrang[1].returnPieceImage();
            case 27:
                return TotTrang[2].returnPieceImage();
            case 28:
                return TotTrang[3].returnPieceImage();
            case 29:
                return TotTrang[4].returnPieceImage();
            case 30:
                return TotTrang[5].returnPieceImage();
            case 31:
                return TotTrang[6].returnPieceImage();
            case 32:
                return TotTrang[7].returnPieceImage();
        }
        return null;
    }

    //Doi bat ky quan co cua ben trang den vi tri newPoint
    public void changePosition(Point newPoint, int i) {
        switch (i) {

            case 17:
                XeTrang1.setPoint(newPoint);
                break;
            case 18:
                XeTrang2.setPoint(newPoint);
                break;
            case 19:
                MaTrang1.setPoint(newPoint);
                break;
            case 20:
                MaTrang2.setPoint(newPoint);
                break;
            case 21:
                TuongTrang1.setPoint(newPoint);
                break;
            case 22:
                TuongTrang2.setPoint(newPoint);
                break;
            case 23:
                HauTrang.setPoint(newPoint);
                break;
            case 24:
                VuaTrang.setPoint(newPoint);
                break;
            case 25:
                TotTrang[0].setPoint(newPoint);
                break;
            case 26:
                TotTrang[1].setPoint(newPoint);
                break;
            case 27:
                TotTrang[2].setPoint(newPoint);
                break;
            case 28:
                TotTrang[3].setPoint(newPoint);
                break;
            case 29:
                TotTrang[4].setPoint(newPoint);
                break;
            case 30:
                TotTrang[5].setPoint(newPoint);
                break;
            case 31:
                TotTrang[6].setPoint(newPoint);
                break;
            case 32:
                TotTrang[7].setPoint(newPoint);
                break;
        }

    }

    //Hoan co bat ky quan nao cua quan trang
    public void changePositionToOld(Point newPoint, int i) {
        switch (i) {

            case 17:
                XeTrang1.toOld(newPoint);
                break;
            case 18:
                XeTrang2.toOld(newPoint);
                break;
            case 19:
                MaTrang1.toOld(newPoint);
                break;
            case 20:
                MaTrang2.toOld(newPoint);
                break;
            case 21:
                TuongTrang1.toOld(newPoint);
                break;
            case 22:
                TuongTrang2.toOld(newPoint);
                break;
            case 23:
                HauTrang.toOld(newPoint);
                break;
            case 24:
                VuaTrang.toOld(newPoint);
                break;
            case 25:
                TotTrang[0].toOld(newPoint);
                break;
            case 26:
                TotTrang[1].toOld(newPoint);
                break;
            case 27:
                TotTrang[2].toOld(newPoint);
                break;
            case 28:
                TotTrang[3].toOld(newPoint);
                break;
            case 29:
                TotTrang[4].toOld(newPoint);
                break;
            case 30:
                TotTrang[5].toOld(newPoint);
                break;
            case 31:
                TotTrang[6].toOld(newPoint);
                break;
            case 32:
                TotTrang[7].toOld(newPoint);
                break;
        }
    }

    //Thay doi toa do pixel bat ky quan nao cua quan trang, danh dau quan duoc di
    public void changePixel(int newPixelX, int newPixelY, int i) {
        daDuocChon = i;
        switch (daDuocChon) {

            case 17:
                XeTrang1.setPixels(newPixelX, newPixelY);
                break;
            case 18:
                XeTrang2.setPixels(newPixelX, newPixelY);
                break;
            case 19:
                MaTrang1.setPixels(newPixelX, newPixelY);
                break;
            case 20:
                MaTrang2.setPixels(newPixelX, newPixelY);
                break;
            case 21:
                TuongTrang1.setPixels(newPixelX, newPixelY);
                break;
            case 22:
                TuongTrang2.setPixels(newPixelX, newPixelY);
                break;
            case 23:
                HauTrang.setPixels(newPixelX, newPixelY);
                break;
            case 24:
                VuaTrang.setPixels(newPixelX, newPixelY);
                break;
            case 25:
                TotTrang[0].setPixels(newPixelX, newPixelY);
                break;
            case 26:
                TotTrang[1].setPixels(newPixelX, newPixelY);
                break;
            case 27:
                TotTrang[2].setPixels(newPixelX, newPixelY);
                break;
            case 28:
                TotTrang[3].setPixels(newPixelX, newPixelY);
                break;
            case 29:
                TotTrang[4].setPixels(newPixelX, newPixelY);
                break;
            case 30:
                TotTrang[5].setPixels(newPixelX, newPixelY);
                break;
            case 31:
                TotTrang[6].setPixels(newPixelX, newPixelY);
                break;
            case 32:
                TotTrang[7].setPixels(newPixelX, newPixelY);
                break;
        }
    }

    //Lay toa do pixel cua bat ky quan nao cua quan trang
    public Point getPixelPoint(int i) {
        daDuocChon = i;
        switch (daDuocChon) {

            case 17:
                return XeTrang1.getPixelPoint();
            case 18:
                return XeTrang2.getPixelPoint();
            case 19:
                return MaTrang1.getPixelPoint();
            case 20:
                return MaTrang2.getPixelPoint();
            case 21:
                return TuongTrang1.getPixelPoint();
            case 22:
                return TuongTrang2.getPixelPoint();
            case 23:
                return HauTrang.getpixelPoint();
            case 24:
                return VuaTrang.getPixelPoint();
            case 25:
                return TotTrang[0].getPixelPoint();
            case 26:
                return TotTrang[1].getPixelPoint();
            case 27:
                return TotTrang[2].getPixelPoint();
            case 28:
                return TotTrang[3].getPixelPoint();
            case 29:
                return TotTrang[4].getPixelPoint();
            case 30:
                return TotTrang[5].getPixelPoint();
            case 31:
                return TotTrang[6].getPixelPoint();
            case 32:
                return TotTrang[7].getPixelPoint();
        }
        return null;
    }

    //Kiem tra quan i co the di duoc vi tri newP khong
    public boolean checkTheMove(Point newP, int i) {
        daDuocChon = i;
        switch (daDuocChon) {

            case 17:
                return XeTrang1.canMove(newP.x, newP.y);
            case 18:
                return XeTrang2.canMove(newP.x, newP.y);
            case 19:
                return MaTrang1.canMove(newP.x, newP.y);
            case 20:
                return MaTrang2.canMove(newP.x, newP.y);
            case 21:
                return TuongTrang1.canMove(newP.x, newP.y);
            case 22:
                return TuongTrang2.canMove(newP.x, newP.y);
            case 23:
                return HauTrang.canMove(newP.x, newP.y);
            case 24:
                return VuaTrang.canMove(newP.x, newP.y);
            case 25:
                return TotTrang[0].canMove(newP.x, newP.y, Color);
            case 26:
                return TotTrang[1].canMove(newP.x, newP.y, Color);
            case 27:
                return TotTrang[2].canMove(newP.x, newP.y, Color);
            case 28:
                return TotTrang[3].canMove(newP.x, newP.y, Color);
            case 29:
                return TotTrang[4].canMove(newP.x, newP.y, Color);
            case 30:
                return TotTrang[5].canMove(newP.x, newP.y, Color);
            case 31:
                return TotTrang[6].canMove(newP.x, newP.y, Color);
            case 32:
                return TotTrang[7].canMove(newP.x, newP.y, Color);
        }
        return false;
    }

    //Kiem tra vi tri P co the duoc an boi con tot i neu P la ke dich hay khong
    public boolean setSeentoSiliders(int i, Point P) {
        switch (i) {
            case 25:
                return TotTrang[0].setSeenByChecking(P, "white");
            case 26:
                return TotTrang[1].setSeenByChecking(P, "white");
            case 27:
                return TotTrang[2].setSeenByChecking(P, "white");
            case 28:
                return TotTrang[3].setSeenByChecking(P, "white");
            case 29:
                return TotTrang[4].setSeenByChecking(P, "white");
            case 30:
                return TotTrang[5].setSeenByChecking(P, "white");
            case 31:
                return TotTrang[6].setSeenByChecking(P, "white");
            case 32:
                return TotTrang[7].setSeenByChecking(P, "white");
        }
        return false;
    }

    // Kiem tra con tot i co the an quan dich hay khong
    public boolean returnsoliderSeen(int i) {
        switch (i) {
            case 25:
                return TotTrang[0].returnMyseen();
            case 26:
                return TotTrang[1].returnMyseen();
            case 27:
                return TotTrang[2].returnMyseen();
            case 28:
                return TotTrang[3].returnMyseen();
            case 29:
                return TotTrang[4].returnMyseen();
            case 30:
                return TotTrang[5].returnMyseen();
            case 31:
                return TotTrang[6].returnMyseen();
            case 32:
                return TotTrang[7].returnMyseen();
        }
        return false;
    }

    //Kiem tra quan i di den vi tri newP co bi can boi quan dich o vi tri positionFromOthers hay khong
    public boolean checkTheWay(Point newP, Point postionFromOthers, int i) {
        switch (i) {
            case 17:
                return XeTrang1.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 18:
                return XeTrang2.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 21:
                return TuongTrang1.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 22:
                return TuongTrang2.isPieceInMyWay(newP.x, newP.y, postionFromOthers);
            case 23:
                return HauTrang.isPieceInMYway(newP.x, newP.y, postionFromOthers);
            case 25:
                return TotTrang[0].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 26:
                return TotTrang[1].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 27:
                return TotTrang[2].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 28:
                return TotTrang[3].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 29:
                return TotTrang[4].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 30:
                return TotTrang[5].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 31:
                return TotTrang[6].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
            case 32:
                return TotTrang[7].isPieceInMyWay(newP.x, newP.y, postionFromOthers, Color);
        }
        return false;
    }

    //Quan i bi an (bo qua vi tri 13,13 khong co trong ban co)
    public boolean killPiece(int i) {
        Point out = new Point(13, 13);
        switch (i) {
            case 17:
                XeTrang1.setPoint(out);
                return true;
            case 18:
                XeTrang2.setPoint(out);
                return true;
            case 19:
                MaTrang1.setPoint(out);
                return true;
            case 20:
                MaTrang2.setPoint(out);
                return true;
            case 21:
                TuongTrang1.setPoint(out);
                return true;
            case 22:
                TuongTrang2.setPoint(out);
                return true;
            case 23:
                HauTrang.setPoint(out);
                return true;
            case 24:
                return false; //Quan vua khong bao gio bi an
            case 25:
                TotTrang[0].setPoint(out);
                return true;
            case 26:
                TotTrang[1].setPoint(out);
                return true;
            case 27:
                TotTrang[2].setPoint(out);
                return true;
            case 28:
                TotTrang[3].setPoint(out);
                return true;
            case 29:
                TotTrang[4].setPoint(out);
                return true;
            case 30:
                TotTrang[5].setPoint(out);
                return true;
            case 31:
                TotTrang[6].setPoint(out);
                return true;
            case 32:
                TotTrang[7].setPoint(out);
                return true;
        }

        return false;
    }

    //Kiem tra quan i di den toa do p1 co chieu duoc vua o toa do p2 hay khong
    public boolean checkKing(Point p1, Point p2, int i) {
        switch (i) {

            case 17:
                return XeTrang1.checkKing(p1.x, p1.y, p2);
            case 18:
                return XeTrang2.checkKing(p1.x, p1.y, p2);
            case 19:
                return MaTrang1.canMove(p1.x, p1.y); //Quan ma do nuoc di ngan nen khong can dung ham checkKing
            case 20:
                return MaTrang2.canMove(p1.x, p1.y); //Quan ma do nuoc di ngan nen khong can dung ham checkKing
            case 21:
                return TuongTrang1.checkKing(p1.x, p1.y, p2);
            case 22:
                return TuongTrang2.checkKing(p1.x, p1.y, p2);
            case 23:
                return HauTrang.checkKing(p1.x, p1.y, p2);
            //Quan tot do co nuoc di ngan nen khong co ham checkKing
            case 25:
                return TotTrang[0].canMove(p1.x, p1.y, Color);
            case 26:
                return TotTrang[1].canMove(p1.x, p1.y, Color);
            case 27:
                return TotTrang[2].canMove(p1.x, p1.y, Color);
            case 28:
                return TotTrang[3].canMove(p1.x, p1.y, Color);
            case 29:
                return TotTrang[4].canMove(p1.x, p1.y, Color);
            case 30:
                return TotTrang[5].canMove(p1.x, p1.y, Color);
            case 31:
                return TotTrang[6].canMove(p1.x, p1.y, Color);
            case 32:
                return TotTrang[7].canMove(p1.x, p1.y, Color);
        }
        return false;
    }

    //Tra ve quan da duoc chon de di
    public int returnChosen() {
        return daDuocChon;
    }

    //Gan vi tri cua quan dang duoc chon
    public void setInHand(int i) {
        dangDuocChon = i;
    }

    //Tra ve quan dang duoc chon de di
    public int getInHand() {
        return dangDuocChon;
    }

    //Kiem tra toa do (x,y) ci the di duoc hay khong doi voi quan dang duoc chon
    public boolean canMove(int x, int y) {
        return true;
    }

    //Danh dau trang thai tuong bi quan dich chieu
    public void checkKing(boolean newkingcheck) {
        laVuaBiChieu = newkingcheck;
    }

    //Tra ve trang thai quan tuong bi chieu hay khong
    public boolean returnCheckKing() {
        return laVuaBiChieu;
    }

    //
    public boolean ifMyKingInCheck(QuanDen Black) {
        boolean isCheckMate = false;
        boolean flag = false;
        return false;
    }

    //Kiem tra chieu het game doi thu
    public boolean checkMateGAMEOVER(QuanDen Enemy) {
        if (!generateKingMoves(Enemy)) {
            dangDuocChon = -1;
            return false;
        } else if (!generateCastleMoves(Enemy, XeTrang1)) {

            dangDuocChon = -1;
            return false;
        } else if (!generateCastleMoves(Enemy, XeTrang2)) {

            dangDuocChon = -1;
            return false;
        } else if (!generateElephantMoves(Enemy, TuongTrang1)) {

            dangDuocChon = -1;
            return false;
        } else if (!generateElephantMoves(Enemy, TuongTrang2)) {

            dangDuocChon = -1;
            return false;
        } else if (!generateHorseMoves(Enemy, MaTrang1)) {

            dangDuocChon = -1;
            return false;
        } else if (!generateHorseMoves(Enemy, MaTrang2)) {

            dangDuocChon = -1;
            return false;
        } else if (!generateQueenMoves(Enemy)) {

            dangDuocChon = -1;
            return false;
        }

        for (int i = 0; i <= 7; i++) {
            dangDuocChon = 25 + i;
            if (!generateSoldierMoves(Enemy, TotTrang[i])) {

                dangDuocChon = -1;
                return false;
            }
        }

        dangDuocChon = -1;
        return true;
    }

    //Kiem tra quan vua cua minh dang bi chieu hay khong
    public boolean seeKingCheck(QuanDen Black) {
        Point My_King_Postion = VuaTrang.returnPosition();
        boolean flag = false;
        //Bat dau kiem tra co quan den dang chieu tuong ben quan trang hay khong
        for (int i = 1; i < 17; i++) {
            if (i < 9) {
                if (Black.checkTheMove(My_King_Postion, i)) {

                    flag = true;
                    for (int j = 1; j < 33; j++) {

                        if (j < 17) {

                            if (Black.checkTheWay(My_King_Postion, Black.returnPosition(j), i)) {
                                //Neu co vat can 1a quan den thi khong the chieu duoc
                                flag = false;
                            }
                        } else {

                            if (j != 24) //Tru quan vua trang
                            {
                                if (Black.checkTheWay(My_King_Postion, returnPosition(j), i)) {

                                    flag = false;
                                    //Neu co vat can la quan trang thi khong the chieu duoc
                                }
                            }
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            } else {
                // Kiem tra quan tot cua dich dang chieu vua cua minh hay khong
                if (Black.setSeenToSiliders(i, My_King_Postion)) {
                    break;
                }
            }
            //Kiem tra het cac quan dich thi vua minh khong bi chieu
            if (i == 16) {
                return false;
            }
        }
        return true;
    }

    //Kiem tra vi tri newP di da co quan trang ben minh o vi tro do roi
    public boolean isPieceAlreadyThere(Point newP) {
        Point samePostion;
        for (int i = 17; i <= 32; i++) {
            if (getInHand() != i) {

                samePostion = returnPosition(i);
                if (newP.x == samePostion.x && newP.y == samePostion.y) {
                    return false;
                }
            }
        }
        return true;
    }

    //Kiem tra vi tri newP da co quan dich o vi tri do roi
    public boolean isPieceAlreadyThereFromEnemy(Point newP, QuanDen enemy) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            samePostion = enemy.returnPosition(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {

                return false;

            }
        }
        return true;
    }

    //Kiem tra vi tri newP da ton tai quan nao cua dich hay khong
    public int getPieceAlreadyThereFromEnemy(Point newP, QuanDen enemy) {
        Point samePostion;
        for (int i = 1; i <= 16; i++) {
            samePostion = enemy.returnPosition(i);
            if (newP.x == samePostion.x && newP.y == samePostion.y) {
                return i;
            }
        }
        return -1;
    }

    //
    public boolean generateKingMoves(QuanDen enemy) {
        boolean isSomethingKilled = false;
        Point oldP = new Point();

        Point placeCheck = new Point();
        dangDuocChon = 24;

        int x = VuaTrang.returnX();
        int y = VuaTrang.returnY();
        oldP.x = x;
        oldP.y = y;

        if (x + 1 <= 8) {

            VuaTrang.setX(x + 1);
            VuaTrang.setY(y);
            placeCheck.x = x + 1;
            placeCheck.y = y;

            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    VuaTrang.setPoint(oldP);
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    return false;
                }
            }

        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y + 1 <= 8) {

            VuaTrang.setX(x);
            VuaTrang.setY(y + 1);
            placeCheck.x = x;
            placeCheck.y = y + 1;
            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }
            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    VuaTrang.setPoint(oldP);
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }
                    return false;

                }
            }
        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y - 1 > 0) {

            VuaTrang.setX(x);
            VuaTrang.setY(y - 1);

            placeCheck.x = x;
            placeCheck.y = y - 1;

            if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                isSomethingKilled = true;
            }

            if (isPieceAlreadyThere(placeCheck)) {
                if (!seeKingCheck(enemy)) {

                    VuaTrang.setPoint(oldP);
                    if (isSomethingKilled) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        isSomethingKilled = false;
                    }

                    return false;
                }
            }

        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (x - 1 > 0) {

            VuaTrang.setX(x - 1);
            VuaTrang.setY(y);

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
                    VuaTrang.setPoint(oldP);
                    return false;
                }
            }
        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y - 1 > 0 && x - 1 > 0) {

            VuaTrang.setX(x - 1);
            VuaTrang.setY(y - 1);

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
                    VuaTrang.setPoint(oldP);
                    return false;
                }
            }

        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y + 1 <= 8 && x + 1 <= 8) {

            VuaTrang.setX(x + 1);
            VuaTrang.setY(y + 1);

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
                    VuaTrang.setPoint(oldP);
                    return false;
                }
            }

        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y - 1 > 0 && x + 1 <= 8) {

            VuaTrang.setX(x + 1);
            VuaTrang.setY(y - 1);

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
                    VuaTrang.setPoint(oldP);
                    return false;
                }
            }

        }
        VuaTrang.setPoint(oldP);
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        if (y + 1 <= 8 && x - 1 > 0) {

            VuaTrang.setX(x - 1);
            VuaTrang.setY(y + 1);

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
                    VuaTrang.setPoint(oldP);
                    return false;
                }
            }
        }

        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }

        VuaTrang.setPoint(oldP);
        return true;
    }

    //
    public boolean generateCastleMoves(QuanDen enemy, Xe WC) {
        boolean isSomethingKilled = false;
        Point oldP = new Point();

        Point placeCheck = new Point();
        int x1 = WC.returnX();
        int y1 = WC.returnY();

        if (WC == XeTrang1) {
            dangDuocChon = 17;
        } else {
            dangDuocChon = 18;
        }
        /////////////////////

        oldP.x = x1;
        oldP.y = y1;

        placeCheck.y = y1;

        if (x1 != 20) {
            for (int i = 1; i <= 8; i++) {
                WC.setX(i);
                placeCheck.x = i;

                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            WC.setX(oldP.x);
                            WC.setY(oldP.y);

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
            WC.setX(oldP.x);
            placeCheck.x = oldP.x;

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }
            for (int i = 1; i <= 8; i++) {
                WC.setY(i);
                placeCheck.y = i;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            WC.setX(oldP.x);
                            WC.setY(oldP.y);

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
            WC.setY(oldP.y);
        }
        //////////////////////////////////////////
        ///////////////////////////
        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        WC.setX(oldP.x);
        WC.setY(oldP.y);
        return true;
    }

    //
    public boolean generateElephantMoves(QuanDen enemy, Tuong WE) {
        boolean isSomethingKilled = false;
        Point oldP = new Point();
        Point placeCheck = new Point();

        oldP = WE.returnPosition();

        if (WE == TuongTrang1) {
            dangDuocChon = 21;
        } else {
            dangDuocChon = 22;
        }

        if (oldP.x != 20) {
            for (int x = oldP.x, y = oldP.y; x >= 1 && y <= 8; x--, y++) {

                WE.setX(x);
                WE.setY(y);
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
                            WE.setPoint(oldP);
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

                WE.setX(x);
                WE.setY(y);
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
                            WE.setPoint(oldP);
                            return false;
                        }
                    }
                }

                if (isSomethingKilled) {
                    enemy.changePosition(khac, anDeBaoVeVua);
                    isSomethingKilled = false;
                }

            }
            WE.setPoint(oldP);

        }

        WE.setPoint(oldP);

        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }

        return true;
    }

    //
    public boolean generateHorseMoves(QuanDen enemy, Ma WH) {
        Point oldP = new Point();
        boolean isSomethingKilled = false;
        oldP = WH.returnPosition();

        Point placeCheck = new Point();

        if (WH == MaTrang1) {
            dangDuocChon = 19;
        } else {
            dangDuocChon = 20;
        }

        int x = oldP.x;
        int y = oldP.y;

        if (x != 20) {

            if (x + 1 <= 8 && y + 1 <= 8) {
                WH.setX(x + 1);
                WH.setY(y + 2);
                placeCheck.x = x + 1;
                placeCheck.y = y + 2;

                if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                    isSomethingKilled = true;
                }

                if (isPieceAlreadyThere(placeCheck)) {
                    if (!seeKingCheck(enemy)) {
                        WH.setPoint(oldP);

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
                WH.setX(x + 1);
                WH.setY(y - 2);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x + 2 <= 8 && y + 1 <= 8) {
                WH.setX(x + 2);
                WH.setY(y + 1);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }
            if (x + 2 <= 8 && y - 1 >= 1) {
                WH.setX(x + 2);
                WH.setY(y - 1);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 1 >= 1 && y + 2 <= 8) {
                WH.setX(x - 1);
                WH.setY(y + 2);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 1 >= 1 && y - 2 >= 1) {
                WH.setX(x - 1);
                WH.setY(y - 2);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 2 >= 1 && y + 1 <= 8) {
                WH.setX(x - 2);
                WH.setY(y + 1);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            if (x - 2 >= 1 && y - 1 >= 1) {
                WH.setX(x - 2);
                WH.setY(y - 1);
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
                        WH.setPoint(oldP);
                        return false;
                    }
                }
            }
            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

        }
        WH.setPoint(oldP);

        return true;
    }

    //
    public boolean generateQueenMoves(QuanDen enemy) {
        boolean isSomethingKilled = false;

        Point oldP = new Point();

        oldP = HauTrang.returnPosition();

        Point placeCheck = new Point();

        dangDuocChon = 23;

        if (oldP.x != 20) {
            for (int x = oldP.x, y = oldP.y; x >= 1 && y <= 8; x--, y++) {

                HauTrang.setX(x);
                HauTrang.setY(y);
                placeCheck.x = x;
                placeCheck.y = y;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }

                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauTrang.setPoint(oldP);

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

                HauTrang.setX(x);
                HauTrang.setY(y);
                placeCheck.x = x;
                placeCheck.y = y;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauTrang.setPoint(oldP);
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
            HauTrang.setPoint(oldP);
            placeCheck.x = oldP.x;
            placeCheck.y = oldP.y;

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            for (int i = 1; i <= 8; i++) {
                HauTrang.setX(i);

                placeCheck.x = i;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauTrang.setX(oldP.x);
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
            HauTrang.setX(oldP.x);
            placeCheck.x = oldP.x;

            if (isSomethingKilled) {
                enemy.changePosition(khac, anDeBaoVeVua);
                isSomethingKilled = false;
            }

            for (int i = 1; i <= 8; i++) {
                HauTrang.setY(i);
                placeCheck.y = i;
                if (checkTheWayToPosition(enemy, oldP)) {
                    if (killToProtectKing(enemy, returnPosition(dangDuocChon))) {
                        isSomethingKilled = true;
                    }
                    if (isPieceAlreadyThere(placeCheck)) {
                        if (!seeKingCheck(enemy)) {
                            HauTrang.setY(oldP.y);
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
            HauTrang.setY(oldP.y);
        }

        if (isSomethingKilled) {
            enemy.changePosition(khac, anDeBaoVeVua);
            isSomethingKilled = false;
        }
        return true;

    }

    //
    public boolean generateSoldierMoves(QuanDen enemy, Tot Sold) {
        Point oldP = new Point();
        oldP = Sold.returnPosition();
        Point placeCheck = new Point();
        placeCheck.x = oldP.x;
        placeCheck.y = oldP.y;

        if (oldP.x != 20) {
            if (Sold.canMove(oldP.x, oldP.y - 2, Color) && oldP.y - 2 >= 1) {
                Sold.setY(oldP.y - 2);

                placeCheck.y = oldP.y - 1;

                if (isPieceAlreadyThere(placeCheck)) {
                    if (isPieceAlreadyThereFromEnemy(placeCheck, enemy)) {
                        if (!seeKingCheck(enemy)) {

                            Sold.setPoint(oldP);
                            return false;
                        }
                    }
                }

            }
            if (Sold.canMove(oldP.x, oldP.y - 1, Color) && oldP.y - 1 >= 1) {
                Sold.setY(oldP.y - 1);
                placeCheck.y = oldP.y - 1;

                if (isPieceAlreadyThere(placeCheck)) {
                    if (isPieceAlreadyThereFromEnemy(placeCheck, enemy)) {

                        if (!seeKingCheck(enemy)) {
                            Sold.setPoint(oldP);
                            System.out.println("dff");
                            System.out.println("dff");
                            System.out.println("dff");
                            return false;
                        }
                    }
                }
            }

            if (!isPieceAlreadyThereFromEnemy(new Point(oldP.x - 1, oldP.y - 1), enemy)) {
                if (killToProtectKing(enemy, new Point(oldP.x - 1, oldP.y - 1))) {

                    if (!seeKingCheck(enemy)) {
                        enemy.changePosition(khac, anDeBaoVeVua);
                        Sold.setPoint(oldP);

                        return false;
                    }
                    enemy.changePosition(khac, anDeBaoVeVua);
                }
            }

            if (!isPieceAlreadyThereFromEnemy(new Point(oldP.x + 1, oldP.y - 1), enemy)) {
                if (killToProtectKing(enemy, new Point(oldP.x + 1, oldP.y - 1))) {
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

    //Kiem tra quan dang duoc chon di den vi tri newP co di duoc hay khong
    public boolean checkTheWayToPosition(QuanDen enemy, Point newP) {
        boolean flag = false;

        for (int i = 1; i <= 32; i++) {
            if (dangDuocChon != i)//Kiem tra
            {
                if (i < 17) {
                    flag = checkTheWay(newP, enemy.returnPosition(i), dangDuocChon);//Bi can nen khong the di duocs
                } else {
                    flag = checkTheWay(newP, returnPosition(i), dangDuocChon);
                }

                if (flag == true) {
                    return false;
                }//Co nghia la bi can
            }
        }
        return true; //Khong bi can nen di duoc

    }

    //Kiem tra neu quan dich o vi tri newP thi an de bao ve quan vua neu dang bi chieu
    public boolean killToProtectKing(QuanDen enemy, Point newP) {

        for (int i = 1; i < 17; i++) {

            khac = enemy.returnPosition(i);
            if (khac.x == newP.x && khac.y == newP.y) {
                anDeBaoVeVua = i;

                enemy.killPiece(i);
                return true;
            }
        }

        return false;
    }

    //Xuat nuoc moi di
    public String Tell_me_About_last_move() {
        switch (dangDuocChon) {

            case 17:
                return XeTrang1.tellMe();
            case 18:
                return XeTrang2.tellMe();
            case 19:
                return MaTrang1.tellMe();
            case 20:
                return MaTrang2.tellMe();
            case 21:
                return TuongTrang1.tellMe();
            case 22:
                return TuongTrang2.tellMe();
            case 23:
                return HauTrang.tellMe();
            case 24:
                return VuaTrang.tellMe();
            case 25:
                return TotTrang[0].tellMe();
            case 26:
                return TotTrang[1].tellMe();
            case 27:
                return TotTrang[2].tellMe();
            case 28:
                return TotTrang[3].tellMe();
            case 29:
                return TotTrang[4].tellMe();
            case 30:
                return TotTrang[5].tellMe();
            case 31:
                return TotTrang[6].tellMe();
            case 32:
                return TotTrang[7].tellMe();
        }
        return null;
    }
}
