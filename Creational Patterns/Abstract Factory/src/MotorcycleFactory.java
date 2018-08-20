
public class MotorcycleFactory extends VehicleFactory{
	
	enum MotorcycleType {CRUISER, SPORTBIKE}
	
	@Override
	Car getCar(CarFactory.CarType type, double price, String name) {
		throw new IllegalAccessError();
	}

	@Override
	Motorcycle getMotorcycle(MotorcycleType type, double price, String name) {
		// TODO Auto-generated method stub
		switch(type) {
		
		case CRUISER:
			return new CruiserMotorcycle(name, price);

		case SPORTBIKE:
			return new SportBikeMotorcycle(name, price);

		default:
			throw new IllegalStateException();	
		
		}
	}

}
