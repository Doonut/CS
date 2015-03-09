package lab6;

/***********************
* Name: Kyle Casey
* Date: 2/27/15
* Program: CoinFlipDemo.java
* Desc: program to demonstrate Random object.
*/

import java.util.Random; //import Random object

public class CoinFlipDemo{ //start class
	public static void main(String[] args){ //start main function
		Random randomGenerator = new Random(); //create Random object
		int counter = 1; //create counter int
		while (counter <= 5){ //while counter is less than or equal to 5
			System.out.print("Flip number " + counter + ": "); //print out iretation to user
			int coinFlip = randomGenerator.nextInt(2); //get random number between 2 numbers
			if (coinFlip == 1) //if random number is equal to one
				System.out.println("Heads"); //print heads
			else
				System.out.println("Tails"); //print tails
			counter++; //increment counter
		} //end while loop
	} //end main
} //end class