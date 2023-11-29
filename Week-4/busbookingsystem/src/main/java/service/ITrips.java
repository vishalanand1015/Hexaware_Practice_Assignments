package service;

import java.util.List;

import entities.Trips;

public interface ITrips {
	public int createTrips(Trips trips);
	public int updateTrips(Trips trips);
	public int  deleteTrips(int Trip_ID);
	public Trips getTripsById(int Trip_ID);
	public List<Trips>getAllTrips();
	

}
