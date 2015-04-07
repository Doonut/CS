package lab10;

/* Name: Kyle Casey
 * Date: 3/28/15
 * Program: Date.java
 * Desc: Create object Class for Date Manipulation.
 */


import java.util.Scanner; //import Scanner
public class Date { //start class
	private String month; //create String month
	private int day; //create int day
	private int year; //create int year 

	public Date() { //start Date()
		month = "January"; //set month to January
		day = 1; //set day to 1
		year = 1000; //set year to 1000
	} //end Date()

	public Date( int monthInt, int day, int year) { //start Date() overflow
		setDate(monthInt, day, year); //Run setDate()
	} //end Date()

	public Date(String monthString, int day, int year) { //start Date() overflow
		setDate(monthString, day, year); //Run setDate()
	} //end Date()

	public Date( int year) { //start Date() overflow
		setDate(1, 1, year); //Run setDate()
	} //end Date()

	public Date(Date aDate) { //start Date() overflow
		if (aDate == null) { //if date is null
			System.out.println("Fatal Error."); //print error 
			System.exit(0); //exit program
		} //end if
		month = aDate.month; //set month to other date's month 
		day = aDate.day; //set day to other date's day 
		year = aDate.year; //set year to other date's year 
	} //end Date()

	public void setDate(int monthInt, int day, int year) { //start setDate()
		if (dateOK(monthInt, day, year)) { //if Date is valid
			this.month = monthString(monthInt);  //set this month to String of month
			this.day = day;  //set this day to day
			this.year = year; //set this year to year
		}
		else{ //if error
			System.out.println("Fatal Error"); //print error
			System.exit(0); //exit system
		}
	} //end setDate()

	public void setDate(String monthString, int day, int year) { //start setDate() overflow
		if (dateOK(monthString, day, year)) { //if date is valid
			this.month = monthString; //set this month to monthString
			this.day = day; //set this day to day
			this.year = year; //set this year to year
		}
		else{ //if error
			System.out.println("Fatal Error"); //print error 
			System.exit(0); //exit program
		}
	} //end setDate

	public void setDate(int year) { //start setDate() overflow
		setDate(1, 1, year); //run setDate
	} //end setDate()

	public void setYear(int year) { //start setYear()
		if ( (year < 1000) || (year > 9999) ) { //if error
			System.out.println("Fatal Error"); //print error
			System.exit(0); //exit program
		}
		else
			this.year = year; //set this year to year 
	} //end setYear()

	public void setMonth(int monthNumber) { //start setMonth()
		if ((monthNumber <= 0) || (monthNumber > 12)) { //if error
			System.out.println("Fatal Error");  //print error
			System.exit(0); //exit program
		}
		else
			month = monthString(monthNumber); //set month to string of month 
	} //end setMonth()

	public void setDay(int day) { //start setDay()
		if ((day <= 0) || (day > 31)) { //if error
			System.out.println("Fatal Error"); //print error
			System.exit(0); //exit program
		}
		else
			this.day = day; //set this day to day
	} //end setDay()

	public int getMonth() { //start get month and return integer of month
		if (month.equals("January")) 
			return 1; 
		else if (month.equals("February")) 
			return 2; 
		else if (month.equals("March")) 
			return 3;
		else if (month.equals("April")) 
			return 4; 
		else if (month.equals("May")) 
			return 5; 
		else if (month.equals("June")) 
			return 6; 
		else if (month.equals("July")) 
			return 7; 
		else if (month.equals("August")) 
			return 8; 
		else if (month.equals("September")) 
			return 9; 
		else if (month.equals("October")) 
			return 10;  
		else if (month.equals("November")) 
			return 11; 
		else if (month.equals("December")) 
			return 12; 
		else{ //if error
			System.out.println("Fatal Error"); //print error
			System.exit(0); //exit program
			return 0; //return 0
		} //end else if
	} //end getMonth()

	public int getDay() { //start getDay()
		return day; //return day
	} //end getDay()

	public int getYear() { //start getYear()
		return year; //return year
	} //end getYear()

	public String toString() { //start toString()
		return (month + " " + day + ", " + year); //return string of date
	} //end toString()

	public boolean equals(Date otherDate) { //start equals()
		return ( (month.equals(otherDate.month)) 
		&& (day == otherDate.day) && (year == otherDate.year) ); //return boolean if dates are equal or not
	} //end equals

	public boolean precedes(Date otherDate) { //start precedes()
		return ( (year < otherDate.year) || 
		(year == otherDate.year && getMonth() < otherDate.getMonth()) || 
		(year == otherDate.year && month.equals(otherDate.month) 
		&& day < otherDate.day) ); //return boolean if this date precedes another
	} //end precedes()

	public void readInput() { //start readInput()
		boolean tryAgain = true; //create boolean
		Scanner keyboard = new Scanner(System.in); //create Scanner object 
		while (tryAgain) { //while tryAgain is true
			System.out.println("Enter month, day, and year."); //prompt user 
			System.out.println("Do not use a comma."); 
			String monthInput = keyboard.next(); //get month
			int dayInput = keyboard.nextInt(); //get day
			int yearInput = keyboard.nextInt(); //get year
			if (dateOK(monthInput, dayInput, yearInput) ) { //if date is valid
				setDate(monthInput, dayInput, yearInput); //run setDate() 
				tryAgain = false; //tryAgain is false
			}
			else //if error
				System.out.println("Illegal date. Reenter input."); //prompt to reenter 
		}
	} //end readInput

	private boolean dateOK( int monthInt, int dayInt, int yearInt) { //start dateOK()
		return ( (monthInt >= 1) && (monthInt <= 12) && 
		(dayInt >= 1) && (dayInt <= 31) && 
		(yearInt >= 1000) && (yearInt <= 9999) ); //return if date is valid
	} //end dateOK()

	private boolean dateOK( String monthString, int dayInt, int yearInt) { //start dateOK() overflow
		return ( monthOK(monthString) && 
		(dayInt >= 1) && (dayInt <= 31) && 
		(yearInt >= 1000) && (yearInt <= 9999) ); //return if date is valid
	} //end dateOK()

	private boolean monthOK(String month) { //start monthOK
		return (month.equals("January") || month.equals("February") || 
		month.equals("March") || month.equals("April") || 
		month.equals("May") || month.equals("June") || 
		month.equals("July") || month.equals("August") || 
		month.equals("September") || month.equals("October") || 
		month.equals("November") || month.equals("December") ); //return if month is valid
	} //end monthOK()

	private String monthString(int monthNumber) { //start monthString()
		switch (monthNumber) {
			case 1: 
				return "January"; 
			case 2:
				return "Febuary";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default: //if error
				System.out.println("Fatal Error"); //print error
				System.exit(0); //exit program
				return "Error"; //return error
		} //end switch
	} //end monthString()
} //end class