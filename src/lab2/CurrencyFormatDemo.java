package lab2;
import java.text.NumberFormat; // Add libraries that we will be using
import java.util.Locale;

public class CurrencyFormatDemo { //Start Class
	public static void main(String[] args) //Start main Function
	{
		System.out.println("Without formatting:"); //Start that we are about to print without formatting
		//Print sample numbers
		System.out.println(19.8); 
		System.out.println(19.81111);
		System.out.println(19.89999);
		System.out.println(19);
		System.out.println(); //Line break
		
		System.out.println("Default location:"); //Use the default location of the computer
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(); //Create Object that has currencyFormatter
		//Print out sample numbers with default location formatting
		System.out.println(moneyFormatter.format(19.8));
		System.out.println(moneyFormatter.format(19.81111));
		System.out.println(moneyFormatter.format(19.89999));
		System.out.println(moneyFormatter.format(19));
		System.out.println(); //Line break
		
		System.out.println("US as location:"); //Use the US as the location
		NumberFormat moneyFormatter2 = NumberFormat.getCurrencyInstance(Locale.US); //Create Object that has currencyFormatter
		//Print out sample numbers with the US as the location for formatting
		System.out.println(moneyFormatter2.format(19.8));
		System.out.println(moneyFormatter2.format(19.81111));
		System.out.println(moneyFormatter2.format(19.89999));
		System.out.println(moneyFormatter2.format(19));
	}//end main function
}//end class
