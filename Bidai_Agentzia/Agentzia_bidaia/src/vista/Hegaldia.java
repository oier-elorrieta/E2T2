package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Hegaldia extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	public JComboBox joan;
	public JComboBox etorri;

	/**
	 * Create the panel.
	 */
	public Hegaldia() {
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
		panel.setBackground(new Color(111, 145, 102));
		panel.setBounds(47, 45, 1159, 562);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ekitaldi Izena");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(87, 133, 229, 35);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(303, 133, 201, 35);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Bidai Mota");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(87, 179, 224, 35);
		panel.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(303, 179, 201, 35);
		panel.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(303, 225, 201, 35);
		panel.add(comboBox_1);

		JLabel lblNewLabel_2 = new JLabel("Trayecto");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(88, 229, 164, 31);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Aireportu Joan");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(88, 275, 210, 35);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Aireportu Etorri");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(88, 321, 174, 31);
		panel.add(lblNewLabel_4);

		// ----------------------------------------------------------------
		// ------------------JOAN ETORRI COMBOBOX--------------------------
		// ----------------------------------------------------------------
		joan = new JComboBox();
		joan.setBounds(303, 271, 201, 35);
		panel.add(joan);

		etorri = new JComboBox();
		etorri.setBounds(303, 317, 201, 35);
		panel.add(etorri);

		JLabel lblNewLabel_5 = new JLabel("Data Joan");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(600, 45, 149, 31);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Data Etorri");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(887, 45, 159, 31);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("Hegaldi Kodea");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(887, 142, 224, 31);
		panel.add(lblNewLabel_8);

		textField_2 = new JTextField();
		textField_2.setBounds(887, 173, 174, 35);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Prezioa");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(936, 462, 125, 31);
		panel.add(lblNewLabel_9);

		textField_3 = new JTextField();
		textField_3.setBounds(936, 494, 125, 31);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_10_1 = new JLabel("Airelinea");
		lblNewLabel_10_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_1.setBounds(887, 205, 174, 36);
		panel.add(lblNewLabel_10_1);

		textField_5 = new JTextField();
		textField_5.setBounds(887, 238, 174, 31);
		panel.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Irteera ordua");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(887, 270, 201, 36);
		panel.add(lblNewLabel_12);

		textField_7 = new JTextField();
		textField_7.setBounds(887, 306, 174, 31);
		panel.add(textField_7);
		textField_7.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(887, 369, 174, 31);
		panel.add(textField_9);

		JLabel lblNewLabel_13_1 = new JLabel("Iraupena");
		lblNewLabel_13_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13_1.setBounds(887, 339, 149, 30);
		panel.add(lblNewLabel_13_1);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(600, 173, 174, 35);
		panel.add(textField_10);

		JLabel lblNewLabel_8_1 = new JLabel("Hegaldi Kodea");
		lblNewLabel_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(600, 142, 224, 31);
		panel.add(lblNewLabel_8_1);

		JLabel lblNewLabel_10_1_1 = new JLabel("Airelinea");
		lblNewLabel_10_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_1_1.setBounds(600, 205, 174, 36);
		panel.add(lblNewLabel_10_1_1);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(600, 238, 174, 31);
		panel.add(textField_11);

		JLabel lblNewLabel_12_1 = new JLabel("Irteera ordua");
		lblNewLabel_12_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12_1.setBounds(600, 270, 201, 36);
		panel.add(lblNewLabel_12_1);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(600, 306, 174, 31);
		panel.add(textField_12);

		JLabel lblNewLabel_13_1_1 = new JLabel("Iraupena");
		lblNewLabel_13_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_13_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13_1_1.setBounds(600, 339, 149, 30);
		panel.add(lblNewLabel_13_1_1);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(600, 369, 174, 31);
		panel.add(textField_13);

		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(59, 474, 141, 49);
		panel.add(btnNewButton);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		add(labelConImagen);
		labelConImagen.setBackground(new Color(111, 145, 102));
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));

		aireportuDB();

	}

	// ----------------------------------------------------------------
	// ------------------METODO COMBOBOX-----------------------------
	// ----------------------------------------------------------------
	private void aireportuDB() {
		String url = "jdbc:mysql://localhost:2025/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT hiria FROM aireportua";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				joan.addItem(rs.getString("hiria"));
				etorri.addItem(rs.getString("hiria"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
