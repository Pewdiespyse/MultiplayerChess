package MainFrame.ChessFrame.ThreadTimer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Lop co nhiem vu gioi han gio choi cua 2 ben Black va White
public class ThreadTimer extends Thread {

    public ThreadTimer(JLabel mynewScreen) {
        myScreen = mynewScreen;
        myScreen.setText(Short.toString(mytime) + " giay");
    }

    public void run() {

        while (true) {
            mytime -= 0.1;
            try {

                this.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            myScreen.setText(Integer.toString(mytime) + " giay");
            if (mytime == 0) {

                JOptionPane.showConfirmDialog(null, " Game Over!\n Timeout", "Timeout", JOptionPane.DEFAULT_OPTION);
                stop();
                System.out.println("TimeOut");

                break;
            }
        }
    }

    private short mytime = 300;
    private JLabel myScreen;

}
