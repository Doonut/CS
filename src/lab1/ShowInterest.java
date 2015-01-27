/*******************
 * Name:Kyle Casey
 * Date:01/24/15
 * Desc:Simple program showing interest.
 */
package lab1;

public class ShowInterest { //Start of class
	public static final double INTEREST_RATE = 2.5; //Set global static variable
	
	public static void main(String[] args) //Start of main function
	{
		double balance = 100; //Set balance
		double interest; //Initialize interest variable
		
		interest = balance * (INTEREST_RATE / 100.0); //Set interest based on global INTEREST_RATE
		System.out.println("On a balance of $" + balance); //Print balance
		System.out.println("you will earn interest of $" + interest); //Print interest
		System.out.println("All in just one short year.");
	} // end of main function
} //end of class
