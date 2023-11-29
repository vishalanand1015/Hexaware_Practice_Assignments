package service;

import java.util.List;

import entity.Bookings;

public interface IBookings {
	
	public int createBookings(Bookings bookings);
	public List<Bookings>getAllBookings();

}
