/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: Bill.java
 * Desc: create program to calculate bill for amount of work
 */
package lab8;

import java.util.Scanner; //import Scanner
public class Bill{ //start class
	public static final double RATE = 150.00; //create final double rate
	private int hours; //create private int hours
	private int minutes; //create private int minutes
	private double fee; //create private double fee
	public void inputTimeWorked(){ //create public void function
		System.out.println("Enter number of full hours worked"); //print user information
		System.out.println("followed by number of minutes:");
		Scanner keyboard = new Scanner(System.in); //create Scanner object
		hours = keyboard.nextInt(); //get hours worked
		minutes = keyboard.nextInt(); //get minutes worked
		keyboard.close(); //close keyboard object
	} //end function
	private double computeFee( int hoursWorked, int minutesWorked){ //create function with double return value
		minutesWorked = hoursWorked * 60 + minutesWorked; //calculate total minutes worked
		int quarterHours = minutesWorked/15; //calculate total quarter hours worked
		return quarterHours * RATE; //return Fee of bull
	} //end function
	public void updateFee(){ //create public void function
		fee = computeFee(hours, minutes); //run computer fee with hours and minutes as inputs and set to private variable fee
	} //end function
	public void outputBill(){ //create public void function
		System.out.println("Time worked: ");
		System.out.println(hours + " hours and " + minutes + " minutes"); //display time worked
		System.out.println("Rate: $" + RATE + " per quarter hour."); //display rate per quarter hour
		System.out.println("Amount due: $" + fee); //display amount due
	} //end function
} //end class