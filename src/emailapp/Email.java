package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor to reveice first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call method to ask for the department
		this.department = setDepartment();
		System.out.println("Department Selection: " + this.department);
	}
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales \n2 for Development\n3 for Accounting\n0 for None\n Enter Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) {
			return "sales";
		}
		else if (depChoice == 2) {
			return "dev";
		}
		else if (depChoice == 3) {
			return "accounting";
		}
		else {
			return "";
		}
	}
	
	// Generate a random password
	
	// Set the mailbox capacity
	
	// Set the alternate email
	
	// Change the password

}