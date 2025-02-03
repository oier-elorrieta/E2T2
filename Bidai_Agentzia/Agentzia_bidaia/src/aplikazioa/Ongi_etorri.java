package aplikazioa;

import java.awt.EventQueue;

import javax.swing.JFrame;

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
		frame.setBounds(100, 100, 917, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
