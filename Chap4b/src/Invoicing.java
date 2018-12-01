// Invoicing.java
// Written by Brian Alexander
// Written on 10/4/2018

import java.text.NumberFormat;

public class Invoicing {
	
	private static NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public static void computeInvoice(double price) {
		System.out.println("Total: " + fmt.format( price * 1.08));
	}
	public static void computeInvoice(double price, int quantity) {
		System.out.println("Total: " + fmt.format( price * 1.08 * quantity));
	}
	public static void computeInvoice(double price, int quantity, double couponValue) {
		System.out.println("Total: " + fmt.format( (price * quantity - couponValue) * 1.08));
	}

}
