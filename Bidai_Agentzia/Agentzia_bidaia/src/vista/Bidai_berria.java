package vista;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Bidai_berria extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	public JButton btnGorde;
	public JComboBox comboBox_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Bidai_berria() {
		setLayout(null);

		setBounds(100, 100, 1280, 720);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(69, 65, 1097, 524);
		panel_1.setBackground(new Color(111, 147, 102));
		add(panel_1);
		setComponentZOrder(panel_1, 0);
		panel_1.setLayout(null);

		JTextField textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(356, 65, 290, 35);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Bidai mota");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(132, 125, 167, 35);
		panel_1.add(lblNewLabel_1);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(356, 127, 290, 35);
		panel_1.add(comboBox);

		comboBox.addItem("Bidai Simplea");
		comboBox.addItem("Bidai Ostatua");

		JLabel lblNewLabel_2 = new JLabel("Bidai hasiera");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(721, 65, 172, 36);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_2_2 = new JLabel("Bidai amaiera");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));

		lblNewLabel_2_2.setBounds(721, 180, 167, 46);

		panel_1.add(lblNewLabel_2_2);

		JLabel lblNewLabel_3 = new JLabel("Herrialdea");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(132, 186, 167, 35);
		panel_1.add(lblNewLabel_3);

		comboBox_1 = new JComboBox<>();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(356, 188, 290, 35);
		panel_1.add(comboBox_1);

		JLabel lblNewLabel_4 = new JLabel("Deskribapena");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(132, 246, 172, 35);
		panel_1.add(lblNewLabel_4);

		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(356, 246, 290, 79);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Zerbitzuetan ez");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(132, 325, 255, 35);
		panel_1.add(lblNewLabel_5);

		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(356, 336, 290, 80);
		panel_1.add(textField_2);

		JLabel lblNewLabel = new JLabel("Bidai berria");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(132, 62, 167, 36);
		panel_1.add(lblNewLabel);
		
				btnGorde = new JButton("Gorde");
				btnGorde.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnGorde.setBounds(55, 442, 122, 46);
				panel_1.add(btnGorde);
				btnGorde.setBackground(new Color(111, 147, 102));
				
				textField_3 = new JTextField();
				textField_3.setBounds(721, 101, 239, 46);
				panel_1.add(textField_3);
				textField_3.setColumns(10);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(721, 224, 239, 46);
				panel_1.add(textField_4);

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
		add(labelConImagen);

		/* ESTO DEBE SER DESDE LA DATU BASE */
		
		/* String[] paises = { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda",
		 
				"Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas",
				"Bangladés", "Barbados", "Baréin", "Belice", "Benín", "Bielorrusia", "Birmania", "Bosnia y Herzegovina",
				"Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya",
				"Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras",
				"Congo (República del)", "Corea del Norte", "Corea del Sur", "Costa Rica", "Croacia", "Cuba", "Curazao",
				"Chipre", "Dominica", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia",
				"Eslovenia", "España", "Estados Unidos", "Estonia", "Esuatini", "Etiopía", "Fiyi", "Filipinas",
				"Finlandia", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala",
				"Guinea", "Guinea-Bisáu", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak",
				"Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica",
				"Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kosovo", "Kuwait", "Laos",
				"Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo",
				"Madagascar", "Malawi", "Malasia", "Malaui", "Maldivas", "Mali", "Malta", "Marruecos", "Mauricio",
				"Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique",
				"Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán",
				"Pakistán", "Palau", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal",
				"Puerto Rico", "Qatar", "Rumanía", "Rusia", "Ruanda", "San Cristóbal y Nieves", "San Marino",
				"San Vicente y las Granadinas", "Santa Lucía", "Senegal", "Serbia", "Seychelles", "Sierra Leona",
				"Singapur", "Siria", "Somalia", "Sri Lanka", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza",
				"Surinam", "Siria", "Taiwán", "Tanzania", "Tailandia", "Togo", "Tonga", "Trinidad y Tobago", "Túnez",
				"Turkmenistán", "Turquía", "Tuvalu", "Uganda", "Ucrania", "Uruguay", "Vanuatu", "Venezuela", "Vietnam",
				"Yemen", "Yibuti", "Zambia", "Zimbabue" };

		for (String pais : paises) {
			comboBox_1.addItem(pais);

		}*/
		
		HerrialdeakDB();
    }

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

