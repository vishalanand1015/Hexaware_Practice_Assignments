package com.hexaware.busticketbooking.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.busticketbooking.entity.BusOperators;

class BusOperatorsServiceTest {
	BusOperatorsService bs=new BusOperatorsService();
	@Test
	void testCreateBusOperators() {
		BusOperators b=new BusOperators();
		int actual=bs.createBusOperators(b);
		assertEquals(1, actual);
		}
	@Test
	void testUpdateBusOperators() {
		BusOperators b=new BusOperators();
		int actual=bs.updateBusOperators(b);
		assertEquals(1, actual);
	}
	@Test
	void testDeleteBusOperators() {
		BusOperators b=new BusOperators();
		int actual=bs.deleteBusOperators(101);
		assertEquals(101, actual);
	}
	@Test
	void testGetBusOperatorsById() {
		BusOperators b=new BusOperators(101,"Hacker",45654,5,1);
		BusOperators actual=bs.getBusOperatorsById(101);
		assertEquals(b, actual);	
	}
	@Test
	void testGetAllBusOperators() {
		List<BusOperators> actual=bs.getAllBusOperators();
		List<BusOperators>  getallbusop=new ArrayList<>();	
		getallbusop.add(new BusOperators(101,"Hacker",45654,5,1));
		getallbusop.add(new BusOperators(102,"king",45678,1,2));
	}

}
