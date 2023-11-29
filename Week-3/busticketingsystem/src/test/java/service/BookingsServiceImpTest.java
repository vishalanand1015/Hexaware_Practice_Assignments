package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Bookings;

class BookingsServiceImpTest {
	BookingsServiceImp bse= new BookingsServiceImp();

	@Test
	void testCreateBookings() {
		
		Bookings b= new Bookings();
		int actual= bse.createBookings(b);
		assertEquals(1, actual);
		
	}

	@Test
	void testGetAllBookings() {
		fail("Not yet implemented");
	}

}
