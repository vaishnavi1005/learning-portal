package corejava.oops.encapsulation.shoppingportal;

public class Workplace {

	public static void main(String[] args) 
	{
		client c1=new client();
		Employee e1=new Employee();
		
		Employee e2=new Employee("ad1005",100000.345,"VA351988");

		System.out.println(c1.name);
		
		System.out.println(e2);
		System.out.println(e2.salary);
		
		Employee unknown=new Employee("ad1005",100000.345,"VA35198800");
		
		
	
	
	boolean SecurityCheck1=AuthorizeCheckEmployee(e2);
	
	boolean SecurityCheck2=AuthorizeCheckEmployee(unknown);

	
	}
	//	External security Agency
		
		
		public static  boolean AuthorizeCheckEmployee(Employee employee)
		{
			
			//hacker code [We should restrict not to overwrite our code by private and not giving set methods...]
			
			
//			if(employee.employee_idcard!="VA351988") 
//			
//			{
//				employee.employee_idcard="VA351988";
//			}
			
//			if (!(employee.getEmployee_idcard().equals("VA351988"))) {
//				
//				employee.setEmployee_idcard("VA351988");
//
//				
//			}
//			
			
			if(employee.getEmployee_idcard().equals("VA351988")) {
				
				System.out.println("Authorized please enter! :) ");
			}
			
			else
			{

				System.out.println("UnAuthorized please try again! :) ");

			}
			
			return false;
			
			
		}



		
		
		



	
}
