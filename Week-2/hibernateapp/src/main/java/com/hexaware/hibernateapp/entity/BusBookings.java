package com.hexaware.hibernateapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.NamedQueries;

@Entity
@Table(name="BusBookings")
@NamedQueries({
	@NamedQuery(name="getBusBookingRecord",query="select e from BusBookings e ")})
public class BusBookings {
	
	@Id
	private int Booking_ID;
	private int User_ID;
	private int Trip_ID;
	private String Booking_Time;
	private int Seat_Number;
	private String Booking_Status;
	public BusBookings() {
		super();
	}
	public BusBookings(int booking_ID, int user_ID, int trip_ID, String booking_Time, int seat_Number,
			String booking_Status) {
		super();
		this.Booking_ID = booking_ID;
		this.User_ID = user_ID;
		this.Trip_ID = trip_ID;
		this.Booking_Time = booking_Time;
		this.Seat_Number = seat_Number;
		this.Booking_Status = booking_Status;
	}
	public int getBooking_ID() {
		return Booking_ID;
	}
	public void setBooking_ID(int booking_ID) {
		Booking_ID = booking_ID;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public int getTrip_ID() {
		return Trip_ID;
	}
	public void setTrip_ID(int trip_ID) {
		Trip_ID = trip_ID;
	}
	public String getBooking_Time() {
		return Booking_Time;
	}
	public void setBooking_Time(String booking_Time) {
		Booking_Time = booking_Time;
	}
	public int getSeat_Number() {
		return Seat_Number;
	}
	public void setSeat_Number(int seat_Number) {
		Seat_Number = seat_Number;
	}
	public String getBooking_Status() {
		return Booking_Status;
	}
	public void setBooking_Status(String booking_Status) {
		Booking_Status = booking_Status;
	}
	@Override
	public String toString() {
		return "BusBookings [Booking_ID=" + Booking_ID + ", User_ID=" + User_ID + ", Trip_ID=" + Trip_ID
				+ ", Booking_Time=" + Booking_Time + ", Seat_Number=" + Seat_Number + ", Booking_Status="
				+ Booking_Status + "]";
	}
	
	

}
