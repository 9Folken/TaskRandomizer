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
	public static  String locations[] = new String[100];
	public static  String actions[] = new String[100];  
	Color color = new Color(232, 115, 169);
	public MainFrame(String title) {
		super(title);
		
		//****************  ���������  **********************
		
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
		
		JList tasksActualList = new JList(GlobalVariable.tasksActual);
		JScrollPane scrollPaneTasksActualList = new JScrollPane(tasksActualList);
		scrollPaneTasksActualList.setPreferredSize(new Dimension(100,300));

		
		JList tasksCompliteList = new JList(GlobalVariable.tasksComplite);
		JScrollPane scrollPaneTasksCompliteList = new JScrollPane(tasksCompliteList);
		scrollPaneTasksCompliteList.setPreferredSize(new Dimension(100,300));
		
		JTextField text = new JTextField(10); 
		
		JButton btnAddLocation = new JButton("Add Location");
		JButton btnAddAction = new JButton("  Add Action  ");
		JButton btnDeleteLocation = new JButton("  Delete location  ");
		JButton btnDeleteAction = new JButton("  Delete action  ");
		JButton btnStart = new JButton("  START!  ");
		

		
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
		RightPanel.add(scrollPaneTasksActualList);
		RightPanel.add(scrollPaneTasksCompliteList);
		HeaderPanel.add(text);
		CenterPanel.add(btnStart);
		
		text.setText("*****");
		
		locationListModel.addElement("Kichen");
		locationListModel.addElement("Livin room");
		actionListModel.addElement("����������");
		actionListModel.addElement("�����. ������");
		
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
		
        btnDeleteAction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			actionListModel.remove(actionList.getSelectedIndex());	
				
				}
		});
        
        btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < GlobalVariable.tasksActual.length; i++) {
					GlobalVariable.tasksActual[i] = null;
				}
				int k = 0;
				for (int i = 0; i < locationListModel.getSize(); i++) {
					for (int j = 0; j < actionListModel.getSize(); j++) {
						
						GlobalVariable.tasksActual[k] = locationListModel.getElementAt(i).toString()+
								" "+actionListModel.getElementAt(j).toString();
						k++;
					}
					
					
					//+actionListModel.getSize()
					
				}
				
				
				
				System.out.println(locationListModel.getSize());
				System.out.println(locationListModel.getElementAt(0).toString());
				tasksActualList.updateUI();
				
			}
		});
		
	}
	}
		// from 456798
