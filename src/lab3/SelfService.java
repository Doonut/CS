package lab3;

import java.util.Scanner; //import Scanner
public class SelfService //Class
{
	public static void main(String[] args) //Main method
	{
		Scanner keyboard = new Scanner(System.in); //Create keyboard Scanner object
		System.out.println("Enter number of items purchased"); //Ask how many items purchased
		System.out.println("followed by the cost of one item."); //Ask how much each item purchase is
		System.out.println("Do not use a dollar sign.");
		int count = keyboard.nextInt(); //get how many items into integer
		double price = keyboard.nextDouble(); //get how much each item is into double
		double total = count*price; //calculate total cost
		System.out.printf("%d items at $%.2f each.%n", count, price); //print how many items at what price per item
		System.out.printf("Total amount due $%.2f. %n", total); //print total amount
		System.out.println("Please take your merchandise."); //Self service conversation...
		System.out.printf("Place $%.2f in an envelope %n", total);
		System.out.println("and slide it under the office door.");
		System.out.println("Thank you for using the self-service line.");
	} //end Main method
} //end class