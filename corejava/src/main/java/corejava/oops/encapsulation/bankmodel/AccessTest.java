package corejava.oops.encapsulation.bankmodel;

public class AccessTest {

	public static void main(String[] args) {

		AccountManager AM1 = new AccountManager();

		Customer c1 = new Customer("CU101", 10123456789L, "CU1005", "Siri@143");

		Customer c2 = new Customer("CU101", 10123456789L, "CU1004", "Siri@1243");

		System.out.println(c1);

		boolean check1 = CheckPerson(c1);

		boolean check2 = CheckPerson(c2);

	}

	// hacker code
	public static boolean CheckPerson(Customer custom) {
//		if((custom.Username != "CU1005") || (custom.password != "Siri@143") )
//		{
//			
//			custom.Username= "CU1005";
//			custom.password = "Siri@143";
//			
//		}
//		
		if ((custom.getUsername().equals("CU1005")) & (custom.getPassword().equals("Siri@143"))) {

			System.out.println("Hi Customer! Welcome back : } ");
		} else {

			System.out.println("Username & password do not match :[ ");
		}

		return false;

	}

}
