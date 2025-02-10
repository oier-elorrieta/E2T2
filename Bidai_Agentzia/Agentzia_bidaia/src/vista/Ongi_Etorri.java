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

		setBounds(100, 100, 1280, 720);

		// ONGI EOTRRI LABELA
		JLabel lblOngiEtorri = new JLabel("ONGI ETORRI!!!");
		lblOngiEtorri.setForeground(new Color(0, 0, 0));
		lblOngiEtorri.setFont(new Font("Reem Kufi", Font.PLAIN, 40));
		lblOngiEtorri.setBounds(805, 195, 315, 109);
		add(lblOngiEtorri);

		btnLoging = new JButton("Loging");
		btnLoging.setForeground(new Color(255, 255, 255));
		btnLoging.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLoging.setBackground(new Color(111, 145, 102));
		btnLoging.setBounds(884, 315, 164, 46);
		add(btnLoging);

		// ATZEKO ARGAZKIA
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 1280, 720);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/lehenengoa.png")));
		add(labelConImagen);

	}
}
