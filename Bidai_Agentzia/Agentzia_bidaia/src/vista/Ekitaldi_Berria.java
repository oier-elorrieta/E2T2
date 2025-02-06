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
	public JButton btnHegaldia;
	public JButton btnBesteBatzuk;

	/**
	 * Create the panel.
	 */
	public Ekitaldi_Berria() {
		setLayout(null);
		setBounds(100, 100, 500, 500);

		btnOstatua = new JButton("OSTATUA");
		btnOstatua.setBounds(196, 98, 89, 23);
		add(btnOstatua);

		btnHegaldia = new JButton("HEGALDIA");
		btnHegaldia.setBounds(196, 165, 89, 23);
		add(btnHegaldia);

		btnBesteBatzuk = new JButton("BESTE BATZUK");
		btnBesteBatzuk.setBounds(186, 232, 111, 23);
		add(btnBesteBatzuk);

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
