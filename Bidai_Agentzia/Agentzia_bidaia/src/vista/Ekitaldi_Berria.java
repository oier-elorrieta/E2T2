package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class Ekitaldi_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	public JButton btnOstatua;

	/**
	 * Create the panel.
	 */
	public Ekitaldi_Berria() {
		setLayout(null);
		setBounds(100, 100, 500, 500);

		btnOstatua = new JButton("OSTATUA");
		btnOstatua.setBounds(196, 98, 89, 23);
		add(btnOstatua);

		JButton btnNewButton_1 = new JButton("HEGALDIA");
		btnNewButton_1.setBounds(196, 165, 89, 23);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("BESTE BATZUK");
		btnNewButton_2.setBounds(186, 232, 111, 23);
		add(btnNewButton_2);

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		add(labelConImagen);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
	}

}
