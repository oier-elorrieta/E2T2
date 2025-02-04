package Inicio;

import java.awt.EventQueue;
import controlador.Controlador;
import vista.Principal;

public class Inicio {

	// TODO Auto-generated method stub
	public static void main(String[] args) {

		try {
			Principal principal = new Principal();
			principal.setVisible(true);
			Controlador controlador = new Controlador(principal);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
