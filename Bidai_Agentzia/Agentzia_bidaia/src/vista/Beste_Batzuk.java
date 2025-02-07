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

		setBounds(100, 100, 500, 500);

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(111, 145, 102));
		panel.setBounds(56, 78, 387, 313);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Izena");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(47, 38, 46, 14);
		panel.add(lblNewLabel_1);

		jarMota = new JComboBox();
		jarMota.setBounds(204, 68, 137, 22);
		panel.add(jarMota);

		JLabel lblNewLabel = new JLabel("Jarduera mota");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(47, 72, 101, 14);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(204, 35, 137, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Deskripzioa");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(47, 123, 101, 14);
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(204, 120, 137, 56);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(204, 201, 137, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("Prezioa");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(47, 204, 101, 14);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("Data");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(47, 247, 46, 14);
		panel.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.setBounds(47, 272, 89, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_6 = new JLabel("JARDUERA ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_6.setBounds(193, 44, 122, 23);
		add(lblNewLabel_6);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
	
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
