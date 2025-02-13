package vista;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTable;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Bidai_Ekitaldi extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnAtzera;
	public JButton btnBidaiBerri;
	public JButton btnEkitaldiBerri;
	public JButton btnEzabatu;
	private static JTable bidaiakTaula;
	private static JTable ekitaldiTaula;
	public JButton btnTrampa;

	/**
	 * Create the panel.
	 */
	public Bidai_Ekitaldi() {

		setLayout(null);

		setBounds(100, 100, 1280, 720);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(77, 54, 1105, 553);
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

		// ----------------------------------------------------------------
		// ------------------BIDAI BERRI BOTOIA----------------------------
		// ----------------------------------------------------------------
		btnBidaiBerri = new JButton("Bidai berria");
		btnBidaiBerri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBidaiBerri.setBounds(846, 223, 129, 44);
		panel_1.add(btnBidaiBerri);

		// ----------------------------------------------------------------
		// ------------------EKTIALDI BERRI BOTOIA-------------------------
		// ----------------------------------------------------------------
		btnEkitaldiBerri = new JButton("Ekitaldi berria");
		btnEkitaldiBerri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEkitaldiBerri.setBounds(846, 312, 129, 44);
		panel_1.add(btnEkitaldiBerri);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 57, 648, 168);
		panel_1.add(scrollPane);

		bidaiakTaula = new JTable();
		scrollPane.setViewportView(bidaiakTaula);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 278, 648, 168);
		panel_1.add(scrollPane_1);

		DefaultTableModel modelo = new DefaultTableModel();
		ekitaldiTaula = new JTable(modelo);
		scrollPane_1.setViewportView(ekitaldiTaula);

		// ----------------------------------------------------------------
		// ------------------EZABATU BOTOIA--------------------------------
		// ----------------------------------------------------------------
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

		// ----------------------------------------------------------------
		// ----------------------ATZERA BOTOIA-----------------------------
		// ----------------------------------------------------------------
		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(00, 00, 1280, 720);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/bestea.png")));
		add(labelConImagen);

		cargarDatosTablaBidaiak();
		cargarDatosTablaEkitaldi();

	}

	public static void cargarDatosTablaBidaiak() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";

		String query = "SELECT izena, deskribapena, bidai_iraupen, hasiera_data, amaiera_data, herrialdea FROM bidaia";

		DefaultTableModel modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("Izena");
		modeloTabla.addColumn("Deskribapena");
		modeloTabla.addColumn("Iraupena");
		modeloTabla.addColumn("Hasiera Data");
		modeloTabla.addColumn("Amaiera Data");
		modeloTabla.addColumn("Herrialdea");

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conexion.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {
				String izena = rs.getString("izena");
				String deskribapena = rs.getString("deskribapena");
				double iraupena = rs.getDouble("bidai_iraupen");
				Date hasieraData = rs.getDate("hasiera_data");
				Date amaieraData = rs.getDate("amaiera_data");
				Object herrialdea = rs.getObject("herrialdea");

				modeloTabla
						.addRow(new Object[] { izena, deskribapena, iraupena, hasieraData, amaieraData, herrialdea });

			}
			bidaiakTaula.setModel(modeloTabla);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void cargarDatosTablaEkitaldi() {
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "SELECT izena, prezioa, hiria, sarrera_egun, ireeta_egun, logela_kod FROM ostatua";
		String query2 = "SELECT izena, prezioa, deskribapena, eguna FROM beste_batzuk";
		String query3 = "SELECT izena, prezioa, deskribapena, eguna FROM joan_etorria";

		DefaultTableModel modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("Izena");
		modeloTabla.addColumn("Prezioa");
		modeloTabla.addColumn("Hiria");
		modeloTabla.addColumn("Hasiera Data");
		modeloTabla.addColumn("Amaiera Data");
		modeloTabla.addColumn("Logela Mota");
		modeloTabla.addColumn("Deskribapena");

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conexion.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {
				String izena = rs.getString("izena");
				String prezioa = rs.getString("prezioa");
				String hiria = rs.getString("hiria");
				Date hasieraData = rs.getDate("sarrera_egun");
				Date amaieraData = rs.getDate("ireeta_egun");
				Object logelaMota = rs.getObject("logela_kod");

				modeloTabla.addRow(new Object[] { izena, prezioa, hiria, hasieraData, amaieraData, logelaMota });
			}

			ekitaldiTaula.setModel(modeloTabla);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conexion.createStatement();
				ResultSet rs = stmt.executeQuery(query2)) {

			while (rs.next()) {
				String izena = rs.getString("izena");
				String prezioa = rs.getString("prezioa");
				Date hasieraData = rs.getDate("eguna");
				String deskribapena = rs.getString("deskribapena");

				modeloTabla.addRow(new Object[] { izena, prezioa, hasieraData, deskribapena });
			}

			ekitaldiTaula.setModel(modeloTabla);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void ezabatuEkitaldi() {
		int filaSeleccionada = ekitaldiTaula.getSelectedRow();

		if (filaSeleccionada == -1) {
			JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		String izena = ekitaldiTaula.getValueAt(filaSeleccionada, 0).toString();
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query = "DELETE FROM ostatua WHERE izena = ?";
		String query2 = "DELETE FROM beste_batzuk WHERE izena = ?";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query)) {
			ps.setString(1, izena);
			int filasAfectadas = ps.executeUpdate();

			if (filasAfectadas > 0) {
				JOptionPane.showMessageDialog(null, "Ekitaldi ezabatuta.");
			} else {
				JOptionPane.showMessageDialog(null, "Ez da ekitaldia ezabatu", "Error", JOptionPane.ERROR_MESSAGE);
			}

			cargarDatosTablaEkitaldi();

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ez da ekitaldia ezabatu", "Error", JOptionPane.ERROR_MESSAGE);
		}
		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query2)) {
			ps.setString(1, izena);
			int filasAfectadas = ps.executeUpdate();

			if (filasAfectadas > 0) {
				JOptionPane.showMessageDialog(null, "Ekitaldi ezabatuta.");
			} else {
				JOptionPane.showMessageDialog(null, "Ez da ekitaldia ezabatu", "Error", JOptionPane.ERROR_MESSAGE);
			}

			cargarDatosTablaEkitaldi();

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ez da ekitaldia ezabatu", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void ezabatuBidaia() {
		int filaSeleccionada = bidaiakTaula.getSelectedRow();

		if (filaSeleccionada == -1) {
			JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		String izen = bidaiakTaula.getValueAt(filaSeleccionada, 0).toString();
		String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
		String usuario = "root";
		String contraseña = "";
		String query3 = "DELETE FROM bidaia WHERE izena = ?";

		try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
				PreparedStatement ps = conexion.prepareStatement(query3)) {
			ps.setString(1, izen);
			int filasAfectadas = ps.executeUpdate();

			if (filasAfectadas > 0) {
				JOptionPane.showMessageDialog(null, "Bidai ezabatuta.");
			} else {
				JOptionPane.showMessageDialog(null, "Bidaia ez da ezabatu", "Error", JOptionPane.ERROR_MESSAGE);
			}

			cargarDatosTablaBidaiak();

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Bidaia ez da ezabatu", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
