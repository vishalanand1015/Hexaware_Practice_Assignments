package com.hexaware.casestudycurdoperation.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.casestudycurdoperation.entity.Bookings;


@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long> {
	
	
	public Bookings findByTrip(int trip);
	//public Bookings insertBookings(Bookings bookings);
	
	@Query("select b from Bookings b where b.Seat_Number>?1 order by b.Booking_Status")
	public List<Bookings> getBookingsSeatSorted(int Seat_Number);
	
	
	
}
