/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: BillingDialog.java
 * Desc: create program to create Bill object and create output
 */
package lab8;

public class BillingDialog{ //start class
	public static void main(String[] args){ //start main function
		System.out.println("Welcome to the law offices of"); //welcome user
		System.out.println("Dewey, Cheatham, and Howe.");
		Bill yourBill = new Bill(); //create new Bill object
		yourBill.inputTimeWorked(); //run inputTimeWorked
		yourBill.updateFee(); //update fee of bill
		yourBill.outputBill(); //output cost of bill and hours worked
		System.out.println("We have placed a lien on your house."); //say goodbye to user
		System.out.println("It has been our pleasure to serve you.");
	} //end main function
} //end class