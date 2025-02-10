package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Beste_Batzuk extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public JComboBox jarMota;

	/**
	 * Create the panel.
	 */
	public Beste_Batzuk() {

		setLayout(null);

		setBounds(100, 100, 1280, 720);

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

		jarMota = new JComboBox();
		jarMota.setBounds(638, 151, 201, 34);
		panel.add(jarMota);

		JLabel lblNewLabel = new JLabel("Jarduera mota");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(375, 152, 149, 25);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(638, 95, 201, 34);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Deskripzioa");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(375, 208, 170, 34);
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(637, 208, 202, 64);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(637, 296, 202, 34);
		panel.add(textField_2);
		textField_2.setColumns(10);

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

		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(47, 424, 149, 49);
		panel.add(btnNewButton);

		JLabel lblNewLabel_6 = new JLabel("JARDUERA ");
		lblNewLabel_6.setBounds(522, 29, 122, 23);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 22));

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
	
		jardueraMotaDB();
	}

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



}
