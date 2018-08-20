
public class CruiserMotorcycle implements Motorcycle{
	private String _name;
	private double _price;
	
	public CruiserMotorcycle(String name, double price) {
		this._name = name;
		this._price = price;
	}
	@Override
	public String GetModel() {
		// TODO Auto-generated method stub
		return "Cruiser";
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
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Model: " + GetName() + " Type: " + GetModel() + " price: " + GetPrice() + " Race-Bike: " + isRaceBike();
	}

}
