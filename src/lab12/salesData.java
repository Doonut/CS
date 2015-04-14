package lab12;

import java.util.Scanner;

public class salesData {
	public static void main(String[] args){
		int quarter = 0, quarterTotal = 0, quarterSegment = 0, locationBiggest = 0, amountBiggest = 0, total = 0;
		int[] data = new int[12];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 12; ++i){
			System.out.print("Please enter the data for month " + (i + 1) + ": ");
			data[i] = input.nextInt();
		}
		input.close();
		System.out.println();
		for (int i = 0; i < 12; ++i){
			++quarter;
			
			if (data[i] > amountBiggest){
				amountBiggest = data[i];
				locationBiggest = i;
			}
			total = total + data[i];
			quarterTotal = quarterTotal + data[i];
			if (quarter == 3){
				quarter = 0;
				++quarterSegment;
				switch(quarterSegment){
				case 1:
					System.out.println("The first quarter total is " + quarterTotal);
					break;
				case 2:
					System.out.println("The second quarter total is " + quarterTotal);
					break;
				case 3:
					System.out.println("The third quarter total is " + quarterTotal);
					break;
				case 4:
					System.out.println("The fourth quarter total is " + quarterTotal);
					break;
				}
				quarterTotal = 0;
			}
		}
		System.out.println("The Annual Sales Total is " + total);
		System.out.println("The highest volume month is month " + (locationBiggest + 1) + " with " + data[locationBiggest]);
	}
}
