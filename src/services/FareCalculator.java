package services;

// Type your code
import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;


public class FareCalculator extends Booking{
	
	public double book(Hotel hotel) {
		int hotelRate = hotel.getRates();
		int hotelPersons = hotel.getNoOfPersons();
		double HotelBook = booking(hotelRate, hotelPersons);
		

		
		int Checkin = hotel.getFromdate().getDayOfMonth();
		int Checkout = hotel.getTodate().getDayOfMonth();
		if((Checkin < Checkout) );
		return HotelBook;
	}
	
	
	
	
	public double book(Flight flight) {
		int flightRate = flight.getRates();
		int flightPersons = flight.getNoOfPersons();
		double FlightBook = booking(flightRate,flightPersons);
		
		String trip = flight.getTriptype();
		if(trip == "one-way");
		if(trip == "round-trip");
		return FlightBook;
		
	}
	public double book(Train train) {
		int trainRate = train.getRates();
		int trainPersons = train.getNoOfPersons();
		double trainBook = booking(trainRate, trainPersons);
		return trainBook;
	}
	
	public double book(Bus bus) {
		int busRate = bus.getRates();
		int busPersons = bus.getNoOfPersons();
		double busBook = booking(busRate, busPersons);
		return busBook;
	}
	
}