package com.Access;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Access extends JFrame {

	private JPanel contentPane;
	private JTextField user_text;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Access frame = new Access();
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
	public Access() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel kullaniciAdi = new JLabel("Kullanici Adi");
		kullaniciAdi.setBounds(75, 39, 69, 14);
		contentPane.add(kullaniciAdi);
		
		JLabel parola = new JLabel("Parola");
		parola.setBounds(75, 91, 46, 14);
		contentPane.add(parola);
		
		JButton giris = new JButton("Giris");
		giris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kullaniciname= user_text.getText();
				//String passwordname= new String(passwordField.getText());
				String passwordname= passwordField.getText();
				String message;
				if(kullaniciname.equals("huseyin") && passwordname.equals("12345"))
				{
					
					message="Dogru giris yaptiniz";
					
					//JOptionPane.showMessageDialog(this, message);
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else
				{
					message="Yanlis giris yaptiniz";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				
				kullaniciAdi.setText("");
				parola.setText("");
			}
		});
		giris.setBounds(141, 148, 89, 23);
		contentPane.add(giris);
		
		user_text = new JTextField();
		user_text.setBounds(164, 36, 86, 20);
		contentPane.add(user_text);
		user_text.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 88, 86, 20);
		contentPane.add(passwordField);
	}
}
