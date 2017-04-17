package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import view.Atm;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Point;
import java.awt.Rectangle;

public class App {

	public JFrame frmLojaauto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmLojaauto.setVisible(true);
					window.frmLojaauto.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		initialize();
	}

	private void initialize() {
		frmLojaauto = new JFrame();
		frmLojaauto.setResizable(false);
		frmLojaauto.setIconImage(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/imagens/dollar-icon.png")));
		frmLojaauto.setForeground(new Color(224, 255, 255));
		frmLojaauto.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frmLojaauto.getContentPane().setBackground(new Color(230, 230, 250));
		frmLojaauto.setBackground(new Color(224, 255, 255));
		frmLojaauto.setFont(new Font("Arial", Font.BOLD, 14));
		frmLojaauto.setTitle("LojaAuto");
		frmLojaauto.setBounds(100, 100, 400, 256);
		frmLojaauto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLojaauto.getContentPane().setLayout(null);
		
		JButton btnAtm = new JButton("ATM");
		btnAtm.setForeground(SystemColor.textHighlight);
		btnAtm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Atm atm = new Atm();
				atm.setVisible(true);
				atm.setLocationRelativeTo(null);
				frmLojaauto.dispose();
			}
		});
		btnAtm.setFont(new Font("Verdana", Font.BOLD, 18));
		btnAtm.setVerticalTextPosition(SwingConstants.TOP);
		btnAtm.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAtm.setName("");
		btnAtm.setBorderPainted(false);
		btnAtm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtm.setBorder(null);
		btnAtm.setIcon(new ImageIcon(App.class.getResource("/imagens/atm.png")));
		btnAtm.setBounds(51, 37, 124, 155);
		btnAtm.setOpaque(false);
		btnAtm.setContentAreaFilled(false);
		btnAtm.setBorderPainted(false);
		frmLojaauto.getContentPane().add(btnAtm);
		
		JButton btnStand = new JButton("STAND");
		btnStand.setForeground(SystemColor.textHighlight);
		btnStand.setFont(new Font("Verdana", Font.BOLD, 18));
		btnStand.setHorizontalTextPosition(SwingConstants.CENTER);
		btnStand.setVerticalTextPosition(SwingConstants.TOP);
		btnStand.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStand.setIcon(new ImageIcon(App.class.getResource("/imagens/bmw-mini.png")));
		btnStand.setBorderPainted(false);
		btnStand.setBorder(null);
		btnStand.setBackground(new Color(230, 230, 250));
		btnStand.setBounds(220, 37, 129, 155);
		btnStand.setOpaque(false);
		btnStand.setContentAreaFilled(false);
		btnStand.setBorderPainted(false);
		frmLojaauto.getContentPane().add(btnStand);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(App.class.getResource("/imagens/fundo.jpg")));
		label.setBounds(0, 0, 394, 227);
		frmLojaauto.getContentPane().add(label);
	}
}
