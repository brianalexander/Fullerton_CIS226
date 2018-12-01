// CountIntegers.java
// Brian Alexander
// 11/2/2018

import java.util.Scanner;

public class CountIntegers {
	
	private static Scanner inputDialog = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] intsArray = new int[100];
		int[] countArray = new int[51];
		int input;
		
//		Collect counts

		System.out.println("Enter integers in the range 0-50.\n" + 
				"Signal end of list with a number outside the range.");
		
		for (int i = 0; i < intsArray.length; i++) {
			input = inputDialog.nextInt();
			
			if (input > 50 || input < 0) {
				break;
			} else {
				intsArray[i] = input;
				countArray[input]++;
			}
		}
		
//		Display counts
		System.out.println("Number\tTimes");
		
		for(int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 0) {
				System.out.println(i + "\t" + countArray[i]);
			}
		}
	}
}
