package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		
//		em1.setAlternateEmail("jsmith@gmail.com");
//		System.out.println("Alternate Email: " + em1.getAlternateEmail());
//		
//		em1.changePassword("jSmith321");
//		System.out.println("New Password: " + em1.getPassword());
		
		System.out.println(em1.showInfo());

	}

}
