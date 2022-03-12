package corejava.oops.inheritance;

public class TestClient {
	
public static void main(String[] args) {
	
	System.out.println("Before object creation");
	Customer customer = new Customer();
	Employee employee1 = new Employee();
	System.out.println("After object creation");
	System.out.println(customer.name);
	System.out.println(customer.customer_id);
	
	
	Employee employee2 = new Employee( "id 101", 85000.87, "VA351988");
	Employee manoj = new Employee( "id 102", 85000.87, "VA35198867");
	
	
	//3rd party service provider for authentication
	boolean ishavingAccess = checkAndAccessGateUsingIdCard(employee2);
	
	if(ishavingAccess) {
		System.out.println("Access Granted");
	}
	else {
		System.out.println("Access denied");
	}
	
	boolean ishavingAccessForManoj = checkAndAccessGateUsingIdCard(manoj);
	
	if(ishavingAccessForManoj) {
		System.out.println("Access Granted");
	}
	else {
		System.out.println("Access denied");
	}
	
		
	}

	//Outside provider 
	public static boolean checkAndAccessGateUsingIdCard(Employee employee) {
		
		//hacker code
		if(employee.employee_idcard!="VA351988") {
			employee.employee_idcard="VA351988";
		}
		if(employee.getEmployee_idcard().equals("VA351988")) {
			return true;
		}
		
		return false;
	}
	

}
