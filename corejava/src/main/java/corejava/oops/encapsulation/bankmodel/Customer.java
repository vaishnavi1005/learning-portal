package corejava.oops.encapsulation.bankmodel;

public class Customer extends Member

{
	String Customer_id;
	long Account_no;
	private String Username;
	private String password;

	public Customer(String Customer_id, long Account_no, String Username, String password) {

		super();
		this.Customer_id = Customer_id;
		this.Account_no = Account_no;
		this.Username = Username;
		this.password = password;

	}

	public String getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}

	public long getAccount_no() {
		return Account_no;
	}

	public void setAccount_no(long account_no) {
		Account_no = account_no;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", Account_no=" + Account_no + ", Username=" + Username
				+ ", password=" + password + "]";
	}

}
