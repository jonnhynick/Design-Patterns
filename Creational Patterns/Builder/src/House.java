
public class House implements HousePlan{

	private String basement;
	private String structure;
	private String roof;
	private String type;
	
	public void setBasement(String basement) {
		this.basement = basement;
		this.type = type;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}
	
	public String ToString() {
		return type;
	}
}
