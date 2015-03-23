package lab8;

import java.util.Scanner;
public class DateFifthTry{
	private String month;
	private int day;
	private int year; //a four digit number.
	private int monthInt;
	public void writeOutput(){
		System.out.println(month + " " + day + ", " + year);
	}
	public void readInput(){
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while (tryAgain){
			System.out.println("Enter month, day, and year");
			System.out.println("as three integers:");
			System.out.println("do not use commas or other punctuations.");
			int monthInput = keyboard.nextInt();
			int dayInput = keyboard.nextInt();
			int yearInput = keyboard.nextInt();
			if (dateOK(monthInput, dayInput, yearInput)){
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			}
			else
			System.out.println("Illegal date. Reenter input.");
		}
	}
	public void setDate( int month, int day, int year){
		if (dateOK(month, day, year)){
			monthInt = month;
			this.month = monthString(month);
			this.day = day;
			this.year = year;
		}
		else{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	public void setMonth( int monthNumber){
		if ((monthNumber <= 0) || (monthNumber > 12)){
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
		month = monthString(monthNumber);
	}
	public void setDay( int day){
		if ((day <= 0) || (day > 31)){
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
		this.day = day;
	}
	public void setYear( int year){
		if ( (year < 1000) || (year > 9999) ){
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
		this.year = year;
	}
	public boolean equals(DateFifthTry otherDate){
		return ( (month.equalsIgnoreCase(otherDate.month))
		&& (day == otherDate.day) && (year == otherDate.year) );
	}
	public boolean precedes(DateFifthTry otherDate){
		return ( (year < otherDate.year) ||
		(year == otherDate.year && getMonth() < otherDate.getMonth()) ||
		(year == otherDate.year && month.equals(otherDate.month)
		&& day < otherDate.day) );
	}
	private boolean dateOK( int monthInt, int dayInt, int yearInt){
		return ( (monthInt >= 1) && (monthInt <= 12) &&
		(dayInt >= 1) && (dayInt <= 31) &&
		(yearInt >= 1000) && (yearInt <= 9999) );
	}
	private String monthString( int monthNumber){
		switch (monthNumber){
			case 1:
			return "January";
			case 2:
			return "February";
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
			default:
			System.out.println("Fatal Error");
			System.exit(0);
			return "Error"; //to keep the compiler happy
		}
	}
	
	public int getMonth(){
		return monthInt;
	}
}
