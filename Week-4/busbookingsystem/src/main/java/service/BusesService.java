package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IBusesDAO;
import entities.Buses;
@Service
public class BusesService implements IBuses {
	@Autowired
	IBusesDAO dao;

	@Override
	public int createBuses(Buses buses) {
		// TODO Auto-generated method stub
		return dao.createBuses(buses);
	}

	@Override
	public int updateBuses(Buses buses) {
		// TODO Auto-generated method stub
		return dao.updateBuses(buses);
	}

	@Override
	public int deleteBuses(int Bus_ID) {
		// TODO Auto-generated method stub
		return dao.deleteBuses(Bus_ID);
	}

	@Override
	public Buses getBusById(int Bus_ID) {
		// TODO Auto-generated method stub
		return dao.getBusById(Bus_ID);
	}

	@Override
	public List<Buses> getAllBuses() {
		// TODO Auto-generated method stub
		return dao.getAllBuses();
	}

}
