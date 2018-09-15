
public class TipiHouseBuilder implements HouseBuilder{

	private House house;
	
	public TipiHouseBuilder() {
		house = new House();
	}
	public void buildBasement() {
		house.setBasement("Wooden Poles");		
	}

	public void buildStructure() {
		house.setStructure("Wood");
	}

	public House getHouse() {
		return this.house;
	}

	public String ToString() {
		return "TipiHouse";
	}
}
