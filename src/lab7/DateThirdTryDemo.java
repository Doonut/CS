package lab7;

/***********************
* Name: Kyle Casey
* Date: 3/9/15
* Program: DateThirdTryDemo.java
* Desc: create DateThirdTry object and set the day, month, and year
* then process the output and display it.
*/

public class DateThirdTryDemo{ //start class
	public static void main(String[]args){ //start main function
		DateThirdTry date = new DateThirdTry(); //create DasteThirdTry object
		int year = 1882; //set year
		date.setDate(6, 17, year); //pass month day and year to function
		date.writeOutput(); //print the output
	} //end main
} //end class