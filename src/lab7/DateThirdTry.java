package lab7;

/***********************
* Name: Kyle Casey
* Date: 3/9/15
* Program: DateThirdTry.java
* Desc: create a functon to set a day month and year, a function to process the string for
* the month, and a function to process the output.
*/



public class DateThirdTry{ //start class
	private String month; //create private month string
	private int day; //create private day int
	private int year; //create private year int
	public void setDate( int newMonth, int newDay, int newYear){ //create setDate function
		month = monthString(newMonth); //set month to string name of month into private int 
		day = newDay; //set private day int from function int
		year = newYear; //set private year int from function int
	} //end setDate

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

	public void writeOutput(){ //create writeOutput function
		System.out.print(month + " " + day + ", " + year); //print output of month day and year formatted
	} //end writeOutput
} //end class