// Package.java
// Brian Alexander
// 11/30/2018



import java.text.NumberFormat;

public class Package {
	protected int mWeightOz;
	protected char mShippingMethod;
	protected double mShippingCost;
	
	protected static NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	
	
	public Package(int weightOz, char shippingMethod) {
		mWeightOz = weightOz;
		mShippingMethod = shippingMethod;
		mShippingCost = calculateShippingCost();
	} // end constructor
	
	
	
	private double calculateShippingCost() {
		if ( 0 < mWeightOz && mWeightOz < 9) {
			switch(mShippingMethod) {
			case 'A':
				return 2.00;
			case 'T':
				return 1.50;
			case 'M':
				return 0.50;
			default:
				return 0.0;
			}
		} else if ( 8 < mWeightOz && mWeightOz < 17) {
			switch(mShippingMethod) {
			case 'A':
				return 3.00;
			case 'T':
				return 2.35;
			case 'M':
				return 1.50;
			default:
				return 0.0;
			}
		} else {
			switch(mShippingMethod) {
			case 'A':
				return 4.50;
			case 'T':
				return 3.25;
			case 'M':
				return 2.15;
			default:
				return 0.0;
			}
		}
	} // end calculateShippingCost
	
	
	
	public void display() {
		System.out.println("The package weighs " + mWeightOz + 
				" ounces.  Ship method " + mShippingMethod + 
				". Cost " + fmt.format(mShippingCost));
	} //  end display

}
