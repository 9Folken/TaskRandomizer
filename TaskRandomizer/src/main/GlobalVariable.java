package main;

public class GlobalVariable {

	public static  String locations[] = new String[10];

 
public static void fill(){
	

 for (int i = 0; i <= 9; i++) {
	locations[i] = "111"+i;
	System.out.println(locations[i]);
	}

}

}