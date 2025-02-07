package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Hegaldia extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/**
	 * Create the panel.
	 */
	public Hegaldia() {
		setLayout(null);

		setBounds(100, 100, 500, 500);
		
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(111, 145, 102));
		panel.setBounds(32, 45, 440, 383);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ekitaldi Iznea");
		lblNewLabel.setBounds(51, 28, 88, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(220, 25, 132, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Bidai Mota");
		lblNewLabel_1.setBounds(51, 53, 88, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(220, 49, 132, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(220, 77, 132, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Trayecto");
		lblNewLabel_2.setBounds(51, 81, 88, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aireportu Joan");
		lblNewLabel_3.setBounds(51, 106, 109, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Aireportu Etorri");
		lblNewLabel_4.setBounds(51, 131, 125, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(220, 102, 132, 22);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(219, 127, 133, 22);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_5 = new JLabel("Data Joan");
		lblNewLabel_5.setBounds(51, 159, 88, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Data Etorri");
		lblNewLabel_6.setBounds(220, 160, 109, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hegaldi kodea");
		lblNewLabel_7.setBounds(51, 203, 109, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Hegaldi Kodea");
		lblNewLabel_8.setBounds(220, 203, 118, 14);
		panel.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 217, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 217, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Prezioa");
		lblNewLabel_9.setBounds(362, 327, 46, 14);
		panel.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(362, 343, 68, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Airelinea");
		lblNewLabel_10.setBounds(51, 240, 46, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Airelinea");
		lblNewLabel_10_1.setBounds(219, 240, 46, 14);
		panel.add(lblNewLabel_10_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(51, 256, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(220, 256, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Irteera oruda");
		lblNewLabel_11.setBounds(51, 281, 88, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Irteera ordua");
		lblNewLabel_12.setBounds(220, 281, 86, 14);
		panel.add(lblNewLabel_12);
		
		textField_6 = new JTextField();
		textField_6.setBounds(51, 297, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(220, 297, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Iraupena");
		lblNewLabel_13.setBounds(51, 323, 86, 14);
		panel.add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(51, 338, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(220, 343, 86, 20);
		panel.add(textField_9);
		
		JLabel lblNewLabel_13_1 = new JLabel("Iraupena");
		lblNewLabel_13_1.setBounds(220, 328, 86, 14);
		panel.add(lblNewLabel_13_1);
		
		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.setBounds(68, 447, 89, 23);
		add(btnNewButton);
		
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		add(labelConImagen);
		labelConImagen.setBackground(new Color(111, 145, 102));
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
	}
}
