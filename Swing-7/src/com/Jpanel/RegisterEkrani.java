package com.Jpanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class RegisterEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField register_kAdi;
	private JPasswordField register_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterEkrani frame = new RegisterEkrani();
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
	public RegisterEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(28, 22, 362, 208);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblKullaniciAdi = new JLabel("Kullanici Adi");
		lblKullaniciAdi.setBounds(54, 31, 78, 14);
		panel.add(lblKullaniciAdi);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setBounds(54, 86, 62, 14);
		panel.add(lblParola);
		
		register_kAdi = new JTextField();
		register_kAdi.setBounds(126, 28, 86, 20);
		panel.add(register_kAdi);
		register_kAdi.setColumns(10);
		
		register_password = new JPasswordField();
		register_password.setBounds(126, 83, 86, 20);
		panel.add(register_password);
		
		JButton register_btnRegister = new JButton("Register");
		register_btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullaniciAdi = register_kAdi.getText();
				char[] pass = register_password.getPassword();
				String password = String.valueOf(pass);
				
				
				List<User> user_list = AnaEkran.getUser_list();
				User user = new User(kullaniciAdi, password);
				user_list.add(user);
				
				setVisible(false);
			
				
			}
		});
		register_btnRegister.setBounds(110, 139, 89, 23);
		panel.add(register_btnRegister);
	}

}
