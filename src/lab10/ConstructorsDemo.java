package lab10;

/* Name: Kyle Casey
 * Date: 3/28/15
 * Program: ConstructorsDemo.java
 * Desc: Create constructor and methods to grab values from private variables.
 */

public class ConstructorsDemo { //start class
	public static void main(String[] args) { //start main function
		Date date1 = new Date("December", 16, 1770), //create date1 object
		date2 = new Date(1, 27, 1756), //create date2 object
		date3 = new Date(1882), //create date3 object
		date4 = new Date(); //create date4 object
		System.out.println("Whose birthday is " + date1 + "?"); //print date1 date 
		System.out.println("Whose birthday is " + date2 + "?"); //print date2 date
		System.out.println("Whose birthday is " + date3 + "?"); //print date3 date
		System.out.println("The default date is " + date4 + "."); //print date4 date
	} //end main
} //end class