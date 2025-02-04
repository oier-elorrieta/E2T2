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
	public Bidai_berria bidai_Berria;
	public Bidai_Ekitaldi bidai_Ekitaldi;
	public Profil_Berria profil_Berria;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);


		bidai_Berria = new Bidai_berria();
		bidai_Berria.setSize(500, 486);
		bidai_Berria.setLocation(0, 0);
		contentPane.add(bidai_Berria);
		bidai_Berria.setVisible(false);
		
		profil_Berria = new Profil_Berria();
		profil_Berria.setSize(500, 486);
		profil_Berria.setLocation(0, 0);
		contentPane.add(profil_Berria);
		profil_Berria.setVisible(false);

		bidai_Ekitaldi = new Bidai_Ekitaldi();
		bidai_Ekitaldi.setSize(500, 486);
		bidai_Ekitaldi.setLocation(0, 0);
		contentPane.add(bidai_Ekitaldi);
		bidai_Ekitaldi.setVisible(false);

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
		bidai_Berria.setVisible(false);
		bidai_Ekitaldi.setVisible(false);
		profil_Berria.setVisible(false);
		
		switch (panel) {
		case "Login":
			login.setVisible(true);
			break;
		case "OngiEtorri":
			ongi_Etorri.setVisible(true);
			break;
		case "BidaiBerria":
			bidai_Berria.setVisible(true);
			break;
		case "BidaiEkitaldia":
			bidai_Ekitaldi.setVisible(true);
			break;
		case "ProfilBerria":
			profil_Berria.setVisible(true);
			break;
		}

	}

}
