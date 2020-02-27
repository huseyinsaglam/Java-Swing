package com.hesapMakinesi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel arti;
	private JTextField sayi1;
	private JTextField sayi2;
	private JTextField sonuc;
	
	private int b1;
	private int b2;
	private int answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		arti = new JPanel();
		arti.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(arti);
		arti.setLayout(null);
		
		JLabel birinciSayi = new JLabel("Birinci Sayi ");
		birinciSayi.setBounds(44, 49, 108, 14);
		arti.add(birinciSayi);
		
		JLabel ikinciSayi = new JLabel("ikinci Sayi");
		ikinciSayi.setBounds(44, 91, 71, 14);
		arti.add(ikinciSayi);
		
		JLabel lblS = new JLabel("Sonuc");
		lblS.setBounds(44, 132, 71, 14);
		arti.add(lblS);
		
		sayi1 = new JTextField();
		sayi1.setBounds(126, 46, 86, 20);
		arti.add(sayi1);
		sayi1.setColumns(10);
		
		sayi2 = new JTextField();
		sayi2.setBounds(125, 88, 86, 20);
		arti.add(sayi2);
		sayi2.setColumns(10);
		
		sonuc = new JTextField();
		sonuc.setEnabled(false);
		sonuc.setBounds(126, 129, 86, 20);
		arti.add(sonuc);
		sonuc.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int b1 = Integer.valueOf(sayi1.getText());
				int b2 = Integer.valueOf(sayi2.getText());
				
				int answer = b1+b2;
				
				sonuc.setText(String.valueOf(answer));
			}
		});
		button.setBounds(44, 181, 89, 23);
		arti.add(button);
		
		JButton eksi = new JButton("-");
		eksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int b1 = Integer.valueOf(sayi1.getText());
				int b2 = Integer.valueOf(sayi2.getText());
				
				int answer = b1-b2;
				sonuc.setText(String.valueOf(answer));
			}
		});
		eksi.setBounds(166, 181, 89, 23);
		arti.add(eksi);
		
		JButton carpi = new JButton("*");
		carpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b1 = Integer.valueOf(sayi1.getText());
				int b2 = Integer.valueOf(sayi2.getText());
				
				int answer = b1*b2;
				sonuc.setText(String.valueOf(answer));
			}
		});
		carpi.setBounds(44, 227, 89, 23);
		arti.add(carpi);
		
		JButton bolme = new JButton("/");
		bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int b1 = Integer.valueOf(sayi1.getText());
				int b2 = Integer.valueOf(sayi2.getText());
				
				int answer = b1/b2;
				sonuc.setText(String.valueOf(answer));
			}
		});
		bolme.setBounds(166, 227, 89, 23);
		arti.add(bolme);
	}
}
