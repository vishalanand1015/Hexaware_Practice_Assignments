package com.hexaware.busticketbooking.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.hexaware.busticketbooking.entity.Bookings;


@Service
public class BookingsService implements IBookings {

	@Override
	public int createBookings(Bookings bookings) {
		
		
		return 1;
	}

	@Override
	public int updateBookings(Bookings bookings) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteBookings(int Booking_ID) {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public Bookings getBookingsById(int Booking_ID) {
		
		Bookings book=new Bookings(101, 10, 1001, "12:56", 1, "Not Booked");
		
		
	return book;
	}
	@Override
	public List<Bookings> getAllBookings() {
		List<Bookings>  getbookings=new ArrayList<>();
		
		getbookings.add(new Bookings(101, 10, 1001, "12:56", 1, "Not Booked"));
		getbookings.add(new Bookings(102, 11, 1002, "10:56", 2, "Booked"));
		
		return getbookings;
	}

}
