package com.hexaware.busticketbooking.service;

import java.util.List;

import com.hexaware.busticketbooking.entity.Bookings;




public interface IBookings {
	
	public int createBookings(Bookings bookings);
	public int updateBookings(Bookings bookings);
	public int  deleteBookings(int Booking_ID);
	public Bookings getBookingsById(int Booking_ID);
	public List<Bookings>getAllBookings();

}
