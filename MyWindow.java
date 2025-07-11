package com.app.demo4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyWindow extends JFrame {
	private DefaultTableModel prodTableModel;
	private JTable prodTable;
	private JScrollPane prodScrollPane;
	private JButton addButton, deleteButton, exitButton;
	
	public MyWindow() {
		this.setTitle("Main Window");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		
		Object[] columns = { "Id", "Name", "Price" };
		
		prodTableModel = new DefaultTableModel(columns, 0);
		prodTable = new JTable(prodTableModel);
		prodScrollPane = new JScrollPane(prodTable);
		prodScrollPane.setBounds(20, 20, 550, 250);
		this.add(prodScrollPane);
	
		addButton = new JButton("Add");
		addButton.setBounds(100, 300, 100, 30);
		this.add(addButton);

		deleteButton = new JButton("Delete");
		deleteButton.setBounds(250, 300, 100, 30);
		this.add(deleteButton);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(400, 300, 100, 30);
		this.add(exitButton);
		
		addButton.addActionListener((e) -> {
			
			ProductDialog dlg = new ProductDialog();
			dlg.setModal(true);
			dlg.setVisible(true);
			Product prod = dlg.getProduct();
			
			Object[] row = {prod.getId(), prod.getName(), prod.getPrice()};
			prodTableModel.addRow(row);
		});
		
		deleteButton.addActionListener((e) -> {
			
			int rowIndex = prodTable.getSelectedRow();
			if(rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "No Row is Selected");
				return;
			}
			
			prodTableModel.removeRow(rowIndex);
		});
		
		exitButton.addActionListener((e) -> this.dispose() );
	}
}
