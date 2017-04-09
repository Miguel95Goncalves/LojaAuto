package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import application.App;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Atm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atm frame = new Atm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Atm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Atm.class.getResource("/imagens/atm.png")));
		setBackground(new Color(230, 230, 250));
		setTitle("ATM");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 440, 329);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setForeground(SystemColor.textHighlight);
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				App window = new App();
				window.frmLojaauto.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVoltar.setVerticalTextPosition(SwingConstants.TOP);
		btnVoltar.setFont(new Font("Verdana", Font.BOLD, 16));
		btnVoltar.setBorder(null);
		btnVoltar.setBackground(new Color(230, 230, 250));
		btnVoltar.setIcon(new ImageIcon(Atm.class.getResource("/imagens/back.png")));
		btnVoltar.setBounds(13, 225, 64, 64);
		btnVoltar.setOpaque(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		contentPane.add(btnVoltar);
		
		JButton btnContas = new JButton("Contas");
		btnContas.setFocusPainted(false);
		btnContas.setFont(new Font("Verdana", Font.BOLD, 18));
		btnContas.setForeground(SystemColor.textHighlight);
		btnContas.setBounds(13, 11, 128, 31);
		btnContas.setOpaque(false);
		btnContas.setContentAreaFilled(false);
		btnContas.setBorderPainted(false);
		contentPane.add(btnContas);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFocusPainted(false);
		btnClientes.setForeground(SystemColor.textHighlight);
		btnClientes.setFont(new Font("Verdana", Font.BOLD, 18));
		btnClientes.setBounds(151, 11, 128, 31);
		btnClientes.setOpaque(false);
		btnClientes.setContentAreaFilled(false);
		btnClientes.setBorderPainted(false);
		contentPane.add(btnClientes);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFocusPainted(false);
		btnEntrar.setForeground(SystemColor.textHighlight);
		btnEntrar.setFont(new Font("Verdana", Font.BOLD, 18));
		btnEntrar.setBounds(289, 11, 128, 31);
		btnEntrar.setOpaque(false);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setBorderPainted(false);
		contentPane.add(btnEntrar);
		
		JLabel lblEntrar = new JLabel("");
		lblEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblEntrar.setIcon(new ImageIcon(Atm.class.getResource("/imagens/entrar.png")));
		lblEntrar.setBounds(289, 66, 128, 128);
		contentPane.add(lblEntrar);
		
		JLabel lblClientes = new JLabel("");
		lblClientes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblClientes.setIcon(new ImageIcon(Atm.class.getResource("/imagens/utilizadores.png")));
		lblClientes.setBounds(151, 66, 128, 128);
		contentPane.add(lblClientes);
		
		JLabel lblContas = new JLabel("");
		lblContas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblContas.setIcon(new ImageIcon(Atm.class.getResource("/imagens/contas.png")));
		lblContas.setBounds(13, 66, 128, 128);
		contentPane.add(lblContas);
		
		JLabel label = new JLabel("");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		label.setIcon(new ImageIcon(Atm.class.getResource("/imagens/fundo.jpg")));
		label.setBounds(0, 0, 434, 300);
		contentPane.add(label);
	}
}
