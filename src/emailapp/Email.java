package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	// Constructor to reveice first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call method to ask for the department
		this.department = setDepartment();
		
		// Combine elements to generate email
		if (department == "") {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
		}
		
		else {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		}
		// Call method to get random password
		this.password = randomPassword(defaultPasswordLength);
		
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
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail; 
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Establish Get Methods
	public int 	getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	//Display Information 
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
