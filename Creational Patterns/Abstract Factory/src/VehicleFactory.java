
//abstract Factory
abstract class VehicleFactory {
	
	abstract Car getCar(CarFactory.CarType type, double price, String name);	
	abstract Motorcycle getMotorcycle(MotorcycleFactory.MotorcycleType type, double price, String name);
	
}
