//Percentages.java
//Written by Brian Alexander
//Written on 09/13/2018


//Create a Project named Chap3a.
//Output:
//2.0 is 40.0% of 5.0
//5.0 is 250.0% of 2.0

//Create an application named Percentages whose main() method holds two
//double variables. Assign values to the variables. Pass both variables to a method
//named computePercent() that displays the two values and the value of the first
//number as a percentage of the second one. For example, if the numbers are 2.0
//and 5.0, the method should display a statement similar to “2.0 is 40 percent of 5.0.”
//Then call the method a second time, passing the values in reverse order. Save the
//application as Percentages.java.


public class Percentages {

	public static void main(String[] args) {
		double twoPointZero = 2.0;
		double fivePointZero = 5.0;
		
		computePercent(twoPointZero, fivePointZero);
		computePercent(fivePointZero, twoPointZero);
	}

	public static void computePercent(double doubleOne, double doubleTwo) {
		System.out.println(doubleOne + " is " + doubleOne / doubleTwo * 100 + "% of " + doubleTwo);
	}

}
