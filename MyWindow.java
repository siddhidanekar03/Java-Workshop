package com.app.demo1;

import java.awt.event.ActionListener;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWindow extends JFrame {
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel addrLabel;
	private JTextArea addrTextArea;
	private JLabel genderLabel;
	private JRadioButton maleRadioButton, femaleRadioButton;
	private ButtonGroup genderButtonGroup;
	private JLabel langLabel;
	private JComboBox<String> langComboBox;
	private JButton submitButton;
	
	public MyWindow() {
		this.setTitle("CV");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		
		
		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(100, 50, 100, 30);
		this.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(200, 50, 200, 30);
		this.add(nameTextField);
		
		addrLabel = new JLabel("Address: ");
		addrLabel.setBounds(100, 100, 100, 30);
		this.add(addrLabel);
		
		addrTextArea = new JTextArea();
		addrTextArea.setBounds(200, 100, 200, 80);
		this.add(addrTextArea);
		
		genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(100, 200, 100, 30);
		this.add(genderLabel);
		
		genderButtonGroup = new ButtonGroup();
		
		maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setBounds(200, 200, 80, 30);
		this.add(maleRadioButton);
		genderButtonGroup.add(maleRadioButton);
		
		femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(320, 200, 80, 30);
		this.add(femaleRadioButton);
		genderButtonGroup.add(femaleRadioButton);
		
		langLabel = new JLabel("Language: ");
		langLabel.setBounds(100, 250, 100, 30);
		this.add(langLabel);
		
		String[] langs = {"English", "Marathi", "Hindi", "Sanskrit"};
		langComboBox = new JComboBox<String>(langs);
		langComboBox.setBounds(200, 250, 200, 30);
		this.add(langComboBox);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(210, 310, 80, 30);
		this.add(submitButton);
		
		ActionListener listener = (e) ->{
			String name = nameTextField.getText();
			String addr = addrTextArea.getText();
			String gender = "";
			if(maleRadioButton.isSelected())
				gender = "Male";
			else if(femaleRadioButton.isSelected())
				gender = "Female";
			String lang = (String) langComboBox.getSelectedItem();
			String message = "Name: " + name + "\nAddress: " + addr + "\nGender: " + gender  + "\nLanguage: " + lang;
			//System.out.println(message);
			JOptionPane.showMessageDialog(this, message);
			JOptionPane.showConfirmDialog(this, message);
			String age = JOptionPane.showInputDialog(this, "Enter age: ");
		};
		submitButton.addActionListener(listener);
		
		
	}
	

}
