/***********************
* Name: Kyle Casey
* Date: 2/23/15
* Program: Project3Part1.java
* Desc: Make a calculator program to add, subtract, multiply, and divide.
*/

import java.util.Scanner; //Import Scanner

public class Project3Part1 { //start class
	public static void main(String[] args) { //start main function
	String selectionInput; //create string for getting input
	char selection; //create char to process input
	int num1, num2; //create numbers for input
	
	System.out.println("     Calculator Program     "); //display program interface
	System.out.println("----------------------------");
	System.out.println("        A: Add              ");
	System.out.println("        B: Subtract         ");
	System.out.println("        C: Multiply         ");
	System.out.println("        D: Divide           ");
	System.out.println("----------------------------");
	
	Scanner input = new Scanner(System.in); //create scanner object
	System.out.print("Please make a selection: "); //ask for selection from menu
	selectionInput = input.next(); //get string of selection
	System.out.print("Please enter the first number: "); //ask for first number
	num1 = input.nextInt(); //get first number from user
	System.out.print("Please enter the second number: "); //ask for second number
	num2 = input.nextInt(); //get second number from user
	input.close(); //close input
	
	selectionInput = selectionInput.toUpperCase(); //turn string into uppercase letters
	selection = selectionInput.charAt(0); //get the char value from the string
	
	if (selection == 'A'){ //test for selection to be 'A'
		int answer = num1 + num2; //add numbers for answer
		System.out.println(num1 + " + " + num2 + " = " + answer); //print equation
	}
	else if (selection == 'B'){ //else test for selection to be 'B'
		int answer = num1 - num2; //subtract numbers for answer
		System.out.println(num1 + " - " + num2 + " = " + answer); //print equation
	}
	else if (selection == 'C'){ //else test for selection to be 'C'
		double answer = num1 * num2; //multiply numbers for answer
		System.out.println(num1 + " * " + num2 + " = " + answer); //print equation
	}
	else if(selection == 'D'){ //else test for selection to be 'D'
		double answer = num1 / num2; //divide numbers for answer
		System.out.println(num1 + " / " + num2 + " = " + answer); //print equation
	}//end if else nest
}//end main
}//end class