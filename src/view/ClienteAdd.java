package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ClienteAdd extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteAdd frame = new ClienteAdd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClienteAdd() {
		setBounds(100, 100, 450, 300);

	}

}
