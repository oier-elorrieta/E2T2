package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Beste_Batzuk extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera, btnGorde;
	private JTextField izena;
	private JTextField deskripzioa;
	private JTextField prezioa;
	public JComboBox jarMota;
	public JDateChooser dataHasiera;

	/**
	 * Create the panel.
	 */
	public Beste_Batzuk() {

		setLayout(null);

		setBounds(100, 100, 1280, 720);

		// ----------------------------------------------------------------
		// ----------------------ATZERA BOTOIA-----------------------------
		// ----------------------------------------------------------------
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(111, 145, 102));
		panel.setBounds(73, 78, 1138, 514);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Izena");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(375, 91, 163, 34);
		panel.add(lblNewLabel_1);

		// ----------------------------------------------------------------
		// -----------------------MOTA ERABAKI-----------------------------
		// ----------------------------------------------------------------
		jarMota = new JComboBox();
		jarMota.setBounds(638, 151, 201, 34);
		panel.add(jarMota);

		JLabel lblNewLabel = new JLabel("Jarduera mota");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(375, 152, 149, 25);
		panel.add(lblNewLabel);

		izena = new JTextField();
		izena.setBounds(638, 95, 201, 34);
		panel.add(izena);
		izena.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Deskripzioa");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(375, 208, 170, 34);
		panel.add(lblNewLabel_2);

		deskripzioa = new JTextField();
		deskripzioa.setBounds(637, 208, 202, 64);
		panel.add(deskripzioa);
		deskripzioa.setColumns(10);

		prezioa = new JTextField();
		prezioa.setBounds(637, 296, 202, 34);
		panel.add(prezioa);
		prezioa.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("Prezioa");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(374, 292, 127, 34);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("Data");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(374, 355, 113, 34);
		panel.add(lblNewLabel_3);
		
		dataHasiera = new JDateChooser();
		dataHasiera.setBounds(638, 357, 201, 32);
		panel.add(dataHasiera);

		// ----------------------------------------------------------------
		// -----------------------GORDE BOTOIA-----------------------------
		// ----------------------------------------------------------------
		btnGorde = new JButton("Gorde");
		btnGorde.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGorde.setBounds(47, 424, 149, 49);
		panel.add(btnGorde);

		JLabel lblNewLabel_6 = new JLabel("JARDUERA ");
		lblNewLabel_6.setBounds(522, 29, 122, 23);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 22));

		// ----------------------------------------------------------------
		// --------------------ATZEKO ARGAZKIA-----------------------------
		// ----------------------------------------------------------------
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));

		jardueraMotaDB();
	}

	// ----------------------------------------------------------------
	// ------------------METODO COMBOBOX-------------------------------
	// ----------------------------------------------------------------
	private void jardueraMotaDB() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT deskribapena FROM logela_mota";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				jarMota.addItem(rs.getString("deskribapena"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ----------------------------------------------------------------
		// ------------------METODO GUARDAR DATOS--------------------------
		// ----------------------------------------------------------------
		public void guardarBesteBatzuk() {
		    String izen = izena.getText();
		    String prezio = prezioa.getText();
		    Date hasieraData = new Date(dataHasiera.getDate().getTime());
		    String deskrip = deskripzioa.getText();
		    int zerb_kod = 3;

		    String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		    String usuario = "root";
		    String contraseña = "";
		    String query = "INSERT INTO beste_batzuk (zerb_kod, izena, deskribapena, prezioa, eguna) VALUES (?, ?, ?, ?, ?)";

		    try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
		         PreparedStatement ps = conexion.prepareStatement(query)) {
		        ps.setInt(1, zerb_kod);
		        ps.setString(2, izen);
		        ps.setString(4, prezio);
		        ps.setString(3, deskrip);
		        ps.setDate(5, hasieraData);
		        ps.executeUpdate();

		        Bidai_Ekitaldi.cargarDatosTablaEkitaldi();
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		}
}
