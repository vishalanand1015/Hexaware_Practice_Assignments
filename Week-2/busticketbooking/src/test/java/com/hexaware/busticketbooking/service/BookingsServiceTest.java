package com.hexaware.busticketbooking.service;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.hexaware.busticketbooking.entity.Bookings;
class BookingsServiceTest {
	BookingsService b=new BookingsService();
	@Test
	void testCreateBookings() {	
		Bookings book=new Bookings();
		int actual=b.createBookings(book);
		assertEquals(1, actual);
	}
	@Test
	void testupdateBookings(){
		Bookings book=new Bookings();
		int actual=b.updateBookings(book);
		assertEquals(1, actual);	
	}
	@Test
	void testdeleteBookings(){
		Bookings book=new Bookings();
		int actual= b.deleteBookings(101);
		assertEquals(101, actual);	
	}
	@Test
	void testgetBookingsById(){	
		Bookings book=new Bookings(101, 10, 1001, "12:56", 1, "Not Booked");	
		Bookings actual=b.getBookingsById(101);	
		assertEquals(book, actual);	
	}
	@Test
	void testGetAllBookings() {	
		List<Bookings>actual=b.getAllBookings();
		List<Bookings>  expected=new ArrayList<>();	
		expected.add(new Bookings(101, 10, 1001, "12:56", 1, "Not Booked"));
		expected.add(new Bookings(102, 11, 1002, "10:56", 2, "Booked"));
		assertEquals(expected,actual);
			}
}
