package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAgentzia_berri;

	/**
	 * Create the panel.
	 */
	public Login() {

		setLayout(null);
		setBounds(100, 100, 500, 500);

		// AGENTZIA IZENA
		JLabel lblAgentzia = new JLabel("Agentzia izena");
		lblAgentzia.setBounds(147, 182, 84, 14);
		add(lblAgentzia);

		JTextField textField = new JTextField();
		textField.setBounds(264, 179, 130, 20);
		add(textField);
		textField.setColumns(10);

		// PASAHITZA
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setBounds(147, 230, 84, 14);
		add(lblPasahitza);

		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(264, 227, 130, 20);
		add(textField_1);

		// LOGIN BOTOIA
		JButton btnLogin = new JButton("Log in");
		btnLogin.setBounds(132, 274, 122, 28);
		add(btnLogin);

		// AGENTZIA BERRIA BOTOIA TESTUA
		btnAgentzia_berri = new JButton("Agentzia berria");
		btnAgentzia_berri.setBounds(264, 274, 130, 28);
		add(btnAgentzia_berri);

		// ATZEKO ARGAZKIA
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/fondo2.jpg")));
		add(labelConImagen);


	}

}
