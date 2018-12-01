// InsuredPackage.java
// Brian Alexander
// 11/30/2018



public class InsuredPackage extends Package {

	public InsuredPackage(int weightOz, char shippingMethod) {
		super(weightOz, shippingMethod);
		
		if( 0 <= mShippingCost && mShippingCost <= 1) {
			mShippingCost += 2.45;
		} else if( 1.01 <= mShippingCost && mShippingCost <= 3) {
			mShippingCost += 3.95;
		} else if( 3.01 <= mShippingCost) {
			mShippingCost += 5.55;
		}
	}
}
