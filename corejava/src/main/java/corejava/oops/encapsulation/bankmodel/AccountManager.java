package corejava.oops.encapsulation.bankmodel;

public class AccountManager extends Member
{
	
	int Manager_id;
	String Manager_username;
	String Manager_password;
	
	public AccountManager(int Manager_id,String Manager_username,String Manager_password) {
		
		super();
		
		this.Manager_id=Manager_id;
		this.Manager_username=Manager_username;
		this.Manager_password=Manager_password;
		}
	public AccountManager() {
		
		
	}

	@Override
	public String toString() {
		return "AccountManager [Manager_id=" + Manager_id + ", Manager_username=" + Manager_username
				+ ", Manager_password=" + Manager_password + "]";
	}
	
	
	
	

}
