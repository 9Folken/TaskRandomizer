package main;

import gui.MainFrame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//GlobalVariable.fill(); 
		
		MainFrame mainFrame = new MainFrame("Task Randomizer");
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		
		mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
		
	}

	

}
