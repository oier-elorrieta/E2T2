package vista;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTable;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bidai_Ekitaldi extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table_ekitaldiak;
	private JTable table_bidaiak;
	public JButton btnAtzera;
	public JButton btnBidaiBerri;
	public JButton btnEkitaldiBerri;

	/**
	 * Create the panel.
	 */
	public Bidai_Ekitaldi() {
		
		setLayout(null);

		setBounds(100, 100, 500, 500);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(32, 44, 428, 358);
		panel_1.setBackground(new Color(255, 255, 255, 150));
		add(panel_1);
		panel_1.setLayout(null);
		table_ekitaldiak = new JTable();
		table_ekitaldiak.setBounds(34, 197, 367, 104);
		panel_1.add(table_ekitaldiak);

		JLabel lblNewLabel = new JLabel("BIDAIAK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 22, 77, 24);
		panel_1.add(lblNewLabel);

		JLabel lblEkitaldiak = new JLabel("EKITALDIAK");
		lblEkitaldiak.setHorizontalAlignment(SwingConstants.CENTER);
		lblEkitaldiak.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEkitaldiak.setBounds(34, 162, 102, 24);
		panel_1.add(lblEkitaldiak);

		btnBidaiBerri = new JButton("Bidai berria");
		btnBidaiBerri.setBounds(209, 323, 85, 23);
		panel_1.add(btnBidaiBerri);
		
		btnEkitaldiBerri = new JButton("Ekitaldi berria");
		btnEkitaldiBerri.setBounds(299, 323, 102, 23);
		panel_1.add(btnEkitaldiBerri);

		JButton btnNewButton_1 = new JButton("Sortu bezero-eskaintza");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(34, 323, 153, 23);
		panel_1.add(btnNewButton_1);
		
		table_bidaiak = new JTable();
		table_bidaiak.setBounds(34, 47, 367, 104);
		panel_1.add(table_bidaiak);
		
		btnAtzera = new JButton("X");
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);
		
		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(00, 00, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
		add(labelConImagen);

	}
}
