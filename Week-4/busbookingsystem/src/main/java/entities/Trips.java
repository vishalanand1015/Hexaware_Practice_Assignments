package entities;

public class Trips {
	private int Trip_ID;
	private int Bus_ID;
	private int Operator_ID;
	private String Source_City;
	private String Destination_City;
	private int DistanceInKms;
	private int DurationInHours;
	private int Departure_Time;
	private float Fare;
	

	public Trips() {
		
	}


	public Trips(int trip_ID, int bus_ID, int operator_ID, String source_City, String destination_City,
			int distanceInKms, int durationInHours, int departure_Time, float fare) {
		super();
		Trip_ID = trip_ID;
		Bus_ID = bus_ID;
		Operator_ID = operator_ID;
		Source_City = source_City;
		Destination_City = destination_City;
		DistanceInKms = distanceInKms;
		DurationInHours = durationInHours;
		Departure_Time = departure_Time;
		Fare = fare;
	}


	public int getTrip_ID() {
		return Trip_ID;
	}


	public void setTrip_ID(int trip_ID) {
		Trip_ID = trip_ID;
	}


	public int getBus_ID() {
		return Bus_ID;
	}


	public void setBus_ID(int bus_ID) {
		Bus_ID = bus_ID;
	}


	public int getOperator_ID() {
		return Operator_ID;
	}


	public void setOperator_ID(int operator_ID) {
		Operator_ID = operator_ID;
	}


	public String getSource_City() {
		return Source_City;
	}


	public void setSource_City(String source_City) {
		Source_City = source_City;
	}


	public String getDestination_City() {
		return Destination_City;
	}


	public void setDestination_City(String destination_City) {
		Destination_City = destination_City;
	}


	public int getDistanceInKms() {
		return DistanceInKms;
	}


	public void setDistanceInKms(int distanceInKms) {
		DistanceInKms = distanceInKms;
	}


	public int getDurationInHours() {
		return DurationInHours;
	}


	public void setDurationInHours(int durationInHours) {
		DurationInHours = durationInHours;
	}


	public int getDeparture_Time() {
		return Departure_Time;
	}


	public void setDeparture_Time(int departure_Time) {
		Departure_Time = departure_Time;
	}


	public float getFare() {
		return Fare;
	}


	public void setFare(float fare) {
		Fare = fare;
	}
	

}
