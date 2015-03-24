/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: OverloadingDemo.java
 * Desc: show how to overload functions
 */
package lab8;

public class OverloadingDemo{ //start class
	public static void main(String[] args){ //start main function
		DateSixthTry date1 = new DateSixthTry(), //create 3 DateSixthTry objects
				date2 = new DateSixthTry(),
				date3 = new DateSixthTry();
		date1.setDate(1, 2, 2008); //set date1
		date2.setDate("February", 2, 2008); //set date2
		date3.setDate(2008); //set date3
		date1.writeOutput(); //write output of date1
		date2.writeOutput(); //write output of date2
		date3.writeOutput(); //write output of date3
	} //end main
} //end class