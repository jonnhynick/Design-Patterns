
public class SedanCar implements Car{
	
	private double _price = 0;
	private String _name = "";
	
	public SedanCar(double price, String name) {
		this._price = price;
		this._name = name;
	}

	public String GetModel() { return "SEDAN"; }

	public double GetPrice() { return _price; }

	public boolean is4x4() { return false; }

	public String GetName() { return _name; }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
