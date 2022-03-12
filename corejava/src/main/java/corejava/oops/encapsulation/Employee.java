package corejava.oops.encapsulation;

public class Employee extends person {
	
    public String employeeId;
	
	public double salary;
	private String employee_idcard;
	
	
	public String getEmployeeId() {
		return employeeId;
	}



	public double getSalary() {
		return salary;
	}


	public  String getEmployee_idcard() {
		return employee_idcard;
	}


	public Employee(String employeeId, double salary, String employee_idcard) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.employee_idcard = employee_idcard;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", employee_idcard=" + employee_idcard
				+ "]";
	}


	public Employee()
	
	{
		
		
	}
	
	

}
