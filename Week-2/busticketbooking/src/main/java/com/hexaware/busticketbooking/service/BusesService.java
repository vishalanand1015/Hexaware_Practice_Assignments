package com.hexaware.busticketbooking.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.busticketbooking.entity.Bookings;
import com.hexaware.busticketbooking.entity.Buses;


@Service
public class BusesService implements IBuses {
	

	@Override
	public int createBuses(Buses buses) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateBuses(Buses buses) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteBuses(int Bus_ID) {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public Buses getBusById(int Bus_ID) {
		Buses bus=new Buses(101, 10,"JH05", 40, 1);
		return bus;
	}


	@Override
	public List<Buses> getAllBuses() {
		List<Buses>  getallbuses=new ArrayList<>();
		
		 getallbuses.add(new Buses(101, 10,"JH05", 40, 1));
		 getallbuses.add(new Buses(102, 11,"JH04", 450, 2));
		
		return  getallbuses;
	}
	

}
