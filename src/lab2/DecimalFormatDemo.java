package lab2;
import java.text.DecimalFormat;
public class DecimalFormatDemo {
	public static void main(String[] args)
	{
		DecimalFormat pattern00dot000 = new DecimalFormat("00.000"); //Make object for decimal 00.000
		DecimalFormat pattern0dot00 = new DecimalFormat("0.00"); //Make object for decimal 0.00
		
		double d = 12.3456789; //Random double
		System.out.println("Pattern 0.00");
		System.out.println(pattern00dot000.format(d)); //format double with 00.000 pattern
		System.out.println("Pattern 0.00");
		System.out.println(pattern0dot00.format(d)); //format double with 0.00 pattern
		
		double money = 19.8; // double with one decimal
		System.out.println("Pattern 0.00");
		System.out.println("$" + pattern0dot00.format(money)); //format with 0.00 pattern with $ sign
		
		DecimalFormat percent = new DecimalFormat("0.00%"); //Make object for decimal 0.00%
		
		System.out.println("Pattern 0.00%");
		System.out.println(percent.format(0.308)); //format with decimal as percent EX: 30.80%
		
		DecimalFormat eNotation1 = new DecimalFormat("#0.###E0"); //Make object for notation format with one whole number
		DecimalFormat eNotation2 = new DecimalFormat("00.###E0"); //Make object for notation format with two whole numbers
		
		System.out.println("Pattern #0.###E0");
		System.out.println(eNotation1.format(123.456)); //format sci notation with one whole number
		System.out.println("Pattern 00.###E0");
		System.out.println(eNotation2.format(123.456)); //format sci notation with two whole numbers

		double smallNumber = 0.0000123456;
		System.out.println("Pattern #0.###E0");
		System.out.println(eNotation1.format(smallNumber)); //format small number with sci notation
		System.out.println("Pattern 00.###E0");
		System.out.println(eNotation2.format(smallNumber)); //same output as above

	}
}
