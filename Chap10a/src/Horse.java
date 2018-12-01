// Horse.java
// Written by Brian Alexander
// Written on 10/11/2018


public class Horse {
	private String name;
	private String color;
	private int birthYear;
	
	public Horse() {
	}
	
	public Horse (String name, String color, int birthYear) {
		this.name = name;
		this.color = color;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void displayDescription() {
		System.out.println(this.name + " is " + this.color + " and was born in " + this.birthYear + ".");
	}
}
