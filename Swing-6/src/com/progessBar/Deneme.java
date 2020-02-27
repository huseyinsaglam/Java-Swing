package com.progessBar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deneme extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;

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
		
		
		progressBar = new JProgressBar();
		progressBar.setBounds(102, 69, 240, 41);
		contentPane.add(progressBar);
		progressBar.setValue(0); 
		  
		progressBar.setStringPainted(true); 
	  
		JButton btnNewButton = new JButton("Buton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int i = 0; 
			        try { 
			            while (i <= 100) { 
			                // fill the menu bar 
			            	progressBar.setValue(i + 10); 
			  
			                // delay the thread 
			                Thread.sleep(1000); 
			                i += 20; 
			            } 
			        } 
			        catch (Exception ex) { 
			        } 
			}
		});
		btnNewButton.setBounds(172, 148, 89, 23);
		contentPane.add(btnNewButton);
		
		contentPane.setSize(500, 500); 
		contentPane.setVisible(true);
	}
}
