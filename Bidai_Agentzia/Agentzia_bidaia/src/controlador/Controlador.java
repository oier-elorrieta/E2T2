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

		ventanaPrincipal.login.btnAgentzia_berri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("ProfilBerria");
			}
		});
		
		/*login
		pilla los datos de los text fields de erabiltzaile y pasahitza
		Acce de a la BBDD con esos datos
		Si es error saca por pantalla
		si ok pasa al Panel bidaiak
		*/
	}

}
