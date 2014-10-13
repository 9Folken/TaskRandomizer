package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
		MainPanel.setBackground(Color.BLUE);
		
		
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.setSize(5, 2);
		MainFrame.this.add(MainPanel);	
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		MainPanel.add(FooterPanel,BorderLayout.SOUTH);
		
		
		
			
	}
	
	
		
		
		
		
		
	

}
