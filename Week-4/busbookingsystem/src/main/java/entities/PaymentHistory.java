package entities;

public class PaymentHistory {
	private int Payment_Id;
	private int Booking_ID;
	private float Amount_Paid;
	private String Payment_Date;
	private int User_ID;

	public PaymentHistory() {
		// TODO Auto-generated constructor stub
	}

	public PaymentHistory(int payment_Id, int booking_ID, float amount_Paid, String payment_Date, int user_ID) {
		super();
		Payment_Id = payment_Id;
		Booking_ID = booking_ID;
		Amount_Paid = amount_Paid;
		Payment_Date = payment_Date;
		User_ID = user_ID;
	}

	public int getPayment_Id() {
		return Payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		Payment_Id = payment_Id;
	}

	public int getBooking_ID() {
		return Booking_ID;
	}

	public void setBooking_ID(int booking_ID) {
		Booking_ID = booking_ID;
	}

	public float getAmount_Paid() {
		return Amount_Paid;
	}

	public void setAmount_Paid(float amount_Paid) {
		Amount_Paid = amount_Paid;
	}

	public String getPayment_Date() {
		return Payment_Date;
	}

	public void setPayment_Date(String payment_Date) {
		Payment_Date = payment_Date;
	}

	public int getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	

}
