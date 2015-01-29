/*------------------------------------
 *Program: ScannerText Java
 *Programmer: Kyle Casey
 *Date: 1/29/2015
 *Description:  This program will show how scanners are used.
 *				We also introduce the flush() to get rid
 *				of garbage in System.in.
 */
 
import java.util.Scanner; //import java scanner

//declaring the main method this is called 0 main header
public class ScannerTest {
	
	//declaring the main method this is called 0 main header
	public static void main (String[] args){
	
		//create and initialize int, double, and string variables
		int num1 = 0;
		double num2 = 0;
		String str = "",str1 = "";
		
		/*Creating an instance or object of the scanner class by mapping
		in the system in put stream */
		Scanner input = new Scanner(System.in);//creating a scanner
		
		//Asks the user for whole number input
		System.out.print( "Enter a number: " );//Prints enter a number
		num1 = input.nextInt();//Gets input from the scanner
		
		//Asks the user for decimal input
		System.out.print( "Enter a decimal number: " );//prints enter a decimal number
		num2 = input.nextInt();//Gets input from the scanner
		
		//Asks the user for you full name
		System.out.print( "Enter your name: " );//will print enter your name
		str1 = input.next();//sets str to your name
		str = input.nextLine();//Gets input from the scanner
		
		System.out.println("The number is "+ num1 +"and the floating poimt is "+ num2 +" and your name is "+ str1 +" "+ str +".");//prints all user input
	}//end
}//end
