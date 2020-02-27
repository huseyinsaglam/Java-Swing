package com.radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;
import java.awt.event.ActionEvent;

public class Deneme extends JFrame {

	private JPanel contentPane;
	
	private Set<String> diller = new LinkedHashSet<>();

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
		contentPane.setLayout(null);
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setBounds(46, 26, 109, 23);
		contentPane.add(rdbtnJava);
		
		JRadioButton rdbtnAngular = new JRadioButton("Angular");
		rdbtnAngular.setBounds(46, 72, 109, 23);
		contentPane.add(rdbtnAngular);
		
		JRadioButton rdbtnDesignpattern = new JRadioButton("DesignPattern");
		rdbtnDesignpattern.setBounds(45, 112, 109, 23);
		contentPane.add(rdbtnDesignpattern);
		
		JButton btnGoster = new JButton("Goster");
		btnGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnJava.isSelected())
				{
					diller.add("Java");
				}
				else
				{
					diller.remove("Java");
				}
				
				if(rdbtnAngular.isSelected())
				{
					diller.add("Angular");
				}
				else
				{
					diller.remove("Angular");
				}
				
				if(rdbtnDesignpattern.isSelected())
				{
					diller.add("DesignPattern");
				}
				else
				{
					diller.remove("DesignPattern");
				}
				
				goster();
				
			}

			private void goster() {
				String message = "Su diller secildi : " ;
				for(String language : diller)
				{
					 message = message + " " + language ;
				}
				
				JOptionPane.showConfirmDialog(contentPane, message);
			}
		});
		btnGoster.setBounds(47, 161, 89, 23);
		contentPane.add(btnGoster);
	}
}
