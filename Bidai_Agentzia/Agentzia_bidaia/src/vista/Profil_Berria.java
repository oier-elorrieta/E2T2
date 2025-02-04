package vista;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profil_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnGorde;
	public JButton btnUtzi;
	public JButton btnAtzera;
	

	/**
	 * Create the panel.
	 */
	public Profil_Berria() {

		setBounds(100, 100, 500, 500);
		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(54, 56, 395, 327);
		panel_1.setBackground(new Color(171, 209, 181));
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("AGENTZIA BERRIA");
		lblNewLabel_1.setBounds(112, 11, 165, 31);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(189, 53, 140, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Markaren kolorea");
		lblNewLabel_2.setBounds(73, 103, 83, 14);
		panel_1.add(lblNewLabel_2);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(189, 244, 140, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Langile kopurua");
		lblNewLabel_3.setBounds(73, 150, 75, 14);
		panel_1.add(lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 147, 140, 20);
		panel_1.add(comboBox);

		comboBox.addItem("2 eta 10 langile artean");
		comboBox.addItem("10 eta 100 langile artean");
		comboBox.addItem("100 eta 1000 langile artean");

		JLabel lblNewLabel_4 = new JLabel("Agentzia mota");
		lblNewLabel_4.setBounds(73, 198, 69, 14);
		panel_1.add(lblNewLabel_4);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(189, 194, 140, 22);
		panel_1.add(comboBox_1);

		comboBox.addItem("Bidai Agentzia");

		JLabel lblNewLabel_5 = new JLabel("Logoa");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(73, 244, 29, 14);
		panel_1.add(lblNewLabel_5);

        JPanel colorPanel_1 = new JPanel();
        colorPanel_1.setBounds(296, 103, 55, 20);
        colorPanel_1.setBackground(Color.WHITE);
        panel_1.add(colorPanel_1);

        // 🔹 Botón para abrir la paleta de colores
        JButton colorButton = new JButton("Kolorea erabaki");
        colorButton.setBounds(189, 99, 97, 23);
        panel_1.add(colorButton);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(panel_1, "Elige un color", colorPanel_1.getBackground());
                if (selectedColor != null) {
                    colorPanel_1.setBackground(selectedColor);
                    textField_1.setText("#" + Integer.toHexString(selectedColor.getRGB()).substring(2).toUpperCase());
                }
            }
        });

		JLabel lblNewLabel = new JLabel("Agentzia Izena");
		lblNewLabel.setBounds(73, 56, 72, 14);
		panel_1.add(lblNewLabel);

		btnGorde = new JButton("Gorde");
		btnGorde.setBounds(72, 284, 61, 23);
		panel_1.add(btnGorde);

		btnUtzi = new JButton("Utzi");
		btnUtzi.setBounds(143, 284, 51, 23);
		panel_1.add(btnUtzi);

		btnAtzera = new JButton("X");
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
		add(labelConImagen);

	}
}
