package project3;

/***********************
* Name: Kyle Casey
* Date: 2/23/15
* Program: Project3Part2.java5
* Desc: Make a calculator program to add, subtract, multiply, and divide with a do-while loop.
*/

import java.util.Scanner; //Import Scanner

public class Project3Part2 { //start class
	public static void main(String[] args) { //start main function
		boolean go = true; //set go variable for loop
		String selectionInput; //create string for getting input
		char selection; //create char to process input
		int num1, num2; //create numbers for input
		double answer = 0; //set answer variable
		Scanner input = new Scanner(System.in); //create scanner object
		do{ //start loop
			System.out.println("     Calculator Program     "); //display program interface
			System.out.println("----------------------------");
			System.out.println("        A: Add              ");
			System.out.println("        B: Subtract         ");
			System.out.println("        C: Multiply         ");
			System.out.println("        D: Divide           ");
			System.out.println("        X: Exit             ");
			System.out.println("----------------------------");
			
			
			System.out.print("Please make a selection: "); //ask for selection from menu
			selectionInput = input.next(); //get string of selection
		
			selectionInput = selectionInput.toUpperCase(); //turn string into uppercase letters
			selection = selectionInput.charAt(0); //get the char value from the string
			if (selection == 'X'){ //if selection is 'X'
				go = false; //set go to false
				break; //break out of while loop
			} //end if
			System.out.print("Please enter the first number: "); //ask for first number
			num1 = input.nextInt(); //get first number from user
			System.out.print("Please enter the second number: "); //ask for second number
			num2 = input.nextInt(); //get second number from user

			switch (selection){ //switch for selection char
			case 'A': //test for selection to be 'A'
				answer = num1 + num2; //add numbers for answer
				System.out.println(num1 + " + " + num2 + " = " + answer); //print equation
				break;
			case 'B': //test for selection to be 'B'
				answer = num1 - num2; //subtract numbers for answer
				System.out.println(num1 + " - " + num2 + " = " + answer); //print equation
				break;
			case 'C': //test for selection to be 'C'
				answer = num1 * num2; //multiply numbers for answer
				System.out.println(num1 + " * " + num2 + " = " + answer); //print equation
				break;
			case 'D': //test for selection to be 'D'
				answer = num1 / num2; //divide numbers for answer
				System.out.println(num1 + " / " + num2 + " = " + answer); //print equation
				break;
			}//end switch

		}while (go == true); //end loop depending on go variable
		input.close(); //close input
	}//end main
}//end class