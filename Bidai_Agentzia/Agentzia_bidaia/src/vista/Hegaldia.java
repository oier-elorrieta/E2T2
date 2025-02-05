package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hegaldia extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
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
		panel.setBounds(50, 59, 393, 334);
		add(panel);
		panel.setLayout(null);
		
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(-43, -58, 500, 500);
		panel.add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
	}
}
