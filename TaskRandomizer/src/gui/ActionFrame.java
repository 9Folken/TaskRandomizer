package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.GlobalVariable;

public class ActionFrame extends JFrame {

	Dimension dimensionSmall = new Dimension(100,300);
	
	public ActionFrame(String title) {
		super(title);
	
	JList actionList = new JList();
	JScrollPane scrollPaneActionList = new JScrollPane(actionList);
	scrollPaneActionList.setPreferredSize(dimensionSmall);
	DefaultListModel actionListModel = new DefaultListModel();
	actionList.setModel(actionListModel);
			
	JPanel headerPanel = new JPanel(new FlowLayout());
	JPanel centerPanel = new JPanel(new FlowLayout());
	JPanel footerPanel = new JPanel(new FlowLayout());
	
	JTextField text = new JTextField(10); 
	
	JButton btnAddAction = new JButton("Add action");
	JButton btnDeleteAction = new JButton("  Delete action  ");
	ActionFrame.this.setLayout(new BorderLayout());
	this.add(footerPanel, BorderLayout.SOUTH);
	this.add(centerPanel, BorderLayout.CENTER);
	this.add(headerPanel, BorderLayout.NORTH);
	
	headerPanel.add(text);

	centerPanel.add(scrollPaneActionList);
	
	footerPanel.add(btnAddAction);
	footerPanel.add(btnDeleteAction);
	
	actionListModel.clear();
	for (int i = 0; i < GlobalVariable.actionsArrayList.size(); i++) {
		actionListModel.addElement(GlobalVariable.actionsArrayList.get(i));
	}
	
	btnAddAction.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			GlobalVariable.actionsArrayList.add(text.getText());
			actionListModel.clear();
			for (int i = 0; i < GlobalVariable.actionsArrayList.size(); i++) {
				actionListModel.addElement(GlobalVariable.actionsArrayList.get(i));
			}
		//	GlobalVariable.actionCounter++;
		//	locationList.updateUI();
			
					}
		});
	
	btnDeleteAction.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			GlobalVariable.actionsArrayList.remove(actionList.getSelectedIndex());
			actionListModel.clear();
			for (int i = 0; i < GlobalVariable.actionsArrayList.size(); i++) {
				actionListModel.addElement(GlobalVariable.actionsArrayList.get(i));
			}
			
			}
	});
	}
	
	
}