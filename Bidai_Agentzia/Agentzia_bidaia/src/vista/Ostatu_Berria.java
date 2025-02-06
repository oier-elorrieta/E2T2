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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ostatu_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField izenaTestua;
	private JTextField textField;
	private JTextField textField_1;
	public JButton btnAtzera;
	public JComboBox ekitaldiMota;
	public JComboBox logelaMota;
	

	/**
	 * Create the panel.
	 */
	public Ostatu_Berria() {
		setLayout(null);
		setBounds(100, 100, 500, 500);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(111, 145, 102));
		panel.setBounds(57, 61, 379, 336);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ekitaldiaren Izena");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(52, 32, 118, 14);
		panel.add(lblNewLabel);

		izenaTestua = new JTextField();
		izenaTestua.setBounds(204, 32, 147, 20);
		panel.add(izenaTestua);
		izenaTestua.setColumns(10);

		ekitaldiMota = new JComboBox();
		ekitaldiMota.setBounds(204, 63, 147, 22);
		panel.add(ekitaldiMota);

		JLabel lblNewLabel_1 = new JLabel("Ekitaldi Mota");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(52, 64, 85, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Logela Mota");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(52, 98, 85, 14);
		panel.add(lblNewLabel_2);

		logelaMota = new JComboBox();
		logelaMota.setBounds(204, 97, 147, 22);
		panel.add(logelaMota);

		textField = new JTextField();
		textField.setBounds(204, 130, 147, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Herrialdea");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(52, 130, 85, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Prezioa");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(52, 162, 85, 14);
		panel.add(lblNewLabel_3_1);

		JButton btnNewButton = new JButton("Bilatu ostatua");
		btnNewButton.setBounds(93, 281, 147, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Hasiera data");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(52, 196, 85, 14);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Amaiera data");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(52, 230, 85, 14);
		panel.add(lblNewLabel_5);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 162, 147, 20);
		panel.add(textField_1);

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel lblNewLabel_6 = new JLabel("OSTATUA");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_6.setBounds(207, 29, 108, 23);
		add(lblNewLabel_6);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));

		logelaMotaDB();
		
		
	}
	private void logelaMotaDB() {
        String url = "jdbc:mysql://localhost:2025/db_bidai_agentzia";
        String usuario = "root";  
        String contraseña = "";  
        String query = "SELECT deskribapena FROM logela_mota";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                logelaMota.addItem(rs.getString("deskribapena"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
