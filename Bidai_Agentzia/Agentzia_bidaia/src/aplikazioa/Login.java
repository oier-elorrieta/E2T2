package aplikazioa;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {

    JFrame frame;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 721, 465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel labelConImagen = new JLabel();
        labelConImagen.setBounds(0, 0, 705, 426);
        labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/fondo2.jpg")));
        frame.getContentPane().add(labelConImagen);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 139, 705, 143);
        panel_1.setBackground(new Color(255, 255, 255, 120));
        frame.getContentPane().add(panel_1);

        frame.getContentPane().setComponentZOrder(labelConImagen, frame.getContentPane().getComponentCount() - 1);
        frame.getContentPane().setComponentZOrder(panel_1, 0);
        panel_1.setLayout(null);

        JLabel lblAgentzia = new JLabel("Agentzia izena");
        lblAgentzia.setBounds(226, 28, 84, 14);
        panel_1.add(lblAgentzia);

        textField = new JTextField();
        textField.setBounds(338, 25, 130, 20);
        panel_1.add(textField);
        textField.setColumns(10);

        JLabel lblPasahitza = new JLabel("Pasahitza");
        lblPasahitza.setBounds(226, 77, 84, 14);
        panel_1.add(lblPasahitza);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(338, 74, 130, 20);
        panel_1.add(textField_1);

        JButton btnLogin = new JButton("Log in");
        btnLogin.setBounds(201, 105, 122, 28);
        panel_1.add(btnLogin);

        JButton btnAgentzia_berri = new JButton("Agentzia berria");
        btnAgentzia_berri.setBounds(358, 105, 130, 28);
        panel_1.add(btnAgentzia_berri);

 
        btnAgentzia_berri.addActionListener(e -> {
            frame.dispose(); 
            Login agentziaBerria = new Login();
            agentziaBerria.frame.setVisible(true);
        });
    }
}

