
public class SportBikeMotorcycle implements Motorcycle{
	private double _price;
	private String _name;

	public SportBikeMotorcycle(String name, double price) {
		this._price = price;
		this._name = name;
	}
	@Override
	public String GetModel() {
		// TODO Auto-generated method stub
		return "Sport-Bike";
	}

	@Override
	public double GetPrice() {
		// TODO Auto-generated method stub
		return _price;
	}

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public boolean isRaceBike() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Model: " + GetName() + " Type: " + GetModel() + " price: " + GetPrice() + " Race-Bike: " + isRaceBike();
	}

}
