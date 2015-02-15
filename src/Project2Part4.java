/***********************
* Name: Kyle Casey
* Date: 2/14/15
* Program: Project2Part4.java
* Desc: Read a file and write back to another.
*/

import java.io.*; //import libraries
import java.util.*;
import javax.swing.*;

public class Project2Part4 { //start class
	public static string inFileName = "in.txt"; //define inFile location
	public static void main(String[] args) throws IOException { //start main function
		Scanner inFile = new Scanner(new FileReader(inFileName)); //make scanner for infile FileReader
		String firstName = inFile.next(); //get firstName from file
		String lastName = inFile.next(); //get lastName from file
		int hoursWorked = inFile.nextInt(); //get hoursWorked int from file
		int payRate = infile.nextInt(); //get payRate int from file
		inFile.close(); //close inFile
		double wages = hoursWorked * payRate; //calculate wages from hoursWorked and payRate
		String message = "Name: " + firstName + lastName + "\n"; //add name to message
		message = message + "Hours Worked: " + hoursWorked + "\n"; //add hoursWorked to message
		message = message + "Pay Rate: " + payRate + "\n"; //add payRate to message
		message = message + "Wages: " + wages; //add wages to message
		JOptionPane.showMessageDialog(null, message, "Wages", JOptionPane.INFORMATION_MESSAGE); //create information message with formatted data from message String
	}
}