package lab5;

/***********************
* Name: Kyle Casey
* Date: 2/23/15
* Program: SwitchDemo.java
* Desc: show how a switch statement works.
*/

import java.util.Scanner; //import scanner

public class SwitchDemo { //start class
	public static void main(String[] args){ //start main function
		Scanner keyboard = new Scanner(System.in); //create scanner object
		System.out.println("Enter number of ice cream flavors:"); //prompt user for input
		int numberOfFlavors = keyboard.nextInt( ); //get integer from user
		switch (numberOfFlavors) //create switch statement
		{
			case 32: //if == 32 then
				System.out.println("Nice selection.");
				break;
			case 1: //if == 1 then
				System.out.println("I bet it's vanilla.");
				break;
			case 2: //if == 2 or
			case 3: //if == 3 or
			case 4: //if == 4 then
				System.out.println(numberOfFlavors + "flavors"); //output with variable
				System.out.println("is acceptable.");
				break;
			default: //if no cases fit criteria then
				System.out.println("I didn't plan for");
				System.out.println(numberOfFlavors + " flavors."); //output with variable
				break;
		} //end switch statement
		keyboard.close();
	} //end main function
} //end class
