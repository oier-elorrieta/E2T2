package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class Ostatu_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField izenaTestua;
	private JTextField textField;
	private JTextField textField_1;
	public JButton btnAtzera;

	/**
	 * Create the panel.
	 */
	public Ostatu_Berria() {
		setLayout(null);
		setBounds(100, 100, 500, 500);

		JPanel panel = new JPanel();
		panel.setBounds(96, 61, 321, 336);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ekitaldiaren Izena");
		lblNewLabel.setBounds(52, 32, 85, 14);
		panel.add(lblNewLabel);

		izenaTestua = new JTextField();
		izenaTestua.setBounds(166, 29, 118, 20);
		panel.add(izenaTestua);
		izenaTestua.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(166, 60, 118, 22);
		panel.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Ekitaldi Mota");
		lblNewLabel_1.setBounds(52, 64, 85, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Logela Mota");
		lblNewLabel_2.setBounds(52, 98, 85, 14);
		panel.add(lblNewLabel_2);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(166, 94, 118, 22);
		panel.add(comboBox_1);

		textField = new JTextField();
		textField.setBounds(166, 127, 118, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Herrialdea");
		lblNewLabel_3.setBounds(52, 130, 85, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Prezioa");
		lblNewLabel_3_1.setBounds(52, 162, 85, 14);
		panel.add(lblNewLabel_3_1);

		JButton btnNewButton = new JButton("Bilatu ostatua");
		btnNewButton.setBounds(93, 281, 147, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Hasiera data");
		lblNewLabel_4.setBounds(52, 196, 85, 14);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Amaiera data");
		lblNewLabel_5.setBounds(52, 230, 85, 14);
		panel.add(lblNewLabel_5);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 159, 118, 20);
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

	}
}
