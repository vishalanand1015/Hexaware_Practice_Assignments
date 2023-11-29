package com.hexaware.casestudycurdoperation.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Bookings_Details")
public class Bookings implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Booking_ID;
	private int User_ID;
	private int trip;
	private String Booking_Time;
	private int Seat_Number;
	private String Booking_Status;
	public Bookings() {
		super();
	}
	public Bookings(Long booking_ID, int user_ID, int tripid, String booking_Time, int seat_Number,
			String booking_Status) {
		super();
		this.Booking_ID = booking_ID;
		this.User_ID = user_ID;
		this.trip = tripid;
		this.Booking_Time = booking_Time;
		this.Seat_Number = seat_Number;
		this.Booking_Status = booking_Status;
	}
	public Long getBooking_ID() {
		return Booking_ID;
	}
	public void setBooking_ID(Long booking_ID) {
		this.Booking_ID = booking_ID;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		this.User_ID = user_ID;
	}
	public int getTrip_ID() {
		return trip;
	}
	public void setTrip_ID(int tripid) {
		this.trip= tripid;
	}
	public String getBooking_Time() {
		return Booking_Time;
	}
	public void setBooking_Time(String booking_Time) {
		this.Booking_Time =booking_Time;
	}
	public int getSeat_Number() {
		return Seat_Number;
	}
	public void setSeat_Number(int seat_Number) {
		this.Seat_Number = seat_Number;
	}
	public String getBooking_Status() {
		return Booking_Status;
	}
	public void setBooking_Status(String booking_Status) {
		this.Booking_Status = booking_Status;
	}
	@Override
	public String toString() {
		return "Bookings [Booking_ID=" + Booking_ID + ", User_ID=" + User_ID + ", trip=" + trip
				+ ", Booking_Time=" + Booking_Time + ", Seat_Number=" + Seat_Number + ", Booking_Status="
				+ Booking_Status + "]";
	}
	
	

}
