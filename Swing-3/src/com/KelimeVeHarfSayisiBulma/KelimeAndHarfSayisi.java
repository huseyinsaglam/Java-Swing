package com.KelimeVeHarfSayisiBulma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KelimeAndHarfSayisi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KelimeAndHarfSayisi frame = new KelimeAndHarfSayisi();
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
	public KelimeAndHarfSayisi() {
		setTitle("Kelime ve Harf Sayisi Bulma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(61, 71, 278, 176);
		contentPane.add(textArea);
		
		JLabel lblHarfSayisi = new JLabel("Harf Sayisi");
		lblHarfSayisi.setBounds(69, 25, 125, 23);
		contentPane.add(lblHarfSayisi);
		
		JLabel lblKelimeSayisi = new JLabel("Kelime Sayisi");
		lblKelimeSayisi.setBounds(204, 25, 145, 23);
		contentPane.add(lblKelimeSayisi);
		
		JButton btnKelimeVeHarf = new JButton("Kelime ve Harf Sayisi Bulma");
		btnKelimeVeHarf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String yazi = textArea.getText();
		        
		        int karakter_sayisi = 0;
		        int kelime_sayisi = 0;
		        
		        for (int i = 0 ; i < yazi.length();i++) {
		            
		            if (yazi.charAt(i) != ' '){
		                
		                karakter_sayisi++;
		            }
		        }
		        
		        String[] kelimeler = yazi.split(" ");
		        
		        for(String kelime : kelimeler)
		        {
		        	kelime_sayisi++;
		        }
		       /* String a = String.valueOf(karakter_sayisi);
		        lblHarfSayisi.setText(a); */
		        lblHarfSayisi.setText("Harf Sayýsý : " + karakter_sayisi);
		        lblKelimeSayisi.setText("Kelime Sayýsý : " +kelime_sayisi );
			}
		});
		btnKelimeVeHarf.setBounds(104, 258, 163, 23);
		contentPane.add(btnKelimeVeHarf);
	}
}
