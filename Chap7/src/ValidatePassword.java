// ValidatePassword.java
// Written by Brian Alexander
// Written on 10/26/2018

import java.util.Scanner;

public class ValidatePassword {
	
	private static Scanner inputDialog = new Scanner(System.in);
	
	public static void main(String[] args) {
		String password;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		
//		Get user password
		System.out.print("The password did not have the following:\n" + 
				"at least 6 characters\n" + 
				"at least 1 uppercase letter" +
				"1 digit        >> ");
		password = inputDialog.nextLine();
		
//		Test user input
		for (int i = 0; i < password.length(); i++) {
			
			if ( Character.isUpperCase( password.charAt(i) ) ) {
				hasUpper = true;
				continue;
			}
			
			if ( Character.isLowerCase( password.charAt(i) ) ) {
				hasLower = true;
				continue;
			}
			
			if ( Character.isDigit( password.charAt(i) ) ) {
				hasDigit = true;
				continue;
			}
		}
		
//		Display errors, if existing
		if( !(password.length() == 6 && hasUpper && hasLower && hasDigit) ) {
			System.out.println("The password did not have the following:");
			if (password.length() <= 6) {
				System.out.println("at least 6 characters");	
			}
			
			if (!hasUpper) {
				System.out.println("at least 1 uppercase letter");
			}
			
			if (!hasLower) {
				System.out.println("at least 1 lowercase letter");
			}
			
			if (!hasDigit) {
				System.out.println("at least 1 digit");
			}
		} else {
			System.out.println("Valid password");
		}
		
		
		
	}
	
}
