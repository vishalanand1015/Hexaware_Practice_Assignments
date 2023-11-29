package com.hexaware.hibernateapp.service;

import java.util.List;


import com.hexaware.hibernateapp.entity.BusBookings;


public interface IBusBookingsService {
	public int createBookings(BusBookings bookings);
	public int updateBookings(BusBookings bookings);
	public int  deleteBookings(int Booking_ID);
	public BusBookings getBookingsById(int Booking_ID);
	public List<BusBookings>getAllBookings();

}
