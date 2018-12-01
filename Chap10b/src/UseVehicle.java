// UseVehicle.java
// Brian Alexander
// 11/28/2018

public class UseVehicle {

	public static void main(String[] args) {
		Motorcycle motorcycle = new Motorcycle(60);
		Car car = new Car(30);
		
		System.out.println("Car: " + car.toString());
		System.out.println("Motorcycle: " + motorcycle.toString());
	}

}
