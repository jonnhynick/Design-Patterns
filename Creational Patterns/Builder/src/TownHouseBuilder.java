
public class TownHouseBuilder implements HouseBuilder{

	private House house;
	
	public TownHouseBuilder() {
		this.house = new House();
	}
	public void buildBasement() {
		house.setBasement("No basement");		
	}

	public void buildStructure() {
		house.setStructure("Wood");
	}

	public House getHouse() {
		return this.house;
	}
	
	public String ToString() {
		return "TownHouse";
	}
}
