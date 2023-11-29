package com.hexaware.casestudycurdoperation.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.casestudycurdoperation.entity.Bookings;
import com.hexaware.casestudycurdoperation.exception.BookingNotFoundException;
import com.hexaware.casestudycurdoperation.service.IBookingsService;


@RestController
@RequestMapping("/api/bookings")
public class BookingsRestController {
	@Autowired
	IBookingsService service;
	
	@PostMapping("/createbooking")
	public Bookings createbookings(@RequestBody Bookings bookings) {
		return service.insertBookings(bookings);
	}
	
	@PutMapping("/updatebooking")
	public Bookings updatebookings(@RequestBody Bookings bookings) {
		return service.updateBookings(bookings);
	}
	@DeleteMapping("/deletebooking")
	public String deleteById(@PathVariable Long Bookings_ID)
	{
		service.deleteBookingsById(Bookings_ID);
		return "records deleted";
	}
	@GetMapping(value="/getbooking/{Bookings_ID}")
	public Bookings getById(@PathVariable Long Bookings_ID)throws BookingNotFoundException{
		
		
		if(Bookings_ID==0) {
			throw new BookingNotFoundException(HttpStatus.BAD_REQUEST,"product not found"+Bookings_ID);
		}
		return service.getBookingsById(Bookings_ID);	
		
	}
	@GetMapping(value="/getallbookings",produces="application/json")
	public List<Bookings> getAll(){
		
		return service.getAllBookings();	
		
	}
	@GetMapping(value="/get/{trip}")
	public Bookings getByTrip_Id(@PathVariable int trip){
		
		return service.findByTrip(trip);	
		
	}
	@GetMapping("/getsorted/{Seat_Number}")
	public List<Bookings> getBySeat_Number(@PathVariable int Seat_Number){
		return service.getBookingsSeatSorted(Seat_Number);
		
	}
	
	
	@ResponseBody
	@ExceptionHandler({BookingNotFoundException.class})
		public ResponseEntity<String> handlerBookingNotFound(	BookingNotFoundException e)
		{
		
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	

}
