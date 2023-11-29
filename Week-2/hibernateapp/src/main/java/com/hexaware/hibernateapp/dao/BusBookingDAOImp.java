package com.hexaware.hibernateapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernateapp.HibernateUtil;
import com.hexaware.hibernateapp.entity.BusBookings;

public class BusBookingDAOImp implements IBusBookingsDAO {
	
	
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();

	@Override
	public int createBookings(BusBookings bookings) {
		
		session.save(bookings);
		tr.commit();
		sessionFactory.close();
	   return createBookings(bookings);
	}

	@Override
	public int updateBookings(BusBookings bookings) {
		
		
		session.saveOrUpdate(bookings);
		tr.commit();
		sessionFactory.close();
		return updateBookings(bookings);
	}

	@Override
	public int deleteBookings(int Booking_ID) {
		

		BusBookings bookingrecord = session.get(BusBookings.class, Booking_ID);
		
		session.delete(bookingrecord);
		tr.commit();
		sessionFactory.close();
		return deleteBookings(Booking_ID);
	}

	@Override
	public BusBookings getBookingsById(int Booking_ID) {
		
		BusBookings bookingrecord = session.get(BusBookings.class, Booking_ID);
		tr.commit();
		sessionFactory.close();

		return getBookingsById(Booking_ID);
	}

	@Override
	public List<BusBookings> getAllBookings() {
		
		
		javax.persistence.Query query1 = session.createNamedQuery("getBusBookingRecord");

		List<BusBookings> list1 = query1.getResultList();


		for (BusBookings busbookings : list1) {

			System.out.println(busbookings);
		}
		tr.commit();
		sessionFactory.close();
		
		return getAllBookings();
	}

}
