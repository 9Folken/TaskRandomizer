package main;

import gui.MainFrame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame("Task Randomizer");
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);

	}

	

}
