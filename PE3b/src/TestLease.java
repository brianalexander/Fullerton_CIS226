//Written by Brian Alexander
//File: TestLease.java
//Written on 9/13/2018

import java.text.NumberFormat;
import java.util.Scanner;

public class TestLease {
	
	private static Scanner inputDevice = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Lease leaseOne;
		Lease leaseTwo;
		Lease leaseThree;
				
		leaseOne = getData();
		leaseTwo = getData();
		leaseThree = getData();
		Lease leaseFour = new Lease();
		
		System.out.print("\n"); // Spacing
		showData(leaseOne);
		leaseOne.addPetFee();
		
		System.out.print("\n"); // Spacing
		System.out.print("\n"); // Spacing
		
		showData(leaseOne);
		showData(leaseTwo);
		showData(leaseThree);
		showData(leaseFour);
		
		inputDevice.close();
	}
	
	private static void showData(Lease currentLease) {
		NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
		
		System.out.println("Your lease result:");
		System.out.println("Name: " + currentLease.getTenantName());
		System.out.println("Apartment: " + currentLease.getApartmentNumber());
		System.out.println("Rent: " + fmt.format(currentLease.getMonthlyRentAmount()));
		System.out.println("Term: " + currentLease.getTerm());
		System.out.print("\n\n"); // Spacing
	}

	private static Lease getData() {
		Lease currentLease = new Lease();
		
		
		
		System.out.print("Enter the lessee name >> ");
		currentLease.setTenantName(inputDevice.nextLine());
		
		System.out.print("Enter apartment number >> ");
		currentLease.setApartmentNumber(inputDevice.nextInt());
		inputDevice.nextLine();
		
		System.out.print("Enter rent >> ");
		currentLease.setMonthlyRentAmount(inputDevice.nextDouble());
		inputDevice.nextLine();
		
		System.out.print("Enter lease term in months >> ");
		currentLease.setTerm(inputDevice.nextInt());
		inputDevice.nextLine();
		
		System.out.print("\n"); // Spacing
		
		return currentLease;
	}
}
