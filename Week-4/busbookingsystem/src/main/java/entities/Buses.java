package entities;

public class Buses {
	private int Bus_ID;
	private int Operator_ID;
	private String Bus_Number;
	private int Capacity;
	private int User_ID;
	

	public Buses() {
		// TODO Auto-generated constructor stub
	}


	public Buses(int bus_ID, int operator_ID, String bus_Number, int capacity, int user_ID) {
		super();
		Bus_ID = bus_ID;
		Operator_ID = operator_ID;
		Bus_Number = bus_Number;
		Capacity = capacity;
		User_ID = user_ID;
	}


	public int getBus_ID() {
		return Bus_ID;
	}


	public void setBus_ID(int bus_ID) {
		Bus_ID = bus_ID;
	}


	public int getOperator_ID() {
		return Operator_ID;
	}


	public void setOperator_ID(int operator_ID) {
		Operator_ID = operator_ID;
	}


	public String getBus_Number() {
		return Bus_Number;
	}


	public void setBus_Number(String bus_Number) {
		Bus_Number = bus_Number;
	}


	public int getCapacity() {
		return Capacity;
	}


	public void setCapacity(int capacity) {
		Capacity = capacity;
	}


	public int getUser_ID() {
		return User_ID;
	}


	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	

}
