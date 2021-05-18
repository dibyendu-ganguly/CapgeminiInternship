/**
 * Write a program to validate username and password and email and mobileno and city and pincode?
 * a) username should be greater than 8 characters should contain atleast one spl character either _,-,.
 * b) validate email 
 * c) validate the password ,which should contain 8 characters with atleast one spl character
 * d) city should contain only alphabets
 * e) pincode should contain only 6 digits
 * f) mobile number should start with either 7,8,9 and length of 10 
 */
package com.capgemini.dailyassignments.day7;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
import java.util.regex.*;
public class FormValidation {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Username: ");
		String username = sc.nextLine();
		String regexUsername = "(?=.+[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\._-]).{7,}$";
																
		Pattern patternUsername = Pattern.compile(regexUsername);
		Matcher matcherUsername = patternUsername.matcher(username);
		boolean b=matcherUsername.matches();
		System.out.println(b);
		
		
//		System.out.print("Enter the Email: ");
//		String email = sc.nextLine();
//		System.out.print("Enter the Password: ");
//		String password = sc.nextLine();
//		System.out.print("Enter the City: ");
//		String city = sc.nextLine();
//		System.out.print("Enter the Pincode: ");
//		String pincode = sc.nextLine();
//		System.out.print("Enter the Mobile number: ");
//		String mobile = sc.nextLine();
		
		
		sc.close();
	}

}
