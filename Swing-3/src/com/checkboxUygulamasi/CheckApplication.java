package com.checkboxUygulamasi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;
import java.awt.event.ActionEvent;

public class CheckApplication extends JFrame {

	private JPanel contentPane;

	Set<String> diller = new LinkedHashSet<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckApplication frame = new CheckApplication();
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
	public CheckApplication() {
		setTitle("CheckApplication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(35, 23, 198, 23);
		contentPane.add(chckbxJava);
		
		JCheckBox chckbxAngular = new JCheckBox("Angular");
		chckbxAngular.setBounds(35, 49, 240, 23);
		contentPane.add(chckbxAngular);
		
		JCheckBox chckbxDesignpattern = new JCheckBox("DesignPattern");
		chckbxDesignpattern.setBounds(35, 75, 240, 23);
		contentPane.add(chckbxDesignpattern);
		
		

		JLabel lblSuDillerSecildi = new JLabel("Su diller secildi =");
		lblSuDillerSecildi.setBounds(45, 105, 389, 22);
		contentPane.add(lblSuDillerSecildi);
		
		
		JButton btnGoster = new JButton("Goster");
		btnGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxJava.isSelected())
				{
					diller.add("Java");
				}
				else
				{
					diller.remove("Java");
				}
				
				
				if(chckbxAngular.isSelected())
				{
					diller.add("Angular");
				}
				else
				{
					diller.remove("Angular");
				}
				
				
				if(chckbxDesignpattern.isSelected())
				{
					diller.add("DesignPattern");
				}
				else
				{
					diller.remove("DesignPattern");
				}
				
				labelDegistir();
			}

			private void labelDegistir() {
				
				String yazi = "Su diller secildi =";
				
				for(String dillerYaz: diller)
				{
					 yazi = yazi+ dillerYaz + " " ;
					
				}
				
				lblSuDillerSecildi.setText(yazi);
				
				
			}
		});
		btnGoster.setBounds(77, 138, 89, 23);
		contentPane.add(btnGoster);
		
		
	}
}
