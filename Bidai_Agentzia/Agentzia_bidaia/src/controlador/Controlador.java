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
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidai_agentzia",
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
			public void actionPerformed(ActionEvent e) {
				agentziaBD();
			}
		});
		
		
		
		
	  /*private void AgentziaDatuak(int agentzia_id, String izena, String logoa,
	  String marka_kolore, String erabiltzaile, String pasahitza, int agentzia_kod,
	  int langile_kod) {
	  
	  Connection conexion = Conexion_DB.conectar();
	  
	  try { String sql =
	  "INSERT INTO agentzia (agentzia_id, izena, logoa, marka_kolore, erabiltzailea, pasahitza, agentzia_kod, langile_kod) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
	  ; PreparedStatement stmt = conexion.prepareStatement(sql); stmt.setInt(1,
	  agentzia_id); stmt.setString(2, izena); stmt.setString(3, logoa);
	  stmt.setString(4, marka_kolore); stmt.setString(5, erabiltzaile);
	  stmt.setString(6, pasahitza); stmt.setInt(7, agentzia_kod); stmt.setInt(8,
	  langile_kod); stmt.executeUpdate();
	 
	  JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
	  conexion.close(); } catch (Exception ex) {
	  JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
	  }*/
	  
	  
	  
	 /* ventanaPrincipal.bidai_Ekitaldi.btnEzabatu.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              int filaSeleccionada = ventanaPrincipal.bidai_Ekitaldi.bidaiakTaula.getSelectedRow(); // Obtener fila seleccionada
              if (filaSeleccionada != -1) { // Verificar que hay una fila seleccionada
                  modelo.removeRow(filaSeleccionada); // Eliminar la fila
              } else {
                  JOptionPane.showMessageDialog("Seleccione una fila para eliminar.");
              }
          }
      });*/
	 }
	 public void agentziaBD() {
	        String sql = "INSERT INTO agentzia (izena, logoa, marka_kolore, erabiltzaile, pasahitza, agentzia_kod, langile_kod) VALUES (?, ?, ?, ?. ?, ?, ?)";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            for (int i = 0; i < kopurua; i++) {
	                pstmt.setString(1, agentziak[i].getIzena());
	                pstmt.setString(2, agentziak[i].getLogo());
	                pstmt.setString(3, agentziak[i].getKolorea());
	                pstmt.setString(4, agentziak[i].getErabiltzailea());
	                pstmt.setString(5, agentziak[i].getPasahitza());
	                pstmt.setString(6, agentziak[i].getAgentzia_kod());
	                pstmt.setString(7, agentziak[i].getLangile_kod());
	                pstmt.executeUpdate();
	                
	                int rowsInserted = pstmt.executeUpdate();
	                if (rowsInserted > 0) {
	                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
	                }

	                conn.close();
	            }
	        } catch (SQLException e) {
	            System.out.println("Bidaiak gordetzeko errorea: " + e.getMessage());
	        }
	        Connection conn = Conexion_DB.conectar();
	        if (conn == null) {
	            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
	            return;
	        }
	    }
	 public int bidaiKopurua() {
	        return kopurua;
	    }
	 
	    public void cargarBD() {
	        try {
	            Statement sentencia = conn.createStatement();
	            String sql = "SELECT * FROM agentzia";
	            ResultSet result = sentencia.executeQuery(sql);

	            while (result.next() && kopurua < agentziak.length) {
	                String izena = result.getString("izena");
	                String logo = result.getString("logo");
	                String kolorea = result.getString("kolorea");
	                String erabiltzailea = result.getString("erabiltzailea");
	                String pasahitza = result.getString("pasahitza");
	                String agentzia_kod = result.getString("agentzia_kod");
	                String langile_kod = result.getString("langile_kod");
	              

	                Agentzia agentzia = new Agentzia(izena, logo, kolorea, erabiltzailea, pasahitza, agentzia_kod, langile_kod);
	                agentziak[kopurua++] = agentzia;
	            }

	            result.close();
	            sentencia.close();
	            System.out.println("Datu baseko emailak kargatu dira.");
	        } catch (SQLException e) {
	            System.out.println("DB-a kargatzeko errorea: " + e.getMessage());
	        }
	    }
	 
}