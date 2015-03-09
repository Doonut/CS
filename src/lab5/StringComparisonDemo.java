package lab5;

/***********************
* Name: Kyle Casey
* Date: 2/24/15
* Program: StringComparisonDemo.java
* Desc: compare strings to see which comes first in the alphabet.
*/

public class StringComparisonDemo { //start class
	public static void main(String[] args) { //start main function
		String s1 = "Java isn't just for breakfast."; //create string with lowercase
		String s2 = "JAVA isn't just for breakfast."; //create string with uppercase
		
		if (s1.equals(s2)) //if lower case equals upper case
			System.out.println("The two lines are equal."); 
		else //if not equal
			System.out.println("The two lines are not equal."); 
		if (s2.equals(s1)) //if upper case equals lower case
			System.out.println("The two lines are equal."); 
		else //if not equal
			System.out.println("The two lines are not equal."); 
		if (s1.equalsIgnoreCase(s2))//if lower case equals upper case ignoring case 
			System.out.println("But the lines are equal, ignoring case."); 
		else  //if not equal
			System.out.println("Lines are not equal, even ignoring case.");

		String s3 = "A cup of java is a joy forever."; //create string
		if (s3.compareToIgnoreCase(s1) < 0) { //if s3 precedes s1 in the alphabet 
			System.out.println("\"" + s3 + "\"");  //print s3
			System.out.println("precedes"); 
			System.out.println("\"" + s1 + "\"");  //print s1
			System.out.println("in alphabetic ordering"); 
		} 
		else //if not equal
			System.out.println("s3 does not precede s1."); 
	} 
}