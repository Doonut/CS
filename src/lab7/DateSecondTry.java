package lab7;

/***********************
* Name: Kyle Casey
* Date: 3/9/15
* Program: DateSecondTry.java
* Desc: Create class to process and return day month and year variables
* and a seperate function to write the output.
*/

import java.util.Scanner; //import Scanner

public class DateSecondTry{ //start class
	private String month; //create private month string
	private int day; //create private day int
	private int year; //create private year int
	public void writeOutput(){ //start writeOutput function
		System.out.println(month + " " + day + ", " + year); //priunt month day and year correctly formatted
	} //end writeOutput
	public void readInput(){ //start readInput function
		Scanner keyboard = new Scanner(System.in); //create Scanner object
		System.out.println("Enter month, day, and year."); //prompt user to enter month day and year
		System.out.println("Do not use a comma.");
		month = keyboard.next(); //get month from user
		day = keyboard.nextInt(); //get day from user
		year = keyboard.nextInt(); //get year from user
		keyboard.close();
	} //end readInput
	public int getDay(){ //start getDay
		return day; //return day private int
	} //end getDay
	public int getYear(){ //start getYear
		return year; //return year private int
	} //end getYear
	public int getMonth(){ //start getMonth
		if (month.equalsIgnoreCase("January")) //if month is january
			return 1; //return int that cordinates to month
		else if (month.equalsIgnoreCase("February"))//if month is febuary
			return 2; //return int that cordinates to month
		else if (month.equalsIgnoreCase("March"))//if month is march
			return 3; //return int that cordinates to month
		else if (month.equalsIgnoreCase("April"))//if month is april
			return 4; //return int that cordinates to month
		else if (month.equalsIgnoreCase("May"))//if month is may
			return 5; //return int that cordinates to month
		else if (month.equals("June"))//if month is june
			return 6; //return int that cordinates to month
		else if (month.equalsIgnoreCase("July"))//if month is july
			return 7; //return int that cordinates to month
		else if (month.equalsIgnoreCase("August"))//if month is august
			return 8; //return int that cordinates to month
		else if (month.equalsIgnoreCase("September"))//if month is september
			return 9; //return int that cordinates to month
		else if (month.equalsIgnoreCase("October"))//if month is october
			return 10; //return int that cordinates to month
		else if (month.equalsIgnoreCase("November"))//if month is november
			return 11; //return int that cordinates to month
		else if (month.equalsIgnoreCase("December"))//if month is december
			return 12; //return int that cordinates to month
		else{ //if no matching month
			System.out.println("Fatal Error"); //print error
			System.exit(0); //exit system
			return 0; //Needed to keep the compiler happy
		} //end if else nest
	}//end getMonth
} //end class