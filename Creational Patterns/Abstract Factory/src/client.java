//client
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory factoryCar = FactoryProducer.getFactory(FactoryProducer.Factories.CAR);
		SuvCar jeep = (SuvCar) factoryCar.getCar(CarFactory.CarType.SUV, 39000, "Wrangler");
		SedanCar honda = (SedanCar) factoryCar.getCar(CarFactory.CarType.SEDAN, 24000, "Accord");
		System.out.println(jeep.toString());
		System.out.println(honda.toString());
		VehicleFactory factoryMotorcycle = FactoryProducer.getFactory(FactoryProducer.Factories.MOTORCYCLE);
		CruiserMotorcycle harley = (CruiserMotorcycle) factoryMotorcycle.getMotorcycle(MotorcycleFactory.MotorcycleType.CRUISER, 24000, "RoadKing");
		SportBikeMotorcycle yamaha = (SportBikeMotorcycle) factoryMotorcycle.getMotorcycle(MotorcycleFactory.MotorcycleType.SPORTBIKE, 18000, "R1-M");
		System.out.println(harley.toString());
		System.out.println(yamaha.toString());
	}
}
