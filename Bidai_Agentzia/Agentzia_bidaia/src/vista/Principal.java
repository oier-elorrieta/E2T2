package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public Login login;
	public Ongi_Etorri ongi_Etorri;
	public Profil_Berria profil_Berria;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);


		profil_Berria = new Profil_Berria();
		profil_Berria.setSize(500, 486);
		profil_Berria.setLocation(0, 0);
		contentPane.add(profil_Berria);
		profil_Berria.setVisible(false);

		
		login = new Login();
		login.setSize(500, 486);
		login.setLocation(0, 0);
		contentPane.add(login);
		login.setVisible(false);

		ongi_Etorri = new Ongi_Etorri();
		ongi_Etorri.btnLoging.setLocation(181, 280);
		ongi_Etorri.setBounds(0, 0, 500, 486);
		contentPane.add(ongi_Etorri);
		
		verPaneles("OngiEtorri");
	}

	public void verPaneles(String panel) {
		login.setVisible(false);
		ongi_Etorri.setVisible(false);
		profil_Berria.setVisible(false);
		
		switch (panel) {
		case "Login":
			login.setVisible(true);
			break;
		case "OngiEtorri":
			ongi_Etorri.setVisible(true);
			break;
		case "ProfilBerria":
			profil_Berria.setVisible(true);
			break;
		}

	}

}
