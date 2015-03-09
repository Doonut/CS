package lab6;

/***********************
* Name: Kyle Casey
* Date: 2/27/15
* Program: WhileDemo.java
* Desc: program to demonstrate while loops.
*/

public class WhileDemo{ //start class
	public static void main(String[] args){ //start main function
		int countDown; //create countDown integer
		System.out.println("First while loop:"); //tell user first while loop
		countDown = 3; //set countDown to 3
		while (countDown > 0){ //while countDown is greater than 0
			System.out.println("Hello"); //print Hello
			countDown = countDown - 1; //take one from countdown
		}
		System.out.println("Second while loop:"); //tell user second while loop
		countDown = 0; //set countDown to 0
		while (countDown > 0){ //while countDown is greater than 0
			System.out.println("Hello"); //print Hello
			countDown = countDown - 1; //take one from countDown
		}
		System.out.println("First do-while loop:"); //tell user first do-while loop
		countDown = 3; //set countDown to 3
		do{ //start while loop
			System.out.println("Hello"); //print Hello
			countDown = countDown - 1; //take one from countDown
		} while (countDown > 0); //while countDown is greater than 0
		System.out.println("Second do-while loop:"); //tell user second do-while loop
		countDown = 0; //set countDown to 0
		do{ //start while loop
			System.out.println("Hello"); //print Hello
			countDown = countDown - 1; //take one from countDown
		} while (countDown > 0); //while countDown is greater than 0
	} //end main
} //end class