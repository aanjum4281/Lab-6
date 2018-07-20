import java.util.Scanner;
import java.util.Random;

public class DiceRollerApp {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		//prompt the user to roll the dice 
		System.out.println("Welcome to the Grand circus Casino!");
		System.out.println();
		
		//prompt the user for how many sides of the dice
		System.out.println("How many sides should each die have?");
		String cont = null;
		
		do {
		int sideNum = scnr.nextInt();
		
		//do you want to roll the dice?	
		System.out.println(roll(sideNum));
		int num1 = roll(sideNum);
		int num2 = roll(sideNum);
		
		System.out.println(" " + num1 + " "+ num2);
		System.out.println("Roll again? (y/n)");
		cont = scnr.next();  
		
		} while (cont.equalsIgnoreCase("y"));
	}
	
	public static int roll(int sideNum) {
		Random rand = new Random();
		//this gets random side from inputted number of sides
		int randomside = rand.nextInt(sideNum);
		//needed to shift one unit over
		return randomside + 1; 
	}
	
	//Determine snake eyes, craps, or boxcars 
	//I don't know how to fix this error. 
	public static String special(int num1, int num2) {
		String specialstring = "";
		
		//snake eyes
		if (num1 == 1 && num2 == 1) {
		 String special = "Snake-eyes";
					}
		
		//boxcars
		if (num1 == 6 && num2 == 6) {
			String special = "Boxcars";
			}
		
		
		//craps
		if (num1 + num2 == 7 || 
				num1 + num2 == 11) {
			String special = "craps";
			}
	} 
	
}  
