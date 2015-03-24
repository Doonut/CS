/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: DateSixthTry.java
 * Desc: create program to manipulate dates
 */
package lab8;

import java.util.Scanner; //import Scanner
public class DateSixthTry{ //start class
  private String month; //create private String month
  private int day; //create private int day
  private int year; //create private int year
  
  public void writeOutput(){ //start function writeOutput()
		System.out.println(month + " " + day + ", " + year); //print month, day, and year
	} //end writeOutput()
  
  public void setDate( int monthInt, int day, int year){ //start function setDate()
    if (dateOK(monthInt, day, year)){ //if dateOK
      this.month = monthString(monthInt); //set this month to string of month
      this.day = day; //set this day to int of day
      this.year = year; //set this year to int of year
    } //end if
    else{
      System.out.println("Fatal Error"); //print fatal error
      System.exit(0); //exit program
    } //end else if
  } //end setDate()

  public void setDate(String monthString, int day, int year){ //start function setDate()
    if (dateOK(monthString, day, year)){ //if dateOK
      this.month = monthString; //set this month to string of month
      this.day = day; //set this day to int of day
      this.year = year; //set this year to int of year
    } //end if
    else{
      System.out.println("Fatal Error"); //print fatal error
      System.exit(0); //exit program
    } //end else if
  } //end setDate()

  public void setDate( int year){ //start function setDate() overload
    setDate(1, 1, year); //set date to Jan 1st and year
  } //end setDate overload

  private boolean dateOK( int monthInt, int dayInt, int yearInt){ //start boolean function dateOK()
    return ( (monthInt >= 1) && (monthInt <= 12) &&
    (dayInt >= 1) && (dayInt <= 31) &&
    (yearInt >= 1000) && (yearInt <= 9999) ); //return if date is valid
  } //end dateOK()

  private boolean dateOK(String monthString, int dayInt, int yearInt){ //start boolean function dateOK() overload
    return ( monthOK(monthString) &&
    (dayInt >= 1) && (dayInt <= 31) &&
    (yearInt >= 1000) && (yearInt <= 9999)); //return if date is valid
  } //end dateOK()

  private boolean monthOK( String month){ //start boolean function monthOK()
    return (month.equals("January") || month.equals("February") ||
    month.equals("March") || month.equals("April") ||
    month.equals("May") || month.equals("June") ||
    month.equals("July") || month.equals("August") ||
    month.equals("September") || month.equals("October") ||
    month.equals("November") || month.equals("December") ); //return if date is valid
  } //end monthOK()

  public void readInput(){ //start function readInput()
    boolean tryAgain = true; //create boolean tryAgain
    Scanner keyboard = new Scanner(System.in); //create Scanner object
    while (tryAgain){ //if tryAgain is true
      System.out.println("Enter month, day, and year."); //display instructions
      System.out.println("Do not use a comma.");
      String monthInput = keyboard.next(); //get month
      int dayInput = keyboard.nextInt(); //get day
      int yearInput = keyboard.nextInt(); //get year
      if (dateOK(monthInput, dayInput, yearInput) ){ //if dateOK
        setDate(monthInput, dayInput, yearInput); //set date to input
        tryAgain = false; //set tryAgian to false
      } //end if
      else
      System.out.println("Illegal date. Reenter input."); //tell user to try again
    } //end else if
  } //end readInput()
  
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
} //end class
