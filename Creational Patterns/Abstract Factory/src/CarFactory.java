
//Abstract Product A
public class CarFactory extends VehicleFactory{
	
	enum CarType{SUV, SEDAN}
	
	@Override
	Car getCar(CarType type, double price, String name) {
		
		switch(type) {
		
		case SEDAN:
			return new SedanCar(price, name);
			
		case SUV:
			return new SuvCar(price, name);
			
		default:
			throw new IllegalStateException();
		}
		
	}

	@Override
	Motorcycle getMotorcycle(MotorcycleFactory.MotorcycleType type, double price, String name) {
		throw new IllegalAccessError();
	}

}
