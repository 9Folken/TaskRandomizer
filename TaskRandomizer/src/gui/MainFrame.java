package gui;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String[] array;  

	public MainFrame(String title) {
		super(title);
		
		JPanel MainPanel = new JPanel(new BorderLayout());
		JPanel HeaderPanel = new JPanel(new FlowLayout());
		JPanel CenterPanel = new JPanel(new FlowLayout());
		JPanel LeftPanel = new JPanel(new FlowLayout());
		JPanel RightPanel = new JPanel(new FlowLayout());
		JPanel FooterPanel = new JPanel(new FlowLayout());
		
		
		JList locationList = new JList();
		JScrollPane scrollPaneLocationList = new JScrollPane(locationList);
		scrollPaneLocationList.setPreferredSize(new Dimension(100,300));
		DefaultListModel locationListModel = new DefaultListModel();
		locationList.setModel(locationListModel);
		
		JList actionList = new JList();
		JScrollPane scrollPaneActionList = new JScrollPane(actionList);
		scrollPaneActionList.setPreferredSize(new Dimension(100,300));
		DefaultListModel actionListModel = new DefaultListModel();
		actionList.setModel(actionListModel);
		
		
		
        JTextField text = new JTextField(10); 
		
		JButton btnAddLocation = new JButton("Add Location");
		JButton btnAddAction = new JButton("  Add Action  ");
		JButton btnDeleteLocation = new JButton("  Delete location  ");
		JButton btnDeleteAction = new JButton("  Delete action  ");
		
		Color color = new Color(232, 115, 169);
		
		MainFrame.this.add(MainPanel);
		
		MainPanel.setBackground(color);
		HeaderPanel.setBackground(color);
		CenterPanel.setBackground(color);
		LeftPanel.setBackground(color);
		RightPanel.setBackground(color);
		FooterPanel.setBackground(color);
		
		MainPanel.add(HeaderPanel,BorderLayout.NORTH);
		MainPanel.add(CenterPanel,BorderLayout.CENTER);
		MainPanel.add(LeftPanel,BorderLayout.WEST);
		MainPanel.add(RightPanel,BorderLayout.EAST);
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		
		FooterPanel.add(btnAddLocation);
		FooterPanel.add(btnAddAction);
		FooterPanel.add(btnDeleteLocation);
		FooterPanel.add(btnDeleteAction);
		LeftPanel.add(scrollPaneLocationList);
		LeftPanel.add(scrollPaneActionList);
		HeaderPanel.add(text);
		text.setText("*****");
		btnAddLocation.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		//	GlobalVariable.locations[GlobalVariable.actionCounter] = text.getText();
			locationListModel.addElement(text.getText());
		//	GlobalVariable.actionCounter++;
		//	locationList.updateUI();
			
					}
		});
		
		btnAddAction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionListModel.addElement(text.getText());
				
			}
		});
		
		
		btnDeleteLocation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			locationListModel.remove(locationList.getSelectedIndex());	
				
				}
		});
			
	}
	}
		// from 456798
