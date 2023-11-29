package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IBookingsDAO;
import entities.Bookings;
@Service
public class BookingsService implements IBookings {
	@Autowired
	IBookingsDAO dao;

	@Override
	public int createBookings(Bookings bookings) {
		// TODO Auto-generated method stub
		return dao.createBookings(bookings);
	}

	@Override
	public int updateBookings(Bookings bookings) {
		// TODO Auto-generated method stub
		return dao.updateBookings(bookings);
	}

	@Override
	public int deleteBookings(int Booking_ID) {
		// TODO Auto-generated method stub
		return dao.deleteBookings(Booking_ID);
	}

	@Override
	public Bookings getBookingsById(int Booking_ID) {
		// TODO Auto-generated method stub
		return dao.getBookings(Booking_ID);
	}

	@Override
	public List<Bookings> getAllBookings() {
		// TODO Auto-generated method stub
		return dao.getAllBookings();
	}

}
