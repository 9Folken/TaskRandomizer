package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
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
		
		
		JList LocationList = new JList(GlobalVariable.locations);
		
		
		
        JTextField text = new JTextField(10); 
		
		JButton btnAddLocation = new JButton("Add Location");
		JButton btnAddAction = new JButton("  Add Action  ");
		JButton btnDeleteLocation = new JButton("  Delete location  ");
		
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
		LeftPanel.add(LocationList);
		HeaderPanel.add(text);
		text.setText("*****");
		btnAddLocation.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			GlobalVariable.locations[GlobalVariable.counter] = text.getText();
			GlobalVariable.counter++;
			LocationList.updateUI();
			
					}
		});
		btnDeleteLocation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//LocationList.c
				
				
				}
		});
			
	}
			}
		// from home
