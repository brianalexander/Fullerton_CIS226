// Student.java
// Written by Brian Alexander
// Written on 9/25/2018

import java.text.DecimalFormat;

public class Student {
	
	private String studentId;
	private int testScore1;
	private int testScore2;
	private int testScore3;
	DecimalFormat df = new DecimalFormat("#.##");
	
	
	public Student(String studentId) {
		this.studentId = studentId;
	}

	public Student(String studentId, int testScore1, int testScore2, int testScore3) {
		this.studentId = studentId;
		this.testScore1 = testScore1;
		this.testScore2 = testScore2;
		this.testScore3 = testScore3;
	}
	
	public double average() {
		return ( (testScore1 + testScore2 + testScore3) / 3.0 );
	}

	public void setTestScore(int testScore1, int testScore2, int testScore3) {
		this.testScore1 = testScore1;
		this.testScore2 = testScore2;
		this.testScore3 = testScore3;
	}
	
	public void DisplayInfo() {
		System.out.println("Student ID: " + this.studentId + "\nTest 1 score: " + this.testScore1 +
				"\nTest 2 score: " + this.testScore2 + "\nTest score 3: " + this.testScore3 +
				"\nAverage test score: " + df.format(this.average()));
	}
	


}
