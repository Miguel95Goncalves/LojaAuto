package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Component;

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
		setVisible(true);
		setMaximizable(true);
		setTitle("Adicionar");
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);

	}

}
