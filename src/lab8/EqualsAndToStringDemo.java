/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: EqualsAndToStringDemo.java
 * Desc: create DateFourthTry objects and manipulate the class to see if dates equal or precede each other
 */
package lab8;

public class EqualsAndToStringDemo{ //start class
	public static void main(String[] args){ //start main function
		DateFourthTry date1 = new DateFourthTry(), date2 = new DateFourthTry(); //create 2 DateFourthTry objects
		
		date1.setDate(6, 17, 1882); //set date1 date
		date2.setDate(6, 17, 1882); //set date2 date
		
		if (date1.equals(date2)) //if date one is equal to date2
			System.out.println(date1 + " equals " + date2); //print date1 equals date2
		else
			System.out.println(date1 + " does not equal " + date2); //print date1 does not equal date2
		
		date1.setDate(7, 28, 1750); //set date1 date to different date
		
		if (date1.precedes(date2)) //if date1 comes before date2
			System.out.println(date1 + " comes before " + date2); //print date1 comes before date2
		else
			System.out.println(date2 + " comes before or is equal to " + date1); //print date2 comes before or is equal to date1
	} //end main function
} //end class