package com.hexaware.busticketbooking.entity;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class BusOperators {
	private int Operator_ID;
	private String Operator_Name;
	private double ContactPhone;
	private float Rating;
	private int User_ID;

	public BusOperators() {
		// TODO Auto-generated constructor stub
	}

	public BusOperators(int operator_ID, String operator_Name, double contactPhone, float rating, int user_ID) {
		super();
		Operator_ID = operator_ID;
		Operator_Name = operator_Name;
		ContactPhone = contactPhone;
		Rating = rating;
		User_ID = user_ID;
	}

	public int getOperator_ID() {
		return Operator_ID;
	}

	public void setOperator_ID(int operator_ID) {
		Operator_ID = operator_ID;
	}

	public String getOperator_Name() {
		return Operator_Name;
	}

	public void setOperator_Name(String operator_Name) {
		Operator_Name = operator_Name;
	}

	public double getContactPhone() {
		return ContactPhone;
	}

	public void setContactPhone(double contactPhone) {
		ContactPhone = contactPhone;
	}

	public float getRating() {
		return Rating;
	}

	public void setRating(float rating) {
		Rating = rating;
	}

	public int getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ContactPhone, Operator_ID, Operator_Name, Rating, User_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusOperators other = (BusOperators) obj;
		return Double.doubleToLongBits(ContactPhone) == Double.doubleToLongBits(other.ContactPhone)
				&& Operator_ID == other.Operator_ID && Objects.equals(Operator_Name, other.Operator_Name)
				&& Float.floatToIntBits(Rating) == Float.floatToIntBits(other.Rating) && User_ID == other.User_ID;
	}
	

}
