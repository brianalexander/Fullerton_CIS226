// DigitalCamera.java
// Written by Brian Alexander
// Written on 10/18/2018

import java.text.NumberFormat;

public class DigitalCamera {
	
	private String brand;
	private int megapixels;
	private double price;
	
	private static NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public DigitalCamera (String brand, int megapixels) {
		this.brand = brand;
		
		if (megapixels > 10) {
			this.megapixels = 10;
		} else {
			this.megapixels = megapixels;
		}
		
		if (megapixels <= 6) {
			this.price = 99.0;
		} else {
			this.price = 129.0;
		}		
	}
	
	public void dispDetails() {
		// Camera brand: Leica resolution: 10 megapixels   Sale price $129.00
		System.out.println("Camera brand: " + this.brand + " resolution: " + this.megapixels + " megapixels  Sale price " + fmt.format(this.price));
	}

}
