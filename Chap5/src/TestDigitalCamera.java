// TestDigitalCamera.java
// Written by Brian Alexander
// Written on 10/18/2018

import java.util.Scanner;

public class TestDigitalCamera {
	
	private static Scanner inputDevice = new Scanner(System.in);
	
	public static void main(String[] args) {
		String brand;
		int megapixels;
		
		System.out.print("Enter camera brand ");
		brand = inputDevice.nextLine();
		System.out.print("Enter megapixels ");
		megapixels = inputDevice.nextInt();
		
		DigitalCamera camera = new DigitalCamera(brand, megapixels);
		camera.dispDetails();
		
		inputDevice.close();
	}
	
}
