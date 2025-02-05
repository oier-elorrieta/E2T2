package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnAgentzia_berri;
	private JButton btnLogin;
	private JButton btnAtzera;
	private JTextField pasahitza;
	private JTextField izena;
	
	public JButton getBtnAgentzia_berri() {
		return btnAgentzia_berri;
	}
	public void setBtnAgentzia_berri(JButton btnAgentzia_berri) {
		this.btnAgentzia_berri = btnAgentzia_berri;
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	public JButton getBtnAtzera() {
		return btnAtzera;
	}
	public void setBtnAtzera(JButton btnAtzera) {
		this.btnAtzera = btnAtzera;
	}
	public JTextField getPasahitza() {
		return pasahitza;
	}
	public void setPasahitza(JPasswordField pasahitza) {
		this.pasahitza = pasahitza;
	}
	public JTextField getIzena() {
		return izena;
	}
	public void setIzena(JTextField izena) {
		this.izena = izena;
	}
	/**
	 * Create the panel.
	 */
	public Login() {

		setLayout(null);
		setBounds(100, 100, 500, 500);

		// AGENTZIA IZENA
		JLabel lblAgentzia = new JLabel("Agentzia izena");
		lblAgentzia.setForeground(new Color(255, 255, 255));
		lblAgentzia.setBounds(147, 182, 84, 14);
		add(lblAgentzia);

		izena = new JTextField();
		izena.setBounds(264, 179, 130, 20);
		add(izena);
		izena.setColumns(10);

		// PASAHITZA
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setForeground(new Color(255, 255, 255));
		lblPasahitza.setBounds(147, 230, 84, 14);
		add(lblPasahitza);

		// LOGIN BOTOIA
		btnLogin = new JButton("Log in");
		btnLogin.setBounds(132, 274, 122, 28);
		add(btnLogin);
		
		// AGENTZIA BERRIA BOTOIA TESTUA
		btnAgentzia_berri = new JButton("Agentzia berria");
		btnAgentzia_berri.setBounds(264, 274, 130, 28);
		add(btnAgentzia_berri);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(111, 147, 102));
		panel.setBounds(84, 108, 350, 256);
		add(panel);
		panel.setLayout(null);
		
		pasahitza = new JPasswordField();
		pasahitza.setBounds(179, 122, 130, 20);
		panel.add(pasahitza);
		
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		// ATZEKO ARGAZKIA
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/fondoBlanco.jpg")));
		add(labelConImagen);


	}
}
