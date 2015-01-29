import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args)
	{
		int num1 = 0;
		double num2 = 0;
		String str = " ",str1 = " ";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		System.out.print("Enter a decimal number: ");
		num2 = input.nextDouble();
		System.out.print("Enter your name: ");
		str1 = input.next(); 
		str = input.nextLine();
		input.close();
		System.out.println("The number is " + num1 + " and the floating point is " + num2 + " and your name is " + str1 + " " + str + ".");
	}
}
