// TestInvoicing.java
// Written by Brian Alexander
// Written on 10/4/2018

public class TestInvoice {

	public static void main(String[] args) {
		//	    Price $24.95
		//	    Price $17.50, quantity 4
		//	    Price $10.00, quantity 6, coupon $20.00
		Invoicing.computeInvoice(24.95);
		Invoicing.computeInvoice(17.50, 4);
		Invoicing.computeInvoice(10.00, 6, 20.00);
	}

}
