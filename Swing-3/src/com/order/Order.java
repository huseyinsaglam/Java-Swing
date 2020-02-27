package com.order;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Order extends JFrame {

	private JPanel contentPane;
	Map<String, Integer> siparisler = new LinkedHashMap<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
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
	public Order() {
		setTitle("Order Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("iskerder-15 TL");
		chckbxNewCheckBox.setBounds(42, 24, 155, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Beyti-12 TL");
		chckbxNewCheckBox_1.setBounds(42, 60, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxSalata = new JCheckBox("Salata - 5 TL");
		chckbxSalata.setBounds(42, 102, 97, 23);
		contentPane.add(chckbxSalata);
		
		JCheckBox chckbxAyran = new JCheckBox("Ayran - 2 TL");
		chckbxAyran.setBounds(42, 143, 97, 23);
		contentPane.add(chckbxAyran);
		
		
		
		JButton btnSiparisGoster = new JButton("Siparis Goster");
		
		btnSiparisGoster.setBounds(108, 197, 130, 23);
		contentPane.add(btnSiparisGoster);
		btnSiparisGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					siparisler.put("iskender", 15);
				}
				else
				{
					siparisler.remove("iskender");
				}
				
				
				if(chckbxNewCheckBox_1.isSelected())
				{
					siparisler.put("Beyti", 12);
				}
				else
				{
					siparisler.remove("Beyti");
				}
				
				
				if(chckbxSalata.isSelected())
				{
					siparisler.put("Salata", 5);
				}
				else
				{
					siparisler.remove("Salata");
				}
				
				
				if(chckbxAyran.isSelected())
				{
					siparisler.put("Ayran", 2);
				}
				else
				{
					siparisler.remove("Ayran");
				}
				
				siparisGoster();
				
			}

			private void siparisGoster() {
				String message= " ";
				int price =0;
				for (Map.Entry<String, Integer> entry : siparisler.entrySet()) {
					
					message = message + entry.getKey() + " " + "\n";
					price = price + entry.getValue() ;
					
					// System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
				}
				message = message + "Toplam tutar = "  + price;
				JOptionPane.showConfirmDialog(contentPane, message);
			}
		});
		
	}

}
