package com.hexaware.busticketbooking.entity;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Bookings {
	
	
	private int Booking_ID;
	private int User_ID;
	private int Trip_ID;
	private String Booking_Time;
	private int Seat_Number;
	private String Booking_Status;
	
	public Bookings() {
		super();
	}

	public Bookings(int booking_ID, int user_ID, int trip_ID, String booking_Time, int seat_Number,
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
		return "Bookings [Booking_ID=" + Booking_ID + ", User_ID=" + User_ID + ", Trip_ID=" + Trip_ID
				+ ", Booking_Time=" + Booking_Time + ", Seat_Number=" + Seat_Number + ", Booking_Status="
				+ Booking_Status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Booking_ID, Booking_Status, Booking_Time, Seat_Number, Trip_ID, User_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookings other = (Bookings) obj;
		return Booking_ID == other.Booking_ID && Objects.equals(Booking_Status, other.Booking_Status)
				&& Objects.equals(Booking_Time, other.Booking_Time) && Seat_Number == other.Seat_Number
				&& Trip_ID == other.Trip_ID && User_ID == other.User_ID;
	}
	
	
	
	
	

}
