package main;

public class GlobalVariable {

	public static  String locations[] = new String[100];
	public static  String actions[] = new String[100];
	public static int locationCounter;
	public static int actionCounter;

 
public static void fill(){
	

 for (int i = 0; i <= 9; i++) {
	locations[i] = i+1+""+i;
	System.out.println(locations[i]);
	locationCounter = i;
	}

}

}