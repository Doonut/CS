package lab3;

import java.util.Scanner; //Import libraries
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo { //Start class
	public static void main(String[] args) //Start main method
	{
		Scanner fileIn = null; //Create fileIn scanner as null
		try //try to run code
		{
			fileIn = new Scanner(new FileInputStream("C:/Users/4804W22/Desktop/player.txt")); //Set fileIn scanner to read input stream from player.txt
		}
		catch (FileNotFoundException e) //If file not found run this code
		{
			System.out.println("File not found."); //Print file not found
			System.exit(0); //exit program
		}
		
		int highscore; //uninitialized integer
		String name; //uninitialized String
		
		System.out.println("Text left to read? " + fileIn.hasNextLine()); //
		highscore = fileIn.nextInt();
		fileIn.nextLine();
		name = fileIn.nextLine();
		
		System.out.println("Name: " + name);
		System.out.println("High score: " + highscore);
		System.out.println("Text left to read? " + fileIn.hasNextLine());
		fileIn.close();
	}
}
