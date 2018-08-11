
public class SuvCar implements Car{
	
	private double _price = 0;
	private String _name = "";
	
	public SuvCar(double price, String name) {
		this._price = price;
		this._name = name;
	}

	public String GetModel() { return "SUV"; }

	public double GetPrice() { return _price; }

	public boolean is4x4() { return true; }

	public String GetName() { return _name; }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
