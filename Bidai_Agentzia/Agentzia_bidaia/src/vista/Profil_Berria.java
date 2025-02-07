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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Profil_Berria extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnGorde;
	public JButton btnUtzi;
	public JButton btnAtzera;
	public JComboBox agentzia;
	public JComboBox langile;
	private JTextField erabiltzaile, logo, kolorea, pasahitza;
	
	
	/**
	 * Create the panel.
	 */
	public Profil_Berria() {

		setBounds(100, 100, 500, 500);
		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(55, 54, 395, 327);
		panel_1.setBackground(new Color(111, 147, 102));
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("AGENTZIA BERRIA");
		lblNewLabel_1.setBounds(82, 11, 230, 31);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_1);

		JTextField izena = new JTextField();
		izena.setBounds(189, 53, 173, 20);
		panel_1.add(izena);
		izena.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Markaren kolorea");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(48, 103, 97, 14);
		panel_1.add(lblNewLabel_2);

		JTextField logoa = new JTextField();
		logoa.setBounds(189, 244, 173, 20);
		panel_1.add(logoa);
		logoa.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Langile kopurua");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(48, 150, 83, 14);
		panel_1.add(lblNewLabel_3);

		langile = new JComboBox();
		langile.setBounds(189, 147, 173, 20);
		panel_1.add(langile);

		JLabel lblNewLabel_4 = new JLabel("Agentzia mota");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(48, 198, 83, 14);
		panel_1.add(lblNewLabel_4);

		agentzia = new JComboBox();
		agentzia.setBounds(189, 194, 173, 22);
		panel_1.add(agentzia);

		JLabel lblNewLabel_5 = new JLabel("Logoa");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(48, 247, 42, 14);
		panel_1.add(lblNewLabel_5);

        JPanel kolorea = new JPanel();
        kolorea.setBounds(320, 97, 42, 20);
        kolorea.setBackground(Color.WHITE);
        panel_1.add(kolorea);

        // 🔹 Botón para abrir la paleta de colores
        JButton colorButton = new JButton("Kolorea erabaki");
        colorButton.setBounds(189, 99, 121, 20);
        panel_1.add(colorButton);

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(panel_1, "Elige un color", kolorea.getBackground());
                if (selectedColor != null) {
                    kolorea.setBackground(selectedColor);
                    logoa.setText("#" + Integer.toHexString(selectedColor.getRGB()).substring(2).toUpperCase());
                }
            }
        });

		JLabel lblNewLabel = new JLabel("Agentzia Izena");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(48, 56, 83, 14);
		panel_1.add(lblNewLabel);

		btnGorde = new JButton("Gorde");
		btnGorde.setBounds(48, 284, 85, 23);
		panel_1.add(btnGorde);

		btnUtzi = new JButton("Utzi");
		btnUtzi.setBounds(143, 284, 65, 23);
		panel_1.add(btnUtzi);

		btnAtzera = new JButton("X");
		btnAtzera.setBackground(new Color(111, 147, 102));
		btnAtzera.setBounds(10, 11, 50, 23);
		add(btnAtzera);

		JLabel labelConImagen = new JLabel();
		labelConImagen.setBounds(0, 0, 500, 500);
		labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/white.png")));
		add(labelConImagen);

		
		langileKopDB();
		agentziaMotaDB();
	}

    /**
     * Método para conectar con la base de datos y cargar los países en el JComboBox.
     */
    private void langileKopDB() {
        String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
        String usuario = "root";  
        String contraseña = "";  
        String query = "SELECT deskribapena FROM langile_kop";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                langile.addItem(rs.getString("deskribapena"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void agentziaMotaDB() {
        String url = "jdbc:mysql://localhost:3307/db_bidai_agentzia";
        String usuario = "root";  
        String contraseña = "";  
        String query = "SELECT deskribapena FROM agentzia_mota";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement ps = conexion.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                agentzia.addItem(rs.getString("deskribapena"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

