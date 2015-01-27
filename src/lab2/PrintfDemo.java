package lab2;

public class PrintfDemo {//Start class
	public static void main(String[] args)//Start main function
	{
		String aString = "abc"; //assign random chars to a string
		
		System.out.println("String output:");
		System.out.println("START1234567890");
		System.out.printf("START%sEND %n", aString); //Print and format with default lettering
		System.out.printf("START%4sEND %n", aString); //Print and format with 4 spaces in the variable
		System.out.printf("START%2sEND %n", aString); //Print and format with 2 spaces but take an extra because the variable is 3 spaces
		System.out.println(); //Line break
		
		char oneCharacter = 'Z'; //assign random char
		
		System.out.println("Character output:");
		System.out.println("START1234567890");
		System.out.printf("START%cEND %n", oneCharacter); //Print and format with default lettering
		System.out.printf("START%4cEND %n", oneCharacter); //Print and format with 4 spaces in variable
		System.out.println(); //Line break
		
		double d = 12345.123456789; //assign random float
		
		System.out.println("Floating-point output:");
		System.out.println("START1234567890");
		System.out.printf("START%fEND %n", d); //Print and format with default lettering
		System.out.printf("START%.4fEND %n", d); //Print with 4 decimal places
		System.out.printf("START%.2fEND %n", d); //Print with 2 decimal places
		System.out.printf("START%12.4fEND %n", d); //Print with 12 total spaces and 4 decimal places
		System.out.printf("START%eEND %n", d); //Print with exponent notation
		System.out.printf("START%12.5eEND %n", d); //Print with 12 total spaces including exponent notation and with 5 decimal places
	} //end main function
} //end class
