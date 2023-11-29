package com.hexaware.mapcspractice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserCustomer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
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
	@OneToOne(mappedBy = "bookings")
	private Bookings bookings;
	
	public UserCustomer() {
		super();
	}

	public UserCustomer(int user_ID, String first_Name, String last_Name, String email, String password,
			double phone_Number, String adress, String city, String state, double zipCode, Bookings bookings) {
		super();
		this.User_ID = user_ID;
		this.First_Name = first_Name;
		this.Last_Name = last_Name;
		this.Email = email;
		this.Password = password;
		this.Phone_Number = phone_Number;
		this.Adress = adress;
		this.City = city;
		this.State = state;
		this.ZipCode = zipCode;
		this.bookings = bookings;
	}

	public UserCustomer(int user_ID, String first_Name, String last_Name, String email, String password,
			double phone_Number, String adress, String city, String state, double zipCode) {
		super();
		this.User_ID = user_ID;
		this.First_Name = first_Name;
		this.Last_Name = last_Name;
		this.Email = email;
		this.Password = password;
		this.Phone_Number = phone_Number;
		this.Adress = adress;
		this.City = city;
		this.State = state;
		this.ZipCode = zipCode;
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

	public Bookings getBookings() {
		return bookings;
	}

	public void setBookings(Bookings bookings) {
		this.bookings = bookings;
	}
	
	
	
	

	

}
