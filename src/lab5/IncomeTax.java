package lab5;

/***********************
* Name: Kyle Casey
* Date: 2/23/15
* Program: IncomeTax.java
* Desc: program to calculate income tax.
*/

import java.util.Scanner; //import libraries

public class IncomeTax { //start class
	public static void main(String[] args) { //start main function
		Scanner keyboard = new Scanner(System.in); //create scanner object
		double netIncome, tax, fivePercentTax, tenPercentTax; //create double variables
		
		System.out.println("Enter net income.\n" 
						+ "Do not include a dollar sign or any commas."); //prompt user for input
		netIncome = keyboard.nextDouble(); //get next double variable from user
		
		if (netIncome <= 15000){ //if user makes no more than 15000
			tax = 0; //no tax
		}
		else if ((netIncome > 15000) && (netIncome <= 30000)){ //if user makes 15000-30000 
			 tax = (0.05*(netIncome - 15000)); //extra income * 0.05
		}
		else { // if higher than 30000
			 fivePercentTax = 0.05*15000; //calculate 5% tax
			 tenPercentTax = 0.10*(netIncome - 30000); //calculate 10% tax
			 tax = (fivePercentTax + tenPercentTax); //add them together
		}
		keyboard.close();
		System.out.printf("Tax due = $%.2f", tax); //print out amount of tax due
	}
}
