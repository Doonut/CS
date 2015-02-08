/***********************
* Name: Kyle Casey
* Date: 2/8/15
* Program: DelimiterDemo.java
* Desc: print a delimiter in place of whitespace.
*/

package lab3;
import java.util.Scanner;
public class DelimiterDemo { //Start of class
	public static void main(String[] args) //Start of main method
	{
		Scanner keyboard1 = new Scanner (System.in); //Scanner with whitespace Delimiter
		Scanner keyboard2 = new Scanner (System.in); //Scanner with '##' Delimiter
		keyboard2.useDelimiter("##");
		
		String word1, word2; //Make 2 uninitialized strings
		System.out.println("Enter a line of text:");
		word1 = keyboard1.next(); //Enter word 1 from next String
		word2 = keyboard1.next(); //Enter word 2 from next String
		System.out.println("For keyboard1 the two words read are:");
		System.out.println(word1); //Print word 1
		System.out.println(word2); //Print word 2

		
		System.out.println("Reenter the same line of text:");
		word1 = keyboard2.next(); //Enter word 1 from next String
		word2 = keyboard2.next(); //Enter word 2 from next String
		System.out.println(word1); //Print word 1
		System.out.println(word2); //Print word 2
	} //end of main method
} //end of class
