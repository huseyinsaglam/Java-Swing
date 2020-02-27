package com.combobox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deneme extends JFrame {

	private JPanel contentPane;

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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Java ", "DesignPattern", "Angular"}));
		comboBox.setBounds(93, 48, 142, 20);
		contentPane.add(comboBox);
		
		JButton btnGoster = new JButton("Goster");
		btnGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String message = "Su dil secildi = " + " " +comboBox.getSelectedItem();
				JOptionPane.showConfirmDialog(contentPane, message);
			}
		});
		btnGoster.setBounds(118, 135, 89, 23);
		contentPane.add(btnGoster);
	}
}
