package com.hexaware.hibernateapp.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexaware.hibernateapp.HibernateUtil;
import com.hexaware.hibernateapp.dao.IBusBookingsDAO;
import com.hexaware.hibernateapp.entity.BusBookings;


@Service
public class BusBookingsService implements IBusBookingsService {
	@Autowired
	IBusBookingsDAO dao;
	
	

	

	@Override
	public int createBookings(BusBookings bookings) {
		
		
		return dao.createBookings(bookings);
	}
	@Override
	public int updateBookings(BusBookings bookings) {
		
		
		
		
		return dao.updateBookings(bookings);
	}

	@Override
	public int deleteBookings(int Booking_ID) {
		
	
		return dao.deleteBookings(Booking_ID);
	}

	@Override
	public BusBookings getBookingsById(int Booking_ID) {
		
		
		
		return dao.getBookingsById(Booking_ID);
	}

	@Override
	public List<BusBookings> getAllBookings() {
		
		
		
	
		
		return dao.getAllBookings();
	}

	

	

}
