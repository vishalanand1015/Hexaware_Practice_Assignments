package dao;

import java.util.List;

import entities.Trips;

public interface ITripsDAO {
	public int createTrips(Trips trips);
	public int updateTrips(Trips trips);
	public int  deleteTrips(int Trip_ID);
	public Trips getTripsById(int Trip_ID);
	public List<Trips>getAllTrips();
	

}
