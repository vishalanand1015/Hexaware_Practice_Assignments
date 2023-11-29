package com.hexaware.hibernateapp.dao;

import java.util.List;

import com.hexaware.hibernateapp.entity.BusBookings;



public interface IBusBookingsDAO {
	
	public int createBookings(BusBookings bookings);
	public int updateBookings(BusBookings bookings);
	public int  deleteBookings(int Booking_ID);
	public BusBookings getBookingsById(int Booking_ID);
	public List<BusBookings>getAllBookings();

}
