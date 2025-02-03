package aplikazioa;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Ongi_etorri {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ongi_etorri window = new Ongi_etorri();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ongi_etorri() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 
		 //AURRERA LOGIN BOTOIA
		 JButton btnLoging = new JButton("Loging");
		 btnLoging.setForeground(new Color(255, 255, 255));
		 btnLoging.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 15));
		 btnLoging.setBackground(new Color(69, 116, 70));
	     btnLoging.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        JLabel lblOngiEtorri = new JLabel("ONGI ETORRI!!");
        lblOngiEtorri.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 23));
        lblOngiEtorri.setBounds(181, 241, 145, 44);
        frame.getContentPane().add(lblOngiEtorri);
        
        btnLoging.setBounds(181, 316, 139, 39);
        frame.getContentPane().add(btnLoging);
	        
	    //ATZEKO ARGAZKIA
		JLabel labelConImagen = new JLabel();
	    labelConImagen.setBounds(0, 0, 502, 500);
	    labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/ongietorri.jpg")));
	    frame.getContentPane().add(labelConImagen);
	        
	        
	        
	       
	}
}
