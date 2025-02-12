package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import modeloa.Agentzia;
import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import Inicio.Conexion_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import vista.Principal;
import vista.Ostatu_Berria;

public class Controlador {

	Principal ventanaPrincipal;

	private int Agentzia;
	private Connection conn;
	private Agentzia[] agentziak;
	private int kopurua;

	public int getAgentzia() {
		return Agentzia;
	}

	public void setAgentzia(int agentzia) {
		Agentzia = agentzia;
	}

	public Controlador(Principal principal) {
		// TODO Auto-generated constructor stub
		this.ventanaPrincipal = principal;
		ventanaPrincipal.verPaneles("OngiEtorri");

		// BOTOIAK
		ventanaPrincipal.ongi_Etorri.btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}

		});

		ventanaPrincipal.login.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String izena = ventanaPrincipal.login.getIzena().getText();
				String pasahitza = ventanaPrincipal.login.getPasahitza().getText();

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:2025/db_bidai_agentzia",
							"root", "");
					Statement sentencia = conexion.createStatement();
					String sql = "SELECT * FROM agentzia WHERE erabiltzailea = '" + izena + "' AND pasahitza= '"
							+ pasahitza + "'";
					System.out.println(sql);
					ResultSet result = sentencia.executeQuery(sql);

					if (result.next()) {
						JOptionPane.showMessageDialog(null, "Ongi etorri", null, JOptionPane.INFORMATION_MESSAGE);
						ventanaPrincipal.verPaneles("BidaiEkitaldia");
					} else {
						JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}

					result.close();
					sentencia.close();
					conexion.close();
				} catch (ClassNotFoundException ex2) {
					System.out.println("Error al cargar el driver JDBC: " + ex2.getMessage());
				} catch (SQLException ex) {
					System.out.println("Error en la conexión a la base de datos: " + ex.getMessage());
				}
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

		ventanaPrincipal.login.getBtnAtzera().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("OngiEtorri");
			}
		});

		ventanaPrincipal.profil_Berria.btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}

		});

		ventanaPrincipal.profil_Berria.btnUtzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Login");
			}
		});

		ventanaPrincipal.login.getBtnAgentzia_berri().addActionListener(new ActionListener() {
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
				ventanaPrincipal.bidai_Berria.guardarDatos();
			}
		});

		ventanaPrincipal.ekitaldi_Berria.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiEkitaldia");
			}
		});

		ventanaPrincipal.ekitaldi_Berria.btnOstatua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Ostatua");
			}
		});

		ventanaPrincipal.bidai_Ekitaldi.btnEkitaldiBerri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("EkitaldiBerria");
			}
		});

		ventanaPrincipal.ostatua.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("EkitaldiBerria");
			}
		});

		ventanaPrincipal.ekitaldi_Berria.btnHegaldia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("Hegaldia");
			}
		});
		ventanaPrincipal.ekitaldi_Berria.btnBesteBatzuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BesteBatzuk");
			}
		});
		ventanaPrincipal.hegaldia.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("EkitaldiBerria");
			}
		});
		ventanaPrincipal.besteBatzuk.btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("EkitaldiBerria");
			}
		});
		ventanaPrincipal.profil_Berria.btnGorde.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	ventanaPrincipal.profil_Berria.guardarDatos();
		    }
		});
		ventanaPrincipal.ostatua.btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.verPaneles("BidaiEkitaldia");
				ventanaPrincipal.ostatua.guardarOstatua();
			}

			
		});	
	}
	public int bidaiKopurua() {
		return kopurua;
	}

}