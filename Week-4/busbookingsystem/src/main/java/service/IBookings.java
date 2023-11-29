package service;

import java.util.List;

import entities.Bookings;

public interface IBookings {
	public int createBookings(Bookings bookings);
	public int updateBookings(Bookings bookings);
	public int  deleteBookings(int Booking_ID);
	public Bookings getBookingsById(int Booking_ID);
	public List<Bookings>getAllBookings();
	

}
