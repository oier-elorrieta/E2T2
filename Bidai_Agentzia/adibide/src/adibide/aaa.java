package adibide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modeloa.Agentzia;
import modeloa.Bidaia;
import modeloa.Ekitaldi;
import javax.swing.JOptionPane;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agentzia a1= new Agentzia();
		Bidaia b1=new Bidaia();
		Ekitaldi e1=new Ekitaldi();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:2025/db_bidai_agentzia",
					"root", "");
			//PreparedStatement sentencia = conexion.prepareStatement(sql);
			String sql = "SELECT * FROM agentzia WHERE erabiltzailea = 'admin' AND pasahitza= 'admin'";
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//System.out.println(sql);
			ResultSet result = sentencia.executeQuery(sql);

			while (result.next()) {
				a1.setIdAgentzia(result.getInt(1));
				a1.setIzena(result.getString(2));
				a1.setLogo(result.getString(3));
				a1.setKolorea(result.getString(4));
				a1.setErabiltzailea(result.getString(5));
				a1.setPasahitza(result.getString(6));
				a1.setAgentzia_kod(result.getString(7));
				a1.setLangile_kod(result.getString(8));
				System.out.println("agentzia: ");
				System.out.println(a1.toString()); 
				
				String sql2 = "SELECT * FROM bidaia WHERE agentzia_id = '"+ a1.getIdAgentzia() +"'";
				//System.out.println(sql2);
				PreparedStatement sentencia2 = conexion.prepareStatement(sql2);
				ResultSet result2 = sentencia2.executeQuery(sql2);
				while (result2.next()) {
					b1.setIdentifikatzailea(result2.getInt(1));
					b1.setIzena(result2.getString(2));
					b1.setDeskribapena(result2.getString(3));
					b1.setIraupenJoan(result2.getInt(4));
					b1.setIraupenEtor(result2.getInt(4));
					//b1.setDataJoan(result2.getDate(5));
					//b1.setDataJoan(result2.getDate(6));
					b1.setHelmugaHerri(result.getString(7));
					
					a1.insertarbidaiak(b1);
					
					System.out.println("Bidaiak: ");
					System.out.println(b1.toString());
					
					String sql3 = "SELECT * FROM zerbitzuak,ostatua, hegaldia WHERE zerbitzuak.zerb_kod like ostatua.zerb_kod and hegaldia.zerb_kod and zerbitzuak.bidai_id ="+b1.getIdentifikatzailea();
					System.out.println(sql3);
					PreparedStatement sentencia3 = conexion.prepareStatement(sql3);
					ResultSet result3 = sentencia2.executeQuery(sql3);
					while (result3.next()) {
						
						
					} 
					
				} 
				
			} 
			

			result.close();
			sentencia.close();
			conexion.close();
		} catch (ClassNotFoundException ex2) {
			System.out.println("Error al cargar el driver JDBC: " + ex2.getMessage());
		} catch (SQLException ex) {
			System.out.println("Error en la conexión a la base de datos: " + ex.getMessage());
		}
	}

}
