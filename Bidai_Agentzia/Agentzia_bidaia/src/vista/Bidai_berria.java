package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class Bidai_berria extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	public JButton btnGorde;
	public JComboBox<String> comboBox_1;
	public JDateChooser dateChooserInicio, dateChooserFin;
	public JTextField textFieldIzena, textFieldDeskribapena, textFieldIraupen;
	public JComboBox<String> comboBoxMota;

	public Bidai_berria() {
		setLayout(null);
		setBounds(100, 100, 1280, 720);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(69, 65, 1097, 524);
		panel_1.setBackground(new Color(111, 147, 102));
		add(panel_1);
		panel_1.setLayout(null);

		btnGorde = new JButton("Gorde");
		btnGorde.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGorde.setBounds(55, 442, 122, 46);
		panel_1.add(btnGorde);
		btnGorde.setBackground(Color.WHITE);

		JLabel lblIzena = new JLabel("Izena:");
		lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIzena.setForeground(Color.WHITE);
		lblIzena.setBounds(132, 62, 167, 36);
		panel_1.add(lblIzena);

		textFieldIzena = new JTextField();
		textFieldIzena.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldIzena.setBounds(356, 65, 290, 35);
		panel_1.add(textFieldIzena);

		JLabel lblMota = new JLabel("Bidai mota:");
		lblMota.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMota.setForeground(Color.WHITE);
		lblMota.setBounds(132, 125, 167, 35);
		panel_1.add(lblMota);

		comboBoxMota = new JComboBox<>();
		comboBoxMota.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxMota.setBounds(356, 127, 290, 35);
		panel_1.add(comboBoxMota);
		comboBoxMota.addItem("Bidai Simplea");
		comboBoxMota.addItem("Bidai Ostatua");

		JLabel lblHerrialdea = new JLabel("Herrialdea:");
		lblHerrialdea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHerrialdea.setForeground(Color.WHITE);
		lblHerrialdea.setBounds(132, 186, 167, 35);
		panel_1.add(lblHerrialdea);

		comboBox_1 = new JComboBox<>();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(356, 188, 290, 35);
		panel_1.add(comboBox_1);

		JLabel lblDeskribapena = new JLabel("Deskribapena:");
		lblDeskribapena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDeskribapena.setForeground(Color.WHITE);
		lblDeskribapena.setBounds(132, 246, 172, 35);
		panel_1.add(lblDeskribapena);

		textFieldDeskribapena = new JTextField();
		textFieldDeskribapena.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldDeskribapena.setBounds(356, 246, 290, 35);
		panel_1.add(textFieldDeskribapena);

		JLabel lblIraupen = new JLabel("Bidai Iraupena:");
		lblIraupen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIraupen.setForeground(Color.WHITE);
		lblIraupen.setBounds(132, 325, 255, 35);
		panel_1.add(lblIraupen);

		textFieldIraupen = new JTextField();
		textFieldIraupen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldIraupen.setBounds(356, 336, 290, 35);
		panel_1.add(textFieldIraupen);

		dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(721, 101, 261, 35);
		panel_1.add(dateChooserInicio);

		dateChooserFin = new JDateChooser();
		dateChooserFin.setBounds(721, 223, 261, 35);
		panel_1.add(dateChooserFin);

		JLabel lblHasieraData = new JLabel("Hasiera data:");
		lblHasieraData.setForeground(Color.WHITE);
		lblHasieraData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHasieraData.setBounds(721, 65, 167, 36);
		panel_1.add(lblHasieraData);

		JLabel lblAmaieraData = new JLabel("Amaiera data:");
		lblAmaieraData.setForeground(Color.WHITE);
		lblAmaieraData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAmaieraData.setBounds(721, 185, 167, 36);
		panel_1.add(lblAmaieraData);

		btnAtzera = new JButton("X");
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
		
		HerrialdeakDB();
		
	}

	// ----------------------------------------------------------------
	// ------------------METODO GUARDAR DATOS--------------------------
	// ----------------------------------------------------------------
	public void guardarDatos() {
		String izena = textFieldIzena.getText();
		String deskribapena = textFieldDeskribapena.getText();
		double iraupena = Double.parseDouble(textFieldIraupen.getText());
		Date hasieraData = new Date(dateChooserInicio.getDate().getTime());
		Date amaieraData = new Date(dateChooserFin.getDate().getTime());
		Object herrialdea = comboBox_1.getSelectedItem();
		int agentziaId = 1;
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "INSERT INTO bidaia (izena, deskribapena, bidai_iraupen, hasiera_data, amaiera_data, agentzia_id, herrialdea) VALUES (?, ?, ?, ?, ?, ?, ?)";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query)) {
			ps.setString(1, izena);
			ps.setString(2, deskribapena);
			ps.setDouble(3, iraupena);
			ps.setDate(4, hasieraData);
			ps.setDate(5, amaieraData);
			ps.setInt(6, agentziaId);
			ps.setObject(7, herrialdea);
			ps.executeUpdate();

			Bidai_Ekitaldi.cargarDatosTablaBidaiak();
		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

	// ----------------------------------------------------------------
	// ------------------METODO COMBOBOX-----------------------------
	// ----------------------------------------------------------------
	private void HerrialdeakDB() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT herrialdea FROM herrialdeak";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				comboBox_1.addItem(rs.getString("herrialdea"));
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}