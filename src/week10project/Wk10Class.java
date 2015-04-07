package week10project;

/* Name: Kyle Casey, Bora Oytun
 * Date: 3/28/15
 * Program: Wk10Class.java
 * Desc: Create functions for calculator Program
 */

import java.util.Scanner; //import Scanner

public class Wk10Class { //start class
	private static Scanner input; //create private Scanner
	private static int num1, num2; //create 2 private integers
	private static String selectionInput; //create private String
	private static char selection; //create private Character
	private static boolean go = true; //create private boolean
	
	public static void main(String[] args) { //start main function	
		CalcLoop(); //run CalcLoop()
	} //end main
	public static void CalcLoop(){ //start CalcLoop() Function
		double answer = 0; //set answer variable
		input = new Scanner(System.in); //create Scanner object
		do{ //start loop
			welcomeScreen(); //run welcomeScreen()
			input(); //run input()
			if (go == false) //if break loop
					break; //then break out of do loop
			output(answer); //run output with answer as a argument
		}while (go == true); //end loop depending on go variable
		input.close(); //close input object
	} //end CalcLoop()
	
	private static void output(double answer){ //start output()
		switch (selection){ //switch for selection char
		case 'A': //test for selection to be 'A'
			add(answer);
			break;
		case 'B': //test for selection to be 'B'
			subtract(answer);
			break;
		case 'C': //test for selection to be 'C'
			multiply(answer);
			break;
		case 'D': //test for selection to be 'D'
			divide(answer);
			break;
		}//end switch
	} //end output()
	
	private static void add(double answer){ //start add()
		answer = num1 + num2; //add numbers for answer
		System.out.println("\n" + num1 + " + " + num2 + " = " + answer + "\n"); //print equation
	} //end add()
	
	private static void subtract(double answer){ //start subtract()
		answer = num1 - num2; //subtract numbers for answer
		System.out.println("\n" + num1 + " - " + num2 + " = " + answer + "\n"); //print equation
	} //end subtract()
	
	private static void multiply(double answer){ //start multiply()
		answer = num1 * num2; //multiply numbers for answer
		System.out.println("\n" + num1 + " * " + num2 + " = " + answer + "\n"); //print equation
	} //end multiply90
	
	private static void divide(double answer){ //start divide()
		answer = num1 / num2; //divide numbers for answer
		System.out.println("\n" + num1 + " / " + num2 + " = " + answer + "\n"); //print equation
	} //end divide()
	
	private static void welcomeScreen(){ //start welcomeScreen()
		System.out.println("     Calculator Program     "); //display program interface
		System.out.println("----------------------------");
		System.out.println("        A: Add              ");
		System.out.println("        B: Subtract         ");
		System.out.println("        C: Multiply         ");
		System.out.println("        D: Divide           ");
		System.out.println("        X: Exit             ");
		System.out.println("----------------------------");
	} //end welcomeScreen()
	
	private static void input(){
		System.out.print("Please make a selection: "); //ask for selection from menu
		selectionInput = input.next(); //get string of selection
	
		selectionInput = selectionInput.toUpperCase(); //turn string into uppercase letters
		selection = selectionInput.charAt(0); //get the char value from the string
		if (selection == 'X'){ //if selection is 'X'
			go = false; //set go to false
		} //end if
		else{
		System.out.print("Please enter the first number: "); //ask for first number
		num1 = input.nextInt(); //get first number from user
		System.out.print("Please enter the second number: "); //ask for second number
		num2 = input.nextInt(); //get second number from user
		} //end if else
	} //end input()
} //end class
