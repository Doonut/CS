import java.util.Scanner;
public class Project3Part1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String selectionInput;
	char selection;
	int num1, num2;
	System.out.println("     Calculator Program     ");
	System.out.println("----------------------------");
	System.out.println("          A: Add            ");
	System.out.println("          B: Subtract       ");
	System.out.println("          C: Multiply       ");
	System.out.println("          D: Divide         ");
	System.out.println("----------------------------");
	System.out.print("Please make a selection: ");
	selectionInput = input.next();
	System.out.print("Please enter the first number: ");
	num1 = input.nextInt();
	System.out.print("Please enter the second number: ");
	num2 = input.nextInt();
	selectionInput = selectionInput.toUpperCase();
	selection = selectionInput.charAt(0);
	if (selection == 'A'){
		int answer = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + answer);
	}
	else if (selection == 'B'){
		int answer = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + answer);
	}
	else if (selection == 'C'){
		double answer = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + answer);
	}
	else if(selection == 'D'){
		double answer = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + answer);
	}
}
}