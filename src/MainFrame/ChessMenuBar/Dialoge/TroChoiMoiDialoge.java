package MainFrame.ChessMenuBar.Dialoge;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JPanel;
import MainFrame.ChessFrame.MainFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class TroChoiMoiDialoge extends JDialog {

    //Dialoge NewGame
    public TroChoiMoiDialoge(final MainFrame ff) {
        super(ff, "Che do 2 nguoi choi", true);

        setSize(300, 350);
        setLocation(100, 100);
        panel.setLayout(null);
        Container cp = getContentPane();

        panel.setSize(300, 300);

        button1 = new JButton("Bat dau");
        button2 = new JButton("Huy");

        button1.setSize(80, 24);
        button2.setSize(80, 24);

        button1.setLocation(50, 250);
        button2.setLocation(150, 250);

        myCom.setSize(80, 20);
        myCom.setLocation(50, 50);

        typeGame.setSize(80, 24);
        typeGame.setLocation(40, 20);

        IPAddress.setSize(80, 24);
        IPAddress.setLocation(50, 100);

        IPText.setLocation(130, 100);
        IPText.setSize(100, 24);

        PortNumber.setSize(80, 24);
        PortNumber.setLocation(50, 130);

        PortText.setLocation(130, 130);
        PortText.setSize(100, 24);

        IPText.setEnabled(false);
        PortText.setEnabled(false);
        IPAddress.setEnabled(false);
        PortNumber.setEnabled(false);

        asServer.setSize(80, 24);
        asServer.setLocation(50, 180);
        asClient.setSize(80, 24);
        asClient.setLocation(160, 180);

        ButtonGroup.add(asServer);
        ButtonGroup.add(asClient);

        ButtonGroup.setSelected(asServer.getModel(), true);

        asServer.setEnabled(false);
        asClient.setEnabled(false);

        myNewFrame = ff;

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selected = (String) myCom.getSelectedItem();

                if (selected == "Offline") {
                    myNewFrame.startAgain();
                } else {
                    if (ButtonGroup.getSelection() == asServer.getModel()) {
                        myNewFrame.startAsServer();
                    } else {
                        myNewFrame.start_As_Client();
                    }
                }
                dispose();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.setLayout(null);

        panel.add(myCom);
        panel.add(button1);
        panel.add(button2);
        panel.add(typeGame);
        panel.add(IPAddress);
        panel.add(IPText);
        panel.add(PortNumber);
        panel.add(PortText);
        panel.add(asServer);
        panel.add(asClient);

        cp.add(panel);

        IPText.setText("127.0.0.1");
        PortText.setText("5000");

        myCom.addItemListener(new MyItemLestin());
        myCom.addItem("Offline");
        myCom.addItem("Online");

    }

    class MyItemLestin implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            String selected = ((JComboBox) e.getSource()).getSelectedItem().toString();

            if (selected == "Offline") {

                IPText.setEnabled(false);
                PortText.setEnabled(false);

                IPAddress.setEnabled(false);
                PortNumber.setEnabled(false);
                asServer.setEnabled(false);
                asClient.setEnabled(false);

            } else if (selected == "Online") {
                IPText.setEnabled(true);
                PortText.setEnabled(true);
                IPAddress.setEnabled(true);
                PortNumber.setEnabled(true);

                asServer.setEnabled(true);
                asClient.setEnabled(true);

            }
        }

    }

    public String GetIpAddress() {
        return IPText.getText();
    }

    public String GetPortnumber() {
        return PortText.getText();
    }

    private final JButton button1;
    private final JButton button2;
    private final MyComboBox myCom = new MyComboBox();
    private final JPanel panel = new JPanel();

    private final JLabel typeGame = new JLabel(" Loai tro choi: ");
    private final JLabel IPAddress = new JLabel(" IP Address : ");
    private final JLabel PortNumber = new JLabel(" Port : ");
    private final JTextField IPText = new JTextField(12);
    private final JTextField PortText = new JTextField(5);
    private final JRadioButton asServer = new JRadioButton("Server");
    private final JRadioButton asClient = new JRadioButton("Client");
    private MainFrame myNewFrame;
    private ButtonGroup ButtonGroup = new ButtonGroup();

    public void paintComponents(Graphics g) {
        super.paintComponents(g);

    }

}

class MyComboBox extends JComboBox {

    MyComboBox() {

    }
}
