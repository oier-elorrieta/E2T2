package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Profil_Berria extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Profil_Berria() {
		setLayout(null);

		setBounds(100, 100, 500, 500);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(112, 53, 296, 363);
		panel_1.setBackground(new Color(255, 255, 255, 120));
		add(panel_1);
		setComponentZOrder(panel_1, 0);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bidai berria");
		lblNewLabel.setBounds(40, 40, 89, 14);
		panel_1.add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setBounds(151, 37, 123, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Bidai mota");
		lblNewLabel_1.setBounds(40, 77, 74, 14);
		panel_1.add(lblNewLabel_1);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(151, 73, 123, 22);
		panel_1.add(comboBox);

		comboBox.addItem("Bidai Simplea");
		comboBox.addItem("Bidai Ostatua");

		JLabel lblNewLabel_2 = new JLabel("Bidai hasiera");
		lblNewLabel_2.setBounds(40, 119, 89, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Herrialdea");
		lblNewLabel_3.setBounds(40, 193, 89, 14);
		panel_1.add(lblNewLabel_3);

		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(151, 189, 123, 22);
		panel_1.add(comboBox_1);

		JLabel lblNewLabel_4 = new JLabel("Deskribapena");
		lblNewLabel_4.setBounds(40, 240, 89, 14);
		panel_1.add(lblNewLabel_4);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(151, 237, 123, 46);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Zerbitzuetan ez");
		lblNewLabel_5.setBounds(40, 292, 89, 32);
		panel_1.add(lblNewLabel_5);

		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(151, 298, 123, 46);
		panel_1.add(textField_2);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/fondo2.jpg")));
		add(labelConImagen);

		setComponentZOrder(labelConImagen, getComponentCount() - 1);
		/* ESTO DEBE SER DESDE LA DATU BASE */
		String[] paises = { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda",
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

		}
	}

}
