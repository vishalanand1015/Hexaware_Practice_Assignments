package com.hexaware.busticketbooking.service;

import java.util.List;

import com.hexaware.busticketbooking.entity.Buses;






public interface IBuses {

	public int createBuses(Buses buses);
	public int updateBuses(Buses buses);
	public int  deleteBuses(int Bus_ID);
	public Buses getBusById(int Bus_ID);
	
	public List<Buses>getAllBuses();
}
