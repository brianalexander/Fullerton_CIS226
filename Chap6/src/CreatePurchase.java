// CreatePurchase.java
// Written by Brian Alexander
// Written on 10/22/2018

import javax.swing.JOptionPane;

public class CreatePurchase {
	
	public static void main(String[] args) {
		
		Purchase myPurch = new Purchase();
		
		myPurch.setInvoiceNumber(getInvoiceNum());
		myPurch.setAmountOfSale(getSalePrice());
		
		myPurch.dispPurchaseDetails();
	}
	
	public static int getInvoiceNum() {
		int invoiceNumber;
		
		do {
			invoiceNumber = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Enter invoice number", 
					"Input", 
					JOptionPane.OK_CANCEL_OPTION)
					);
		} while((invoiceNumber < 1000) || (invoiceNumber > 8000));
		
		return invoiceNumber;
	}
	
	public static double getSalePrice() {
		double salePrice;
		
		do {
			salePrice = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Enter sale price ", 
					"Input", 
					JOptionPane.OK_CANCEL_OPTION)
					);
		} while((salePrice < 0));
		
		return salePrice;
	}

}
