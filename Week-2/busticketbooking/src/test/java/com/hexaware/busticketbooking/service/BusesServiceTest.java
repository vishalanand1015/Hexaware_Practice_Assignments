package com.hexaware.busticketbooking.service;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.hexaware.busticketbooking.entity.Buses;
class BusesServiceTest {
	BusesService bs=new BusesService();
	@Test
	void testCreateBuses() {
		Buses b=new Buses();
		int actual=bs.createBuses(b);
		assertEquals(1, actual);	
		}
	@Test
	void testUpdateBuses() {
		Buses b=new Buses();
		int actual=bs.updateBuses(b);
		assertEquals(1, actual);
	}
	@Test
	void testDeleteBuses() {
		Buses b=new Buses();
		int actual=bs.deleteBuses(101);
		assertEquals(101, actual);
	}
	@Test
	void testGetBusById() {
		Buses bus=new Buses(101, 10,"JH05", 40, 1);
		Buses actual=bs.getBusById(101);
		assertEquals(bus, actual);
	}
	@Test
	void testGetAllBuses() {
		List<Buses> actual=bs.getAllBuses();
		List<Buses>  getallbuses=new ArrayList<>();
		 getallbuses.add(new Buses(101, 10,"JH05", 40, 1));
		 getallbuses.add(new Buses(102, 11,"JH04", 450, 2));
		 assertEquals(getallbuses,actual);
	}
}