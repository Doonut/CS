/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: DateFifthTry.java
 * Desc: create program to manipulate dates
 */
package lab8;

import java.util.Scanner; //import Scanner
public class DateFifthTry{ //start class
	private String month; //create private string month
	private int day; //create private int day
	private int year; //create private int year
	private int monthInt; //create private monthInt
	
	public void writeOutput(){ //start writeOutput() function
		System.out.println(month + " " + day + ", " + year); //display month, day, and year
	} //end function
	
	public void readInput(){ //create readInput() function
		boolean tryAgain = true; //create boolean tryAgain
		Scanner keyboard = new Scanner(System.in); //create Scanner object
		while (tryAgain){ //while tryAgain is true..
			System.out.println("Enter month, day, and year"); //tell user directions
			System.out.println("as three integers:");
			System.out.println("do not use commas or other punctuations.");
			int monthInput = keyboard.nextInt(); //get month
			int dayInput = keyboard.nextInt(); //get day
			int yearInput = keyboard.nextInt(); //get year
			if (dateOK(monthInput, dayInput, yearInput)){ //if date ok
				setDate(monthInput, dayInput, yearInput); //run setDate to inputs
				tryAgain = false; //set tryAgian to false
			} //end if
			else
			System.out.println("Illegal date. Reenter input."); //prompt user to try agian
		} //end if else
	} //end readInput()
	
	public void setDate(int month, int day, int year){ //start setDate function
		if (dateOK(month, day, year)){ //if date ok
			monthInt = month; //set month int to month number
			this.month = monthString(month); //set this month to string of month
			this.day = day; //set this day to input of day
			this.year = year; //set this year to input of year
		} //end if
		else{
			System.out.println("Fatal Error"); //print fatal error
			System.exit(0); //exit program
		} //end else if
	} //end setDate()
	
	public void setMonth(int monthNumber){ //start setMonth function
		if ((monthNumber <= 0) || (monthNumber > 12)){ //if month is not in between 0 and 12
			System.out.println("Fatal Error"); //print fatal error
			System.exit(0); //exit program
		} //end if
		else
		month = monthString(monthNumber); //set month to string of month
	} //end setMonth()
	
	public void setDay(int day){ //start setDay function
		if ((day <= 0) || (day > 31)){ //if day is not in between 0 and 31
			System.out.println("Fatal Error"); //print fatal error
			System.exit(0); //exit program
		} //end if
		else
		this.day = day; //set day to this day
	} //end setDay()
	
	public void setYear( int year){ //start setYear function
		if ( (year < 1000) || (year > 9999) ){ //if year is not in between 1000 and 9999
			System.out.println("Fatal Error"); //print fatal error
			System.exit(0); //exit program
		} //end if
		else
		this.year = year; //set year to this year
	} //end setYear()
	
	public boolean equals(DateFifthTry otherDate){ //start boolean function equals()
		return ((month.equalsIgnoreCase(otherDate.month)) 
		&& (day == otherDate.day) && (year == otherDate.year)); //return if other date and this date are equal or not
	} //end equals()
	
	public boolean precedes(DateFifthTry otherDate){ //start boolean function precedes()
		return ( (year < otherDate.year) ||
		(year == otherDate.year && getMonth() < otherDate.getMonth()) ||
		(year == otherDate.year && month.equals(otherDate.month)
		&& day < otherDate.day) ); //return if this date precedes another date or not
	} //end precedes()
	
	private boolean dateOK( int monthInt, int dayInt, int yearInt){ //start boolean function dateOK()
		return ( (monthInt >= 1) && (monthInt <= 12) &&
		(dayInt >= 1) && (dayInt <= 31) &&
		(yearInt >= 1000) && (yearInt <= 9999) ); //return of date is valid or not
	} //end dateOK()
	
	private String monthString(int monthNumber){ //start monthString function
		switch (monthNumber){ //start switch statement
			case 1:
				return "January"; //if 1 return jan
			case 2:
				return "February"; //if 2 return feb
			case 3:
				return "March"; //if 3 return march
			case 4: 
				return "April"; //if 4 return april
			case 5:
				return "May"; //if 5 return may
			case 6:
				return "June"; //if 6 return june
			case 7:
				return "July"; //if 7 return july
			case 8:
				return "August"; //if 8 return august
			case 9:
				return "September"; //if 9 return sep
			case 10:
				return "October"; //if 10 retuen oct
			case 11:
				return "November"; //if 11 return nov
			case 12:
				return "December"; //if 12 return dec
			default:
				System.out.println("Fatal Error"); //print error if no number matching m  onth
				System.exit(0); //exit system
				return "Error"; //to keep the compiler happy
		} //end switch
	} //end function
	
	public int getMonth(){ //start int function getMonth()
		return monthInt; //return monthInt
	} //end getMonth()
} //end class
