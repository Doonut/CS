/***********************
* Name: Kyle Casey
* Date: 2/8/15
* Program: Project2ReadWrite.java
* Desc: Read a file and write back to another.
*/

import java.io.*; //import libraries
import java.util.*;
import javax.swing.*;

public class Project2Part3And4 { //start of class
	public static String inFileName = "in.txt", outFileName = "out.txt"; //specify file paths
	public static int testScores = 5; //specify how many test scores
	public static void main(String[] args) throws FileNotFoundException //start of main with throws
	{
		String message = "";
		int[] scores; //create int array
		scores = new int[testScores]; //set int array size
		int total = 0,average; //create int total and average
		Scanner inFile = new Scanner(new FileReader(inFileName)); //create inFile Scanner
		PrintWriter outFile = new PrintWriter(outFileName); //create outFile PrintWriter
		
		String firstName = inFile.next(); //get firstName from file
		String lastName = inFile.nextLine(); //get lastName from file
		
		for(int i=0; inFile.hasNextInt(); ++i) {  //create for loop that grabs all integers from in.txt 
		scores[i] = inFile.nextInt(); //save integers to array
		total = total + scores[i]; //add to total every irritation
		}
		
		average = total / scores.length; //calculate average by dividing total by array length
		
		outFile.println("First Name: " + firstName); //write out first name
		outFile.println("Last Name:" + lastName); //write out last name
		outFile.print("The test scores are: ");
		for(int i=0; scores.length > i; ++i) { //create for loop that runs for every integer in array
			if (scores.length - 1 == i) { //if the last integer in array...
				outFile.println("and " + scores[i] + "%"); //write out with only percent sign
			}
			else {
				outFile.print(scores[i] + "%, "); //write out score with percent sign and formatting
			}
		}
		outFile.print("The average of the test scores is: " + average + "%"); //write out average test score
		outFile.close(); //close outFile
		
		message = message + "Name: " + firstName + lastName + "\n" + "Test Scores: ";
		for (int i=0; scores.length > i; ++i)
		{
			if (scores.length - 1 == i) {
				message = message + scores[i] + "\n";
			}
			else {
				message = message + scores[i] + " ";
			}	
		}
		JOptionPane.showMessageDialog(null, message, "Wages", JOptionPane.INFORMATION_MESSAGE);
		
		inFile.close(); //close inFile
	}
}
