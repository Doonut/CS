/*	Take modulus of years double to it and convert to days.
 * 
 *  */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class RuleOf72 {
	public static void main(String[] args)
	{
		double interestRate = 0.0;
		int money = 0;
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.print("What is your interest rate?: ");
		interestRate = input.nextDouble();
		System.out.print("How much money are you investing?: ");
		money = input.nextInt();
		input.close();
		double years = 72/interestRate;
		double tripYears = 114/interestRate;
		System.out.println("It would take " + df.format(years) + " Years to make " + moneyFormatter.format(money));
		System.out.print("It would take " + df.format(tripYears) + " Years to make " + moneyFormatter.format(money * 2));
	}
}