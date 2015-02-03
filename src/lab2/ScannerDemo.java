package lab2;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //Make System.in Scanner object
		
		System.out.println("Enter the number of pods followed by");
		System.out.println("the number of peas in a pod.");
		int numberOfPods = keyboard.nextInt(); //Get first entered integer
		int peasPerPod = keyboard.nextInt(); //Get second entered integer
		
		int totalNumberOfPeas = numberOfPods*peasPerPod; //calculate total number of peas
		
		System.out.print(numberOfPods + " pods and "); //print number of pods
		System.out.println(peasPerPod + " peas per pod."); //print number of peas per pod
		System.out.println("The total number of peas = " + totalNumberOfPeas); //print total number of peas
	}

}
