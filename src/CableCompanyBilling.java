/***********************
* Name: Kyle Casey
* Date: 2/26/15
* Program: cableCompanyBilling.java
* Desc: make a program to calculate a cable company's charges.
*/
import java.util.Scanner; //import Scanner

public class CableCompanyBilling { //start class
	public static void main(String[] args) { //start function
		char customerType = ' '; //create empty char
		double bill = 0; //create empty double
		Scanner input = new Scanner(System.in); //create input Scanner object
		System.out.print("What is your Account Number?: "); //ask for account number
		int accountNumber = input.nextInt(); //get account number from user
		System.out.print("Are you a residential or a buisness customer? (R or B): "); //ask for type of customer
		String customerTypeString = input.next(); //get customer type in string
		customerTypeString = customerTypeString.toUpperCase(); //convert string to uppercase
		customerType = customerTypeString.charAt(0); //convert string to a char
		if (customerType == 'R') { //if customer is residential
			System.out.print("How many premium programs would you like?: "); //ask for amount of premium channels
			int premiumChannels = input.nextInt(); //get number of premium channels from user
			bill = 25 + 7.50 * premiumChannels; //calculate bill
		}
		else if (customerType == 'B') { //if customer is buisness
			System.out.print("How many premium programs would you like?: "); //aske for amount of premium channels
			int premiumChannels = input.nextInt(); //get number of premium channels from user
			System.out.print("How many basic service connections would you like?: "); //ask for amount of connections
			int serviceConnections = input.nextInt(); //get number of service connections
			int connectionCost; //create connection cost int
			if (serviceConnections > 10){ //if more than 10 service connections
				serviceConnections = serviceConnections - 10; //take away extra connections
				connectionCost = 750 + serviceConnections * 5; //calculate connection cost
			}
			else { //else less than or equal to 10 connections
				connectionCost = serviceConnections * 75; //calculate connection cost
			} //end if else
			bill = 15 + 50 * premiumChannels + connectionCost; //calculate bill
		} //end if else
		System.out.println("Customer #" + accountNumber + ", your bill is $" + bill + " a month."); //print out customer accountNumber and thier bill every month
		input.close();
	} //end main
} //end class