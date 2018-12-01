// Purchase.java
// Written by Brian Alexander
// Written on 10/22/2018

import java.text.NumberFormat;

public class Purchase {
	private int invoiceNumber;
	private double amountOfSale;
	private double amountOfSalesTax;
	private static NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	public void setAmountOfSale(double amountOfSale) {
		this.amountOfSale = amountOfSale;
		this.amountOfSalesTax = amountOfSale * 0.05;
	}
	
	public void dispPurchaseDetails() {
		System.out.print("Invoice #" + this.invoiceNumber + " Amount of sale: " + 
					fmt.format(this.amountOfSale) + " Tax: " + fmt.format(this.amountOfSalesTax));
	}
	
	

}
