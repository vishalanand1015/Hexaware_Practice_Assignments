package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ITripsDAO;
import entities.Trips;

@Service
public class TripsService implements ITrips {
	@Autowired
	ITripsDAO dao;

	@Override
	public int createTrips(Trips trips) {
		// TODO Auto-generated method stub
		return dao.createTrips(trips);
	}

	@Override
	public int updateTrips(Trips trips) {
		// TODO Auto-generated method stub
		return dao.updateTrips(trips);
	}

	@Override
	public int deleteTrips(int Trip_ID) {
		// TODO Auto-generated method stub
		return dao.deleteTrips(Trip_ID);
	}

	@Override
	public Trips getTripsById(int Trip_ID) {
		// TODO Auto-generated method stub
		return dao.getTripsById(Trip_ID);
	}

	@Override
	public List<Trips> getAllTrips() {
		// TODO Auto-generated method stub
		return dao.getAllTrips();
	}

}
