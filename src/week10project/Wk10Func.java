package week10project;
import java.util.Scanner;


public class Wk10Func {
	private static Scanner input;
	private static int num1, num2;
	private static String selectionInput;
	private static char selection;
	private static boolean go = true;
	
	public Wk10Func(){
		CalcLoop();
	}
	
	public static void CalcLoop(){
		double answer = 0; //set answer variable
		input = new Scanner(System.in); //create scanner object
		do{ //start loop
			welcomeScreen();
			input();
			if (go == false)
					break;
			output(answer);
		}while (go == true); //end loop depending on go variable
		input.close();
	}
	
	private static void output(double answer){
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
	}
	
	private static void add(double answer){
		answer = num1 + num2; //add numbers for answer
		System.out.println("\n" + num1 + " + " + num2 + " = " + answer + "\n"); //print equation
	}
	
	private static void subtract(double answer){
		answer = num1 - num2; //subtract numbers for answer
		System.out.println("\n" + num1 + " - " + num2 + " = " + answer + "\n"); //print equation
	}
	
	private static void multiply(double answer){
		answer = num1 * num2; //multiply numbers for answer
		System.out.println("\n" + num1 + " * " + num2 + " = " + answer + "\n"); //print equation
	}
	
	private static void divide(double answer){
		answer = num1 / num2; //divide numbers for answer
		System.out.println("\n" + num1 + " / " + num2 + " = " + answer + "\n"); //print equation
	}
	
	private static void welcomeScreen(){
		System.out.println("     Calculator Program     "); //display program interface
		System.out.println("----------------------------");
		System.out.println("        A: Add              ");
		System.out.println("        B: Subtract         ");
		System.out.println("        C: Multiply         ");
		System.out.println("        D: Divide           ");
		System.out.println("        X: Exit             ");
		System.out.println("----------------------------");
	}
	
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
		}
	}
}
