/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: DateFourthTry.java
 * Desc: create program to manipulate dates
 */
package lab8;

public class DateFourthTry{ //start class
	private String month; //create private string month
	private int day; //create private int day
	private int year; //create private int year
	private int monthInt; //create private monthInt
	
	public String toString(){ //start String function toString()
		return (month + " " + day + ", " + year); //return string of month day and year
	} //end toString()
	
	public void writeOutput(){ //start function writeOutput()
		System.out.println(month + " " + day + ", " + year); //display month day and year
	} //end writeOutput()
	
	public boolean equals(DateFourthTry otherDate){ //start boolean function equals()
		return ( (month.equals(otherDate.month))
				&& (day == otherDate.day) && (year == otherDate.year) ); //return if other date equals this date
	} //end equals()
	
	
	
	public boolean precedes(DateFourthTry otherDate){ //start boolean function precedes()
		return ( (year < otherDate.year) ||
				(year == otherDate.year && getMonth() <
				otherDate.getMonth()) ||
				(year == otherDate.year && month.equals(otherDate.month)
				&& day < otherDate.day) ); //return if this date precedes another
	} //end precedes()
	
	public String monthString(int monthNumber){ //start monthString function
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
	
	public void setDate( int newMonth, int newDay, int newYear){ //create setDate function
		monthInt = newMonth;
		month = monthString(newMonth); //set month to string name of month into private int 
		day = newDay; //set private day int from function int
		year = newYear; //set private year int from function int
	} //end setDate
	
	public int getMonth(){ //start int function getMonth()
		return monthInt; //return monthInt
	} //end getMonth()
} //end class