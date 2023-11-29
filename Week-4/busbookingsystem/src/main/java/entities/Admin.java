package entities;

public class Admin {
	private int Admin_ID;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Password;
	private double Phone_Number;

	public Admin() {
		
	}

	public Admin(int admin_ID, String first_Name, String last_Name, String email, String password,
			double phone_Number) {
		super();
		Admin_ID = admin_ID;
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
		Password = password;
		Phone_Number = phone_Number;
	}

	public int getAdmin_ID() {
		return Admin_ID;
	}

	public void setAdmin_ID(int admin_ID) {
		Admin_ID = admin_ID;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public double getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(double phone_Number) {
		Phone_Number = phone_Number;
	}

	@Override
	public String toString() {
		return "Admin [Admin_ID=" + Admin_ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email="
				+ Email + ", Password=" + Password + ", Phone_Number=" + Phone_Number + "]";
	}
	

	
}