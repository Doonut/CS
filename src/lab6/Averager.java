package lab6;

/***********************
* Name: Kyle Casey
* Date: 2/27/15
* Program: Averager.java
* Desc: program to take average of many numbers.
*/

import java.util.Scanner; //import Scanner

public class Averager{ //start class
	public static void main(String[] args){ //start main function
		Scanner keyboard = new Scanner(System.in); //create Scanner keyboard object
		System.out.println("Enter a list of nonnegative scores."); //prompt user to enter scores
		System.out.println("Mark the end with a negative number.");
		System.out.println("I will compute their average.");
		double next, sum = 0; //create 2 double variables
		int count = 0; //create count int
		next = keyboard.nextDouble( ); //get next Double from user
		while (next >= 0){ //if next is greater or equal to 0
			sum = sum + next; //add next to sum
			count++; //increment count
			next = keyboard.nextDouble( ); //get next double from user
		}
		if (count == 0) //if count is equal to 0
			System.out.println("No scores entered."); //print no scores entered
		else{ //else run
			double average = sum/count; //calculate average
			System.out.println(count + " scores read."); //tell user how many scores were read
			System.out.println("The average is " + average); //print the average
		} //end if else nest
		keyboard.close();
	 } //end main
} //end class