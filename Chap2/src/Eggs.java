//Filename:Eggs.java
//Written by Brian Alexander
//Written on 9/5/2018

import java.util.Scanner;
import java.text.NumberFormat;

public class Eggs {
	public static void main(String[] args) {
		
		final double PRICE_DOZEN_EGGS = 3.25;
		final double PRICE_ONE_EGG = 0.45;
		int numEggs;
		int numDozens;
		int numSingles;
		
		Scanner inputDevice = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.print("Enter eggs needed >> ");
		numEggs = inputDevice.nextInt(); inputDevice.nextLine();
		
		numDozens = numEggs / 12;
		numSingles = numEggs % 12;

		
		
//		You ordered 27 eggs. That’s 2 dozen at $3.25 per 
//		dozen and 3 loose eggs at 45 cents each
//		for a total of $7.85.
		
		System.out.print(" You ordered " + numEggs + " eggs.  That's " + numDozens + " dozen at " + fmt.format(PRICE_DOZEN_EGGS) + 
				" per dozen and " + numSingles + " loose eggs at " + (int) (100*PRICE_ONE_EGG) + " cents each for a total of " +
				fmt.format(numDozens*PRICE_DOZEN_EGGS + numSingles*PRICE_ONE_EGG) + ".");
	}
}
