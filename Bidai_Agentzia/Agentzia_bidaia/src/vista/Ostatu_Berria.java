package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;
import vista.Bidai_Ekitaldi;

public class Ostatu_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField izenaTestua;
	private JTextField herrialdea;
	private JTextField prezio;
	public JButton btnAtzera;
	public JComboBox ekitaldiMota;
	public JComboBox logelaMota;
	public JDateChooser dataHasiera, dataAmaiera;
	public JButton btnGorde;

	/**
	 * Create the panel.
	 */
	public Ostatu_Berria() {
		setLayout(null);
		setBounds(100, 100, 1280, 720);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(111, 145, 102));
		panel.setBounds(58, 61, 1124, 534);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ekitaldiaren Izena");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(140, 90, 172, 32);
		panel.add(lblNewLabel);

		izenaTestua = new JTextField();
		izenaTestua.setBounds(356, 94, 227, 32);
		panel.add(izenaTestua);
		izenaTestua.setColumns(10);

		// ----------------------------------------------------------------
		// ------------------EKITALDI COMBOBOX-----------------------------
		// ----------------------------------------------------------------
		ekitaldiMota = new JComboBox();
		ekitaldiMota.setBounds(356, 149, 227, 32);
		panel.add(ekitaldiMota);

		JLabel lblNewLabel_1 = new JLabel("Ekitaldi Mota");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(140, 145, 150, 32);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Logela Mota");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(140, 204, 159, 32);
		panel.add(lblNewLabel_2);

		// ----------------------------------------------------------------
		// ------------------LOGELA MOTA COMBO BOX-------------------------
		// ----------------------------------------------------------------
		logelaMota = new JComboBox();
		logelaMota.setBounds(356, 208, 227, 32);
		panel.add(logelaMota);

		herrialdea = new JTextField();
		herrialdea.setBounds(356, 264, 227, 32);
		panel.add(herrialdea);
		herrialdea.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Herrialdea");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(140, 255, 185, 42);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Prezioa");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(140, 318, 150, 32);
		panel.add(lblNewLabel_3_1);

		btnGorde = new JButton("Gorde ostatua");
		btnGorde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGorde.setBounds(40, 449, 159, 50);
		panel.add(btnGorde);

		JLabel lblNewLabel_4 = new JLabel("Hasiera data");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(712, 149, 159, 32);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Amaiera data");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(712, 259, 164, 32);
		panel.add(lblNewLabel_5);

		prezio = new JTextField();
		prezio.setColumns(10);
		prezio.setBounds(356, 322, 227, 32);
		panel.add(prezio);

		JLabel lblNewLabel_6 = new JLabel("OSTATUA");
		lblNewLabel_6.setBounds(510, 27, 108, 23);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 22));

		// ----------------------------------------------------------------
		// ------------------IRTEERA DATAK-------------------------
		// ----------------------------------------------------------------
		dataHasiera = new JDateChooser();
		dataHasiera.setBounds(712, 181, 218, 32);
		panel.add(dataHasiera);

		dataAmaiera = new JDateChooser();
		dataAmaiera.setBounds(712, 291, 218, 32);
		panel.add(dataAmaiera);

		// ----------------------------------------------------------------
		// ----------------------ATZERA BOTOIA-----------------------------
		// ----------------------------------------------------------------
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));

		logelaMotaDB();

	}

	// ----------------------------------------------------------------
	// ------------------METODO LOGELA MOTA----------------------------
	// ----------------------------------------------------------------
	private void logelaMotaDB() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT logela_kod FROM logela_mota";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				logelaMota.addItem(rs.getString("logela_kod"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------------
	// ------------------METODO GUARDAR DATOS--------------------------
	// ----------------------------------------------------------------
	public void guardarOstatua() {
	    String izena = izenaTestua.getText();
	    String prezioa = prezio.getText();
	    Date hasieraData = new Date(dataHasiera.getDate().getTime());
	    Date amaieraData = new Date(dataAmaiera.getDate().getTime());
	    Object logelaMot = logelaMota.getSelectedItem();
	    String hiria = herrialdea.getText();
	    int zerb_kod = 3;

	    String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
	    String usuario = "root";
	    String contraseña = "";
	    String query = "INSERT INTO ostatua (zerb_kod, izena, prezioa, hiria, sarrera_egun, ireeta_egun, logela_kod) VALUES (?, ?, ?, ?, ?, ?, ?)";

	    try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	         PreparedStatement ps = conexion.prepareStatement(query)) {
	        ps.setInt(1, zerb_kod);
	        ps.setString(2, izena);
	        ps.setString(3, prezioa);
	        ps.setString(4, hiria);
	        ps.setDate(5, hasieraData);
	        ps.setDate(6, amaieraData);
	        ps.setObject(7, logelaMot);
	        ps.executeUpdate();

	        Bidai_Ekitaldi.cargarDatosTablaEkitaldi();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}

	
}
