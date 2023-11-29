package entities;

public class UserCustomers {
	private int User_ID;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Password;
	private double Phone_Number;
	private String Adress;
	private String City;
	private String State;
	private double ZipCode;


	public UserCustomers() {
		
	}


	public UserCustomers(int user_ID, String first_Name, String last_Name, String email, String password,
			double phone_Number, String adress, String city, String state, double zipCode) {
		super();
		User_ID = user_ID;
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
		Password = password;
		Phone_Number = phone_Number;
		Adress = adress;
		City = city;
		State = state;
		ZipCode = zipCode;
	}


	public int getUser_ID() {
		return User_ID;
	}


	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
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


	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public double getZipCode() {
		return ZipCode;
	}


	public void setZipCode(double zipCode) {
		ZipCode = zipCode;
	}
	
	

}
