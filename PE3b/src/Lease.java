//Written by Brian Alexander
//File: Lease.java
//Written on 9/13/2018

public class Lease {
	private String tenantName;
	private int apartmentNumber;
	private double monthlyRentAmount;
	private int term;
	
	public Lease() {
		this.tenantName = "XXX";
		this.apartmentNumber = 0;
		this.monthlyRentAmount = 1000;
		this.term = 12;
	}
	
	public void addPetFee() {
		this.monthlyRentAmount = this.monthlyRentAmount + 10;
		explainPetPolicy();
	}
	
	private static void explainPetPolicy() {
		System.out.println("We've added $10 to your monthly rent because you have a pet! Enjoy!");
	}

	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	public double getMonthlyRentAmount() {
		return monthlyRentAmount;
	}
	public void setMonthlyRentAmount(double monthlyRentAmount) {
		this.monthlyRentAmount = monthlyRentAmount;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
}
