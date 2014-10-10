package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		createGUI();
				
	}
	
	private void createGUI(){
		
		JButton btnAddLocation = new JButton("Add Location");
		getContentPane().add(btnAddLocation);
		
	}

}
