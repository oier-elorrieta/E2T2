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
import java.awt.Font;

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
		setBounds(100, 100, 1280, 720);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(111, 147, 102));
		panel.setBounds(274, 154, 754, 377);
		add(panel);
		panel.setLayout(null);
		
		pasahitza = new JPasswordField();
		pasahitza.setBounds(391, 144, 175, 26);
		panel.add(pasahitza);
		
		// AGENTZIA BERRIA BOTOIA TESTUA
		btnAgentzia_berri = new JButton("Agentzia berria");
		btnAgentzia_berri.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAgentzia_berri.setBounds(390, 239, 163, 55);
		panel.add(btnAgentzia_berri);
		
				// LOGIN BOTOIA
				btnLogin = new JButton("Log in");
				btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnLogin.setBounds(201, 239, 169, 55);
				panel.add(btnLogin);
				
						// AGENTZIA IZENA
						JLabel lblAgentzia = new JLabel("Agentzia izena");
						lblAgentzia.setFont(new Font("Tahoma", Font.PLAIN, 20));
						lblAgentzia.setBounds(201, 86, 146, 25);
						panel.add(lblAgentzia);
						lblAgentzia.setForeground(new Color(255, 255, 255));
						
								izena = new JTextField();
								izena.setBounds(395, 86, 169, 26);
								panel.add(izena);
								izena.setColumns(10);
								
										// PASAHITZA
										JLabel lblPasahitza = new JLabel("Pasahitza");
										lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 20));
										lblPasahitza.setBounds(201, 144, 146, 26);
										panel.add(lblPasahitza);
										lblPasahitza.setForeground(new Color(255, 255, 255));
		
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		// ATZEKO ARGAZKIA
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
		add(labelConImagen);


	}
}
