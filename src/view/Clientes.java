package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Dimension;

public class Clientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ClienteAdd cAdd = new ClienteAdd();
				cAdd.setVisible(true);
				contentPane.add(cAdd);
				cAdd.moveToFront();
			}
		});
		btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdd.setFocusPainted(false);
		btnAdd.setIcon(new ImageIcon(Clientes.class.getResource("/imagens/add.png")));
		btnAdd.setBounds(0, 0, 105, 81);
		btnAdd.setOpaque(false);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorderPainted(false);
		contentPane.add(btnAdd);
		
		JButton btnRem = new JButton("");
		btnRem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRem.setFocusPainted(false);
		btnRem.setIcon(new ImageIcon(Clientes.class.getResource("/imagens/rem.png")));
		btnRem.setBounds(104, 0, 105, 81);
		btnRem.setOpaque(false);
		btnRem.setContentAreaFilled(false);
		btnRem.setBorderPainted(false);
		contentPane.add(btnRem);
		
		JButton btnList = new JButton("");
		btnList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnList.setFocusPainted(false);
		btnList.setIcon(new ImageIcon(Clientes.class.getResource("/imagens/list.png")));
		btnList.setBounds(208, 0, 105, 81);
		btnList.setOpaque(false);
		btnList.setContentAreaFilled(false);
		btnList.setBorderPainted(false);
		contentPane.add(btnList);
		
		JButton btnProc = new JButton("");
		btnProc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProc.setFocusPainted(false);
		btnProc.setIcon(new ImageIcon(Clientes.class.getResource("/imagens/search.png")));
		btnProc.setBounds(304, 0, 105, 81);
		btnProc.setOpaque(false);
		btnProc.setContentAreaFilled(false);
		btnProc.setBorderPainted(false);
		contentPane.add(btnProc);
		
		JButton btnVolt = new JButton("");
		btnVolt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolt.setIcon(new ImageIcon(Clientes.class.getResource("/imagens/back.png")));
		btnVolt.setVerticalTextPosition(SwingConstants.TOP);
		btnVolt.setOpaque(false);
		btnVolt.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVolt.setForeground(SystemColor.textHighlight);
		btnVolt.setFont(new Font("Verdana", Font.BOLD, 16));
		btnVolt.setContentAreaFilled(false);
		btnVolt.setBorderPainted(false);
		btnVolt.setBorder(null);
		btnVolt.setBackground(new Color(230, 230, 250));
		btnVolt.setBounds(10, 386, 64, 64);
		contentPane.add(btnVolt);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Clientes.class.getResource("/imagens/fundo.jpg")));
		label.setBounds(0, 0, 440, 98);
		contentPane.add(label);
	}
}
