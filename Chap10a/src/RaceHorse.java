// RaceHorse.java
// Written by Brian Alexander
// Written on 10/11/2018


public class RaceHorse extends Horse {
	private int numRaces;
	
	public RaceHorse() {
	}
	
	public RaceHorse(String name, String color, int birthYear, int numRaces) {
		super(name, color, birthYear);
		this.numRaces = numRaces;
	}

	public int getNumRaces() {
		return numRaces;
	}

	public void setNumRaces(int numRaces) {
		this.numRaces = numRaces;
	}
	
	public void displayNumRaces() {
		System.out.println(getName() + " has been in " + numRaces + " races.");
	}
}
