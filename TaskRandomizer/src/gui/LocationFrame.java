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

public class LocationFrame extends JFrame {

	Dimension dimensionSmall = new Dimension(90,300);
	
	public LocationFrame(String title) {
		super(title);
	
	JList locationList = new JList();
	JScrollPane scrollPaneLocationList = new JScrollPane(locationList);
	scrollPaneLocationList.setPreferredSize(dimensionSmall);
	DefaultListModel locationListModel = new DefaultListModel();
	locationList.setModel(locationListModel);
	
		
	JPanel headerPanel = new JPanel(new FlowLayout());
	JPanel centerPanel = new JPanel(new FlowLayout());
	JPanel footerPanel = new JPanel(new FlowLayout());
	
	JTextField text = new JTextField(10); 
	
	JButton btnAddLocation = new JButton("Add Location");
	JButton btnDeleteLocation = new JButton("  Delete location  ");
	LocationFrame.this.setLayout(new BorderLayout());
	this.add(footerPanel, BorderLayout.SOUTH);
	this.add(centerPanel, BorderLayout.CENTER);
	this.add(headerPanel, BorderLayout.NORTH);
	
	
	headerPanel.add(text);

	centerPanel.add(scrollPaneLocationList);
	
	footerPanel.add(btnAddLocation);
	footerPanel.add(btnDeleteLocation);
	
	btnAddLocation.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		GlobalVariable.locationsArrayList.add(text.getText());
		locationListModel.clear();
		for (int i = 0; i < GlobalVariable.locationsArrayList.size(); i++) {
			locationListModel.addElement(GlobalVariable.locationsArrayList.get(i));
		}
			
					}
		});
	
	btnDeleteLocation.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			GlobalVariable.locationsArrayList.remove(locationList.getSelectedIndex());
			locationListModel.clear();
			for (int i = 0; i < GlobalVariable.locationsArrayList.size(); i++) {
				locationListModel.addElement(GlobalVariable.locationsArrayList.get(i));
			}	
			
			}
	});
	}
	
	
}
