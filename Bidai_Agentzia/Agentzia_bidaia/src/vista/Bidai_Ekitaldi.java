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
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Bidai_Ekitaldi extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	public JButton btnBidaiBerri;
	public JButton btnEkitaldiBerri;
	public JButton btnEzabatu;
	private JTable bidaiakTaula;
	private JTable ekitaldiTaula;
	public JButton btnTrampa;

	/**
	 * Create the panel.
	 */
	public Bidai_Ekitaldi() {

		setLayout(null);

		setBounds(100, 100, 1280, 720);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(118, 74, 1085, 553);
		panel_1.setBackground(new Color(111, 147, 102));
		add(panel_1);

		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("BIDAIAK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(284, 22, 129, 24);
		panel_1.add(lblNewLabel);

		JLabel lblEkitaldiak = new JLabel("EKITALDIAK");
		lblEkitaldiak.setHorizontalAlignment(SwingConstants.CENTER);
		lblEkitaldiak.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEkitaldiak.setBounds(261, 243, 164, 24);
		panel_1.add(lblEkitaldiak);

		btnBidaiBerri = new JButton("Bidai berria");
		btnBidaiBerri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBidaiBerri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBidaiBerri.setBounds(846, 223, 129, 44);
		panel_1.add(btnBidaiBerri);

		btnEkitaldiBerri = new JButton("Ekitaldi berria");
		btnEkitaldiBerri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEkitaldiBerri.setBounds(846, 312, 129, 44);
		panel_1.add(btnEkitaldiBerri);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 57, 648, 168);
		panel_1.add(scrollPane);
		
		//DefaultTableModel modelo = new DefaultTableModel();
		bidaiakTaula = new JTable();
		String[] columnNames = {"Bidai", "Edad", "Profesión"};
		Object[][] data = {
			    {"Juan", 25, "Ingeniero"},
			    {"María", 30, "Doctora"},
			    {"Luis", 28, "Abogado"}
			};
		scrollPane.setViewportView(bidaiakTaula);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 278, 648, 168);
		panel_1.add(scrollPane_1);

		DefaultTableModel modelo = new DefaultTableModel();
		ekitaldiTaula = new JTable(modelo);
		ekitaldiTaula.setModel(
				new DefaultTableModel(new Object[][] {
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
				}, new String[] { "Izena", "Mota", "Data", "Prezioa" }));
		scrollPane_1.setViewportView(ekitaldiTaula);

		btnEzabatu = new JButton("Ezabatu");
		btnEzabatu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEzabatu.setBounds(846, 133, 128, 44);
		panel_1.add(btnEzabatu);
		
				btnTrampa = new JButton("Sortu bezero-eskaintza");
				btnTrampa.setBounds(34, 492, 204, 32);
				panel_1.add(btnTrampa);
				btnTrampa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(00, 00, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
		add(labelConImagen);

	}
}
