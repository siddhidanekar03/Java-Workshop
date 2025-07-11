package com.app.demo2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame {
	private JButton showDialogButton;
	
	public MyWindow() {
		this.setTitle("My Window");
		this.setSize(800, 600);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		showDialogButton = new JButton("Show Button");
		showDialogButton.setBounds(230, 280, 200, 40 );
		this.add(showDialogButton);
		
		showDialogButton.addActionListener((e) ->{
			EssayDialog dlg = new EssayDialog();
			dlg.setModal(true); 
			dlg.setVisible(true);
			
			String message = "Title: " + dlg.getTitle() + "\nEssay:" + dlg.getEssay();
			JOptionPane.showMessageDialog(this, message);
		});
		
	}
	

}
