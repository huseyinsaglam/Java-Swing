package com.fileChoose;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Example extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example frame = new Example();
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
	public Example() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 11, 328, 122);
		contentPane.add(textArea);
		JButton btnDosyaSec = new JButton("Dosya Sec");
		btnDosyaSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				int a = fileChooser.showOpenDialog(contentPane);
				String icerik=" ";
				if(a==fileChooser.APPROVE_OPTION)
				{
					
					File file = fileChooser.getSelectedFile();
					FileReader fileReader;
					BufferedReader bufferedReader;
					Scanner scanner = null;
					try {
						fileReader = new FileReader(file);
						bufferedReader = new BufferedReader(fileReader);
						scanner = new Scanner(bufferedReader);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					while(scanner.hasNextLine())
					{
					
						
						icerik= icerik +scanner.nextLine() + "\n";
						textArea.setText(icerik);
					}
							
					
					
				}
				
			}
		});
		btnDosyaSec.setBounds(66, 160, 110, 23);
		contentPane.add(btnDosyaSec);
		
		JButton btnRenkSeciniz = new JButton("Renk Seciniz");
		btnRenkSeciniz.setBounds(224, 160, 110, 23);
		contentPane.add(btnRenkSeciniz);
	
	}
}
