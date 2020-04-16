package MainFrame.ChessFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

//Xay dung thanh status
public class TrangThaiPanel extends JPanel {

    public TrangThaiPanel() {
        setSize(460, 30);
        setLocation(5, 465);
        setLayout(null);

        TrangThaiLabel.setSize(450, 20);
        TrangThaiLabel.setLocation(5, 5);
        TrangThaiLabel.setText(" Bat dau tro choi moi ");
        TrangThaiLabel.setBackground(Color.lightGray);
        TrangThaiLabel.setFont(new Font("Aril", Font.BOLD, 11));
        TrangThaiLabel.setForeground(Color.RED.brighter());
        TrangThaiLabel.setBorder(LabelBorder);
        add(TrangThaiLabel);

    }

    public void startAgain() {
        TrangThaiLabel.setText("  Tro choi bat dau ");
    }

    public void changeStatus(Object str) {
        TrangThaiLabel.setText((String) str);
    }

    private JLabel TrangThaiLabel = new JLabel();
    private LineBorder LabelBorder = new LineBorder(Color.BLACK.brighter(), 2);
}
