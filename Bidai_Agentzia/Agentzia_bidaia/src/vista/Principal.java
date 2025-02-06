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
	public Ekitaldi_Berria ekitaldi_Berria;
	public Ostatu_Berria ostatua;
	public Hegaldia hegaldia;
	public Beste_Batzuk besteBatzuk;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		hegaldia = new Hegaldia();
		hegaldia.setSize(500, 486);
		hegaldia.setLocation(0, 0);
		contentPane.add(hegaldia);
		hegaldia.setVisible(false);
		
		besteBatzuk = new Beste_Batzuk();
		besteBatzuk.setSize(500, 486);
		besteBatzuk.setLocation(0, 0);
		contentPane.add(besteBatzuk);
		besteBatzuk.setVisible(false);
		
		bidai_Berria = new Bidai_berria();
		bidai_Berria.setSize(500, 486);
		bidai_Berria.setLocation(0, 0);
		contentPane.add(bidai_Berria);
		bidai_Berria.setVisible(false);
		
		ekitaldi_Berria = new Ekitaldi_Berria();
		ekitaldi_Berria.setSize(500, 486);
		ekitaldi_Berria.setLocation(0, 0);
		contentPane.add(ekitaldi_Berria);
		ekitaldi_Berria.setVisible(false);
		
		ostatua = new Ostatu_Berria();
		ostatua.setSize(500, 486);
		ostatua.setLocation(0, 0);
		contentPane.add(ostatua);
		ostatua.setVisible(false);
		
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
		ekitaldi_Berria.setVisible(false);
		ostatua.setVisible(false);
		hegaldia.setVisible(false);
		besteBatzuk.setVisible(false);
		
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
		case "EkitaldiBerria":
			ekitaldi_Berria.setVisible(true);
			break;
		case "Ostatua":
			ostatua.setVisible(true);
			break;
		case "Hegaldia":
			hegaldia.setVisible(true);
			break;
		case "BesteBatzuk":
			besteBatzuk.setVisible(true);
			break;
		}

	}

}
