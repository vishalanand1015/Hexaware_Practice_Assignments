package com.hexaware.casestudycurdoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.casestudycurdoperation.entity.Bookings;
import com.hexaware.casestudycurdoperation.repository.BookingsRepository;
@Service
public class BookingsServiceImp implements IBookingsService {
	
	@Autowired
	BookingsRepository repo;
	

	@Override
	public Bookings insertBookings(Bookings bookings) {
		// TODO Auto-generated method stub
		return repo.save(bookings);
	}

	@Override
	public Bookings updateBookings(Bookings bookings) {
		// TODO Auto-generated method stub
		return repo.save(bookings);
	}

	

	@Override
	public List<Bookings> getAllBookings() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteBookingsById(Long Booking_ID) {
		// TODO Auto-generated method stub
		repo.deleteById(Booking_ID);
	}

	@Override
	public Bookings getBookingsById(Long Booking_ID) {
		// TODO Auto-generated method stub
		return repo.findById(Booking_ID).orElse(null);
	}

	@Override
	public Bookings findByTrip(int trip) {
		// TODO Auto-generated method stub
		return repo.findByTrip(trip);
	}

	@Override
	public List<Bookings> getBookingsSeatSorted(int Seat_Number) {
		// TODO Auto-generated method stub
		return repo.getBookingsSeatSorted(Seat_Number);
	}

}
