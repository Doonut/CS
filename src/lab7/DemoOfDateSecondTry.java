package lab7;

/***********************
* Name: Kyle Casey
* Date: 3/9/15
* Program: DemoOfDateSecondTry.java
* Desc: Create a DateSecondTry object and use functions to print day month
* and year formatted correctly.
*/

public class DemoOfDateSecondTry{ //start class
	public static void main(String[] args){ //start main
		DateSecondTry date = new DateSecondTry(); //create DateSecondTry object
		date.readInput(); //run readInput function from class
		int dayNumber = date.getDay(); //run getDay() and save output to int
		System.out.println("That is the " + dayNumber + "th day of the month."); //print output correctly formatted
	} //end main
} //end class