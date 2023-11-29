package com.hexaware.casestudycurdoperation.service;

import java.util.List;

import com.hexaware.casestudycurdoperation.entity.Bookings;


public interface IBookingsService {
	public Bookings insertBookings(Bookings bookings);
	public Bookings updateBookings(Bookings bookings);
	public void deleteBookingsById(Long Booking_ID );
	public Bookings getBookingsById(Long Booking_ID);
	public List<Bookings>getAllBookings();
	public Bookings findByTrip(int trip);
	public List<Bookings> getBookingsSeatSorted(int Seat_Number);
	
	
	

}
