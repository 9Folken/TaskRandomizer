package main;

import java.util.ArrayList;

public class GlobalVariable {

	public static ArrayList<String> actionsArrayList = new ArrayList<String>();
	public static ArrayList<String> locationsArrayList = new ArrayList<String>();
	public static ArrayList<String> actualTasksArrayList = new ArrayList<String>();
	public static ArrayList<String> completeTasksArrayList = new ArrayList<String>();
	
	
	public static void fill(){
		
		for (int i = 0; i < 3; i++) {
			actionsArrayList.add("action"+" "+i);
			locationsArrayList.add("location"+" "+i);
			
			
		}
		
		
	}
	
	
}