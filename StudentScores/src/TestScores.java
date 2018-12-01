// TestScores.java
// Written by Brian Alexander
// Written on 9/25/2018

public class TestScores {

	public static void main(String[] args) {
		Student studentOne = new Student("FC123", 100, 80, 94);
		Student studentTwo = new Student("FC456");
		
		studentTwo.setTestScore(78, 92, 80);
		
		studentOne.DisplayInfo();
		System.out.println();
		studentTwo.DisplayInfo();
				

	}

}
