package com.stokUygulamasi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;

public class Deneme extends JFrame {

	private JPanel contentPane;
	private final JTable table = new JTable();
	private JTextField urun_ismi;
	private JTextField kategori;
	private JTextField fiyat;

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
		setBounds(100, 100, 450, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(79, 163, 309, 155);
		contentPane.add(tabbedPane);
		table.setToolTipText("");
		tabbedPane.addTab("New tab", null, table, null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Urun ismi", "Kategori", "Fiyat"
			}
		));
		
		JLabel lblUrunIsmi = new JLabel("Urun ismi");
		lblUrunIsmi.setBounds(54, 21, 68, 20);
		contentPane.add(lblUrunIsmi);
		
		urun_ismi = new JTextField();
		urun_ismi.setBounds(132, 21, 86, 20);
		contentPane.add(urun_ismi);
		urun_ismi.setColumns(10);
		
		JLabel lblKategori = new JLabel("Kategori");
		lblKategori.setBounds(59, 71, 63, 14);
		contentPane.add(lblKategori);
		
		kategori = new JTextField();
		kategori.setBounds(132, 68, 86, 20);
		contentPane.add(kategori);
		kategori.setColumns(10);
		
		JLabel lblFiyat = new JLabel("Fiyat");
		lblFiyat.setBounds(54, 111, 46, 14);
		contentPane.add(lblFiyat);
		
		fiyat = new JTextField();
		fiyat.setBounds(132, 108, 86, 20);
		contentPane.add(fiyat);
		fiyat.setColumns(10);
		
		JButton btnUrunEkle = new JButton("Urun Ekle");
		btnUrunEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String urunismi = urun_ismi.getText();
				String category = kategori.getText();
				String price = fiyat.getText();
				
				//DefaultTableModel model = new DefaultTableModel();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object dizi[] = {urunismi,category,price};
				model.addRow(dizi);
				
				
			}
		});
		btnUrunEkle.setBounds(283, 41, 123, 23);
		contentPane.add(btnUrunEkle);
		
		JButton btnUrunGuncelleme = new JButton("Urun Guncelleme");
		btnUrunGuncelleme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String urunismi = urun_ismi.getText();
				String category = kategori.getText();
				String price = fiyat.getText();
				
				
				int selected_row = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.setValueAt(urunismi, selected_row,0);
				model.setValueAt(category, selected_row,1);
				model.setValueAt(price, selected_row,2);
			}
		});
		btnUrunGuncelleme.setBounds(283, 86, 123, 23);
		contentPane.add(btnUrunGuncelleme);
		
		JButton btnNewButton = new JButton("Urun silme");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selected_row = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.removeRow(selected_row);
				
			}
		});
		btnNewButton.setBounds(283, 129, 113, 23);
		contentPane.add(btnNewButton);
	}
}
