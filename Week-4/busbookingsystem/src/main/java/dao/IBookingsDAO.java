package dao;

import java.util.List;

import entities.Bookings;

public interface IBookingsDAO {
	public int createBookings(Bookings bookings);
	public int updateBookings(Bookings bookings);
	public int  deleteBookings(int Booking_ID);
	public Bookings getBookings(int Booking_ID);
	public List<Bookings>getAllBookings();

}
