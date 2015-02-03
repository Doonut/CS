package lab2;
import java.util.Scanner;
public class ScannerDemo2 {
	public static void main(String[] args)
	{
		int n1, n2; //make 2 integers
		Scanner scannerObject = new Scanner(System.in); //Make System.in Scanner object
		System.out.println("Enter two whole numbers");
		System.out.println("separated by one or more spaces:");
		
		n1 = scannerObject.nextInt(); //get first integer entered
		n2 = scannerObject.nextInt(); //get second integer entered
		System.out.println("You entered " + n1 + " and " + n2); //Print integers entered
		
		System.out.println("Next enter two numbers.");
		System.out.println("Decimal points are allowed.");
		
		double d1, d2; //make 2 doubles
		d1 = scannerObject.nextDouble(); //get first double entered
		d2 = scannerObject.nextDouble(); //get second double entered
		System.out.println("You entered " + d1 + " and " + d2); //print doubles entered
		
		System.out.println("Next enter two words:");
		
		String word1 = scannerObject.next(); //get first string entered
		String word2 = scannerObject.next(); //get second string entered
		System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\""); //print strings entered
		
		System.out.println("Next enter a line of text:");
		String line = scannerObject.nextLine(); //get whole line of text
		System.out.println("You entered: \"" + line + "\""); //print whole line of text
	}
}
