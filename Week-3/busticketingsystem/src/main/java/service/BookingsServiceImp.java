package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Bookings;
@Service
public class BookingsServiceImp implements IBookings {

	@Override
	public int createBookings(Bookings bookings) {
		
		
		return 1;
	}

	@Override
	public List<Bookings> getAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

}
