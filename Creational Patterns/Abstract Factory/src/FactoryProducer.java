
public class FactoryProducer {
	enum Factories { CAR, MOTORCYCLE}	
	//ensures class is non-instantiable
	private FactoryProducer() {}
	
	public static VehicleFactory getFactory(Factories key) {
		switch (key) {
		case CAR:
			return new CarFactory();
			
		case MOTORCYCLE:
			return new MotorcycleFactory();
			
		default:
			throw new IllegalStateException();
		}
	}
}
