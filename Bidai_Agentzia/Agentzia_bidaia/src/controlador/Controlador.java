package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Principal;

public class Controlador {

	Principal ventanaPrincipal;

	public Controlador(Principal principal) {
		// TODO Auto-generated constructor stub
		this.ventanaPrincipal = principal;
		ventanaPrincipal.verPaneles("OngiEtorri");

		ventanaPrincipal.ongi_Etorri.btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}
		});

		ventanaPrincipal.login.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiEkitaldia");
			}
		});

		ventanaPrincipal.bidai_Berria.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiEkitaldia");
			}
		});

		ventanaPrincipal.profil_Berria.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}
		});
		
		ventanaPrincipal.bidai_Ekitaldi.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}
		});
		
		ventanaPrincipal.login.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("OngiEtorri");
			}
		});

		ventanaPrincipal.profil_Berria.btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiEkitaldia");
			}
		});
		
		ventanaPrincipal.profil_Berria.btnUtzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}
		});
		
		ventanaPrincipal.login.btnAgentzia_berri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("ProfilBerria");
			}
		});
		
		ventanaPrincipal.bidai_Ekitaldi.btnBidaiBerri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiBerria");
			}
		});
		
		ventanaPrincipal.bidai_Berria.btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiEkitaldia");
			}
		});
		
		/*
		 * login pilla los datos de los text fields de erabiltzaile y pasahitza Acce de
		 * a la BBDD con esos datos Si es error saca por pantalla si ok pasa al Panel
		 * bidaiak
		 */
	}

}
