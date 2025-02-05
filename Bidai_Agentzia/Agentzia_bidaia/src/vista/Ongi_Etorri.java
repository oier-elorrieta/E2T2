package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ongi_Etorri extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnLoging;

	/**
	 * Create the panel.
	 */
	public Ongi_Etorri() {

		setLayout(null);

		setBounds(100, 100, 500, 500);

		// AURRERA LOGIN BOTOIA
		btnLoging = new JButton("Login");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLoging.setForeground(new Color(255, 255, 255));
		btnLoging.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 15));
		btnLoging.setBackground(new Color(61, 94, 55));

		add(btnLoging);

		// ONGI EOTRRI LABELA
		JLabel lblOngiEtorri = new JLabel("ONGI ETORRI!!!");
		lblOngiEtorri.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 23));
		lblOngiEtorri.setBounds(161, 234, 176, 44);
		add(lblOngiEtorri);

		btnLoging.setBounds(176, 315, 139, 39);
		add(btnLoging);

		// ATZEKO ARGAZKIA
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/ongietorri.jpg")));
		add(labelConImagen);

	}

}
