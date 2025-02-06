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

		setBounds(100, 100, 500, 500);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 45, 480, 358);
		panel_1.setBackground(new Color(111, 147, 102));
		add(panel_1);

		panel_1.setLayout(null);

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
		btnBidaiBerri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBidaiBerri.setBounds(220, 323, 99, 23);
		panel_1.add(btnBidaiBerri);

		btnEkitaldiBerri = new JButton("Ekitaldi berria");
		btnEkitaldiBerri.setBounds(329, 323, 119, 23);
		panel_1.add(btnEkitaldiBerri);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 460, 104);
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
		scrollPane_1.setBounds(10, 195, 460, 106);
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
		btnEzabatu.setBounds(34, 323, 89, 23);
		panel_1.add(btnEzabatu);

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		btnTrampa = new JButton("Sortu bezero-eskaintza");
		btnTrampa.setBounds(20, 419, 173, 23);
		add(btnTrampa);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(00, 00, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
		add(labelConImagen);
		btnTrampa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}
