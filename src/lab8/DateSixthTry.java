package lab8;

import java.util.Scanner;
public class DateSixthTry{
  private String month;
  private int day;
  private int year; //a four digit number.
  
  public void writeOutput(){
		System.out.println(month + " " + day + ", " + year);
	}
  
  public void setDate( int monthInt, int day, int year){
    if (dateOK(monthInt, day, year))
    {
      this.month = monthString(monthInt);
      this.day = day;
      this.year = year;
    }
    else
    {
      System.out.println("Fatal Error");
      System.exit(0);
    }
  }

  public void setDate(String monthString, int day, int year){
    if (dateOK(monthString, day, year))
    {
      this.month = monthString;
      this.day = day;
      this.year = year;
    }
    else
    {
      System.out.println("Fatal Error");
      System.exit(0);
    }
  }

  public void setDate( int year){
    setDate(1, 1, year);
  }

  private boolean dateOK( int monthInt, int dayInt, int yearInt){
    return ( (monthInt >= 1) && (monthInt <= 12) &&
    (dayInt >= 1) && (dayInt <= 31) &&
    (yearInt >= 1000) && (yearInt <= 9999) );
  }

  private boolean dateOK(String monthString, int dayInt, int yearInt){
    return ( monthOK(monthString) &&
    (dayInt >= 1) && (dayInt <= 31) &&
    (yearInt >= 1000) && (yearInt <= 9999) );
  }

  private boolean monthOK( String month){
    return (month.equals("January") || month.equals("February") ||
    month.equals("March") || month.equals("April") ||
    month.equals("May") || month.equals("June") ||
    month.equals("July") || month.equals("August") ||
    month.equals("September") || month.equals("October") ||
    month.equals("November") || month.equals("December") );
  }

  public void readInput(){
    boolean tryAgain = true;
    Scanner keyboard = new Scanner(System.in);
    while (tryAgain)
    {
      System.out.println("Enter month, day, and year.");
      System.out.println("Do not use a comma.");
      String monthInput = keyboard.next();
      int dayInput = keyboard.nextInt();
      int yearInput = keyboard.nextInt();
      if (dateOK(monthInput, dayInput, yearInput) )
      {
        setDate(monthInput, dayInput, yearInput);
        tryAgain = false;
      }
      else
      System.out.println("Illegal date. Reenter input.");
    }
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
}
