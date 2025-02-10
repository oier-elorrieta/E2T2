package vista;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Profil_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnGorde;
	public JButton btnUtzi;
	public JButton btnAtzera;
	public JComboBox agentzia;
	public JComboBox langile;
	private JTextField erabiltzaile, logo, kolorea, pasahitza;

	/**
	 * Create the panel.
	 */
	public Profil_Berria() {

		setBounds(100, 100, 1280, 720);
		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(144, 73, 1026, 521);
		panel_1.setBackground(new Color(111, 147, 102));
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("AGENTZIA BERRIA");
		lblNewLabel_1.setBounds(395, 27, 230, 31);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_1);

		JTextField izena = new JTextField();
		izena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		izena.setBounds(496, 105, 223, 36);
		panel_1.add(izena);
		izena.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Markaren kolorea");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(215, 168, 215, 33);
		panel_1.add(lblNewLabel_2);

		JTextField logoa = new JTextField();
		logoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		logoa.setBounds(495, 338, 224, 44);
		panel_1.add(logoa);
		logoa.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Langile kopurua");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(215, 221, 189, 44);
		panel_1.add(lblNewLabel_3);

		// ----------------------------------------------------------------
		// ------------------LANGILE MOTA COMBO BOX------------------------
		// ----------------------------------------------------------------
		langile = new JComboBox();
		langile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		langile.setBounds(496, 221, 223, 36);
		panel_1.add(langile);

		JLabel lblNewLabel_4 = new JLabel("Agentzia mota");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(215, 276, 143, 44);
		panel_1.add(lblNewLabel_4);

		// ----------------------------------------------------------------
		// ------------------AGENTZIA COMBO BOX----------------------------
		// ----------------------------------------------------------------
		agentzia = new JComboBox();
		agentzia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		agentzia.setBounds(496, 280, 223, 36);
		panel_1.add(agentzia);

		JLabel lblNewLabel_5 = new JLabel("Logoa");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(215, 349, 143, 33);
		panel_1.add(lblNewLabel_5);

		JPanel kolorea = new JPanel();
		kolorea.setBounds(647, 168, 72, 33);
		kolorea.setBackground(Color.WHITE);
		panel_1.add(kolorea);

		// ----------------------------------------------------------------
		// ------------------KOLOREKO PANELA-------------------------------
		// ----------------------------------------------------------------
		JButton colorButton = new JButton("Kolorea erabaki");
		colorButton.setBounds(496, 166, 129, 35);
		panel_1.add(colorButton);

		colorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color selectedColor = JColorChooser.showDialog(panel_1, "Elige un color", kolorea.getBackground());
				if (selectedColor != null) {
					kolorea.setBackground(selectedColor);
					logoa.setText("#" + Integer.toHexString(selectedColor.getRGB()).substring(2).toUpperCase());
				}
			}
		});

		JLabel lblNewLabel = new JLabel("Agentzia Izena");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(215, 105, 189, 44);
		panel_1.add(lblNewLabel);

		// ----------------------------------------------------------------
		// ------------------GORDE BOTOIA----------------------------------
		// ----------------------------------------------------------------
		btnGorde = new JButton("Gorde");
		btnGorde.setBounds(59, 452, 105, 33);
		panel_1.add(btnGorde);

		// ----------------------------------------------------------------
		// ------------------UTZI BOTOIA-----------------------------------
		// ----------------------------------------------------------------
		btnUtzi = new JButton("Utzi");
		btnUtzi.setBounds(173, 452, 95, 33);
		panel_1.add(btnUtzi);

		// ----------------------------------------------------------------
		// ------------------ATZERA BOTOIA----f-----------------------------
		// ----------------------------------------------------------------
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
		add(labelConImagen);

		langileKopDB();
		agentziaMotaDB();
	}

	// ----------------------------------------------------------------
	// ------------------METODO LANGILEAK-----------------------------
	// ----------------------------------------------------------------
	private void langileKopDB() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT deskribapena FROM langile_kop";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				langile.addItem(rs.getString("deskribapena"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------------
	// ------------------METODO AGENTZIA-----------------------------
	// ----------------------------------------------------------------
	private void agentziaMotaDB() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT deskribapena FROM agentzia_mota";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				agentzia.addItem(rs.getString("deskribapena"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
