package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
	
	
	Color color = new Color(232, 115, 169);
	int k = 0;
	int place = 0;
	public MainFrame(String title) {
		super(title);
		
		//****************  *******  **********************
		
		JPanel MainPanel = new JPanel(new BorderLayout());
		JPanel HeaderPanel = new JPanel(new FlowLayout());
		JPanel CenterPanel = new JPanel(new FlowLayout());
		JPanel LeftPanel = new JPanel(new FlowLayout());
		JPanel RightPanel = new JPanel(new FlowLayout());
		JPanel FooterPanel = new JPanel(new FlowLayout());
				
		Dimension dimensionBig = new Dimension(250,300);
		
		JList tasksActualList = new JList();
		JScrollPane scrollPaneTasksActualList = new JScrollPane(tasksActualList);
		scrollPaneTasksActualList.setPreferredSize(dimensionBig);
		
		JList tasksCompliteList = new JList();
		JScrollPane scrollPaneTasksCompliteList = new JScrollPane(tasksCompliteList);
		scrollPaneTasksCompliteList.setPreferredSize(dimensionBig);
		
		JButton btnLocations = new JButton("Locations");
		JButton btnActions = new JButton("  Actions  ");
		JButton btnStart = new JButton("  START!  ");
		JButton btnWaw = new JButton("  WaW!  ");
		
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
			
		FooterPanel.add(btnActions);
		FooterPanel.add(btnLocations);
				
		CenterPanel.add(scrollPaneTasksActualList);
		CenterPanel.add(scrollPaneTasksCompliteList);
	
		HeaderPanel.add(btnStart);
		HeaderPanel.add(btnWaw);
		
		btnActions.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ActionFrame actionFrame = new ActionFrame("Actions");
				actionFrame.setVisible(true);
				actionFrame.setSize(600, 400);
				actionFrame.setVisible(true);
				actionFrame.setResizable(false);
				actionFrame.setLocationRelativeTo(null);
			}
		});
		
		
		
        
        
			
			
		btnLocations.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LocationFrame locationFrame = new LocationFrame("Locations");
				locationFrame.setVisible(true);
				locationFrame.setSize(600, 400);
				locationFrame.setVisible(true);
				locationFrame.setResizable(false);
				locationFrame.setLocationRelativeTo(null);

				
			}
		});
        
        
	}
	}
		// from 456798
