package corejava.oops.inheritance;

//- name
//- age
//- street address
//- apat no
//- city
//- state- country
//- zipode
//- Salary
//- employee id
public class Employee extends User  {
	
	public String employeeId;
	
	public double salary;
	private String employee_idcard;
	
	
	
	//parameterized constructor
	public Employee(String employeeId, double salary, String employee_idcard) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.employee_idcard = employee_idcard;
	}
	
	public Employee() {
		
	}

	public String getEmployee_idcard() {
		return employee_idcard;
	}
	
	
	

}
