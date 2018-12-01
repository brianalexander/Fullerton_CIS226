// DemoHorses.java
// Written by Brian Alexander
// Written on 10/11/2018


public class DemoHorses {

	public static void main(String[] args) {
		Horse oldPaint = new Horse("Old Paint", "brown", 2009);
		RaceHorse champion = new RaceHorse("Champion", "black", 2011, 4);
		
		oldPaint.displayDescription();
		champion.displayDescription();
		champion.displayNumRaces();
	}

}
