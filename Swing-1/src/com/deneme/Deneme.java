package com.deneme;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class Deneme extends JFrame {

	private JPanel contentPane;
	private int say=0;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deneme frame = new Deneme();
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
	public Deneme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Buton");
		btnNewButton.setBounds(93, 210, 248, 23);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* say++;
				System.out.println(say); */
				
				//textField.setText("Swing deneme");
				
				
				String new_internet_address = textField.getText();
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI(new_internet_address));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(116, 74, 208, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
