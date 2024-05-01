package Builder_RG;

import Interface.Builder;
import cars.CarType;
import cars.Manual;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class CarManualBuilder implements Builder{

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripcomputer;
	private GPSNavigator gpsnavigator;
	
	@Override
	public void setCarType(CarType type) {
		this.type = type;
		
	}
	@Override
	public void setSeats(int seats) {
		this.seats = seats;
		
	}
	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}
	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripcomputer = tripComputer;
		
	}
	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsnavigator = gpsNavigator;
	}
	
	
	public Manual getResult() {
		return new Manual(type,seats,engine,transmission, tripcomputer,gpsnavigator);	}
	
	
	
	
}
