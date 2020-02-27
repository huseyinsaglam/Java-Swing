package com.notApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Dosya");
		menuBar.add(mnNewMenu);
		

		JTextArea textArea = new JTextArea();
		textArea.setBounds(85, 38, 215, 144);
		contentPane.add(textArea);
		
		
		JMenuItem mnýtmNewMenuItem = new JMenuItem("Dosya Ac");
		mnýtmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				
				JFileChooser fileChooser = new JFileChooser();
				int a = fileChooser.showOpenDialog(contentPane);
				File file = fileChooser.getSelectedFile();
				
				FileReader fileReader;
				BufferedReader bufferedReader;
				Scanner scanner = null;
				if(a==fileChooser.APPROVE_OPTION)
				{
				try {
					
					fileReader = new FileReader(file);
					bufferedReader = new BufferedReader(fileReader);
					scanner = new Scanner(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String icerik= " ";
				while(scanner.hasNext())
				{
					 icerik = icerik + scanner.next() +"\n";
					 textArea.setText(icerik);
				}
			}
			}
		});
		mnNewMenu.add(mnýtmNewMenuItem);
		
		JMenuItem mnýtmDosyaKaydet = new JMenuItem("Dosya Kaydet");
		mnýtmDosyaKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				int a = fileChooser.showOpenDialog(contentPane);
				
				if(a==fileChooser.APPROVE_OPTION)
				{
				
				String file = fileChooser.getSelectedFile().getPath();
				FileWriter fileWriter ;
				try {
					fileWriter = new FileWriter(file);
					fileWriter.write(textArea.getText());
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
			
			}
		});
		mnNewMenu.add(mnýtmDosyaKaydet);
		
		JMenuItem mnýtmDosyaKapat = new JMenuItem("Dosya Kapat");
		mnýtmDosyaKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnNewMenu.add(mnýtmDosyaKapat);
		
		JMenu mnDuzen = new JMenu("Duzen");
		menuBar.add(mnDuzen);
		
		JMenu mnNewMenu_1 = new JMenu("Renk");
		mnDuzen.add(mnNewMenu_1);
		
		JMenuItem mnýtmRengiDegistir = new JMenuItem("Rengi Degistir");
		mnNewMenu_1.add(mnýtmRengiDegistir);
		
		JMenu mnYaziTipi = new JMenu("Yazi Tipi");
		mnDuzen.add(mnYaziTipi);
		
		JMenuItem mnýtmArial = new JMenuItem("Arial");
		mnYaziTipi.add(mnýtmArial);
		
		JMenuItem mnýtmTimeNewsRoman = new JMenuItem("Times New Roman");
		mnYaziTipi.add(mnýtmTimeNewsRoman);
		
		

		
	
		
		
		
	}
}
