package com.Jpanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Component;


class User
{
	private String kullaniciAdi;
	private String password;
	
	
	
	public User(String kullaniciAdi, String password) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.password = password;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
public class AnaEkran extends JFrame {

	private JPanel contentPane;
	private JTextField anaEkran_kAdi;
	private JPasswordField anaEkran_pasword;
	
	private static List<User> user_list = new ArrayList<User>();

	public static List<User> getUser_list() {
		return user_list;
	}

	public static void setUser_list(List<User> user_list) {
		AnaEkran.user_list = user_list;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaEkran frame = new AnaEkran();
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
	public AnaEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 11, 414, 159);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblKullaniciAdi = new JLabel("Kullanici Adi");
		lblKullaniciAdi.setBounds(29, 32, 55, 14);
		panel.add(lblKullaniciAdi);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setBounds(29, 68, 55, 14);
		panel.add(lblParola);
		
		anaEkran_kAdi = new JTextField();
		anaEkran_kAdi.setBounds(114, 29, 86, 20);
		panel.add(anaEkran_kAdi);
		anaEkran_kAdi.setColumns(10);
		
		anaEkran_pasword = new JPasswordField();
		anaEkran_pasword.setAlignmentX(Component.RIGHT_ALIGNMENT);
		anaEkran_pasword.setBounds(114, 65, 86, 20);
		panel.add(anaEkran_pasword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(20, 181, 404, 69);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton anaEkran_btnRegister = new JButton("Register");
		anaEkran_btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterEkrani registerEkrani = new RegisterEkrani();
				registerEkrani.setVisible(true);
			}
		});
		anaEkran_btnRegister.setBounds(84, 11, 103, 23);
		panel_1.add(anaEkran_btnRegister);
		
		JButton anaEkran_btnLogin = new JButton("Login");
		anaEkran_btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanici_Adi = anaEkran_kAdi.getText();
				char[] pass = anaEkran_pasword.getPassword();
				String p_password = String.valueOf(pass);
				
				if(user_list.size()==0)
				{
					JOptionPane jOptionPane = new JOptionPane();
					JOptionPane.showConfirmDialog(contentPane, "Listeniz bosdur..");
				}
				else
				{
					for(User user : user_list)
					{
						if(kullanici_Adi.equals(user.getKullaniciAdi()) && p_password.equals(user.getPassword()))
						{
							JOptionPane jOptionPane = new JOptionPane();
							JOptionPane.showConfirmDialog(contentPane, "Hosgeldiniz : " +user.getKullaniciAdi());
							return;
						}
					}
					JOptionPane jOptionPane = new JOptionPane();
					JOptionPane.showConfirmDialog(contentPane, "Kullanici Adi veya Parola yanlis.. ");
				}
					
				
				
			}
		});
		anaEkran_btnLogin.setBounds(197, 11, 87, 23);
		panel_1.add(anaEkran_btnLogin);
	}
}
