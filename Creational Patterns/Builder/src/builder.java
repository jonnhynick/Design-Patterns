
public class builder {

	public static void main(String[] args) {
		
		HouseBuilder tipiBuilder = new TipiHouseBuilder();
		TownHouseBuilder townBuilder = new TownHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(tipiBuilder);
		
		//Tipi House object
		engineer.constructHouse();		
		House house = engineer.getHouse();
		//TownHouse Object
		engineer = new CivilEngineer(townBuilder);		
		house = engineer.getHouse();
		
	}
}
