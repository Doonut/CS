package lab8;

public class DateFourthTry{
	private String month;
	private int day;
	private int year; //a four digit number.
	private int monthInt;
	
	public String toString(){
		return (month + " " + day + ", " + year);
	}
	
	public void writeOutput(){
		System.out.println(month + " " + day + ", " + year);
	}
	
	public boolean equals(DateFourthTry otherDate){
		return ( (month.equals(otherDate.month))
				&& (day == otherDate.day) && (year == otherDate.year) );
	}
	
	
	
	public boolean precedes(DateFourthTry otherDate){
		return ( (year < otherDate.year) ||
				(year == otherDate.year && getMonth() <
				otherDate.getMonth()) ||
				(year == otherDate.year && month.equals(otherDate.month)
				&& day < otherDate.day) );
	}
	
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
	
	public int getMonth(){
		return monthInt;
	}
}