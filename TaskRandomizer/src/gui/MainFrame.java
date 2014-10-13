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
	public static String[] array;  

	public MainFrame(String title) {
		super(title);
		
		JPanel MainPanel = new JPanel(new BorderLayout());
		JPanel HeaderPanel = new JPanel(new FlowLayout());
		JPanel CenterPanel = new JPanel(new FlowLayout());
		JPanel LeftPanel = new JPanel(new FlowLayout());
		JPanel RightPanel = new JPanel(new FlowLayout());
		JPanel FooterPanel = new JPanel(new FlowLayout());
		
		DefaultListModel LocationListModel = new DefaultListModel();
		JList LocationList = new JList(LocationListModel);
		
        JTextField text = new JTextField(10); 
		
		JButton btnAddLocation = new JButton("Add Location");
		JButton btnAddAction = new JButton("  Add Action  ");
		JButton btnDeliteLocation = new JButton("    Delite location   ");
		
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
		
		FooterPanel.add(btnAddLocation);
		FooterPanel.add(btnAddAction);
		FooterPanel.add(btnDeliteLocation);
		CenterPanel.add(LocationList);
		HeaderPanel.add(text);
		
		LocationListModel.addElement("111");
		LocationListModel.addElement("112");
		LocationListModel.addElement("113");
		
		btnAddLocation.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		LocationListModel.addElement(text.getText());
			}
		});
		btnDeliteLocation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LocationListModel.remove(LocationList.getSelectedIndex());
				
			}
		});
			
	}
	
	
		
			
		}
		
		
		
		
	


