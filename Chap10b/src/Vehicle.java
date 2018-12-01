// Vehicle.java
// Brian Alexander
// 11/28/2018

public class Vehicle {
	private int mNumWheels;
	private int mAvgMPG;
	
	public Vehicle(int numWheels, int avgMPG) {
		mNumWheels = numWheels;
		mAvgMPG = avgMPG;
	}
	
	
	@Override
	public String toString() {
		return "Wheels: " + mNumWheels + " Mpg: " + mAvgMPG;
	}

}
