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

public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public MainFrame(String title) {
		super(title);
		
		JPanel MainPanel = new JPanel(new BorderLayout());
		JPanel HeaderPanel = new JPanel(new FlowLayout());
		JPanel CenterPanel = new JPanel(new FlowLayout());
		JPanel LeftPanel = new JPanel(new FlowLayout());
		JPanel RightPanel = new JPanel(new FlowLayout());
		JPanel FooterPanel = new JPanel(new FlowLayout());
		
		MainFrame.this.add(MainPanel);
		
		MainPanel.setBackground(Color.GRAY);
		HeaderPanel.setBackground(Color.CYAN);
		CenterPanel.setBackground(Color.LIGHT_GRAY);
		LeftPanel.setBackground(Color.RED);
		RightPanel.setBackground(Color.WHITE);
		FooterPanel.setBackground(Color.BLACK);
		
		MainPanel.add(HeaderPanel,BorderLayout.NORTH);
		MainPanel.add(CenterPanel,BorderLayout.CENTER);
		MainPanel.add(LeftPanel,BorderLayout.WEST);
		MainPanel.add(RightPanel,BorderLayout.EAST);
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		
		DefaultListModel LocationListModel = new DefaultListModel();
		final JList LocationList = new JList(LocationListModel);
		LocationListModel.addElement("111");
		LocationListModel.addElement("112");
		LocationListModel.addElement("113");
		
		JTextField text = new JTextField(10); 
		
		
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 
				LocationListModel.addElement(text.getText());
				
			}
		});
		JButton btnAddAction = new JButton("  Add Action  ");
		
		
		
		FooterPanel.add(btnAddLocation);
		FooterPanel.add(btnAddAction);
		CenterPanel.add(LocationList);
		HeaderPanel.add(text);
			
	}
	
	
		
			
		}
		
		
		
		
	


