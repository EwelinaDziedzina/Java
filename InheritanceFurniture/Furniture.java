package InheritanceFurniture;

public class Furniture {

	private String colour;
	private String material;
	 

	Furniture(){
	}
	
	public Furniture(String material, String colour) {
		super();
		this.colour = colour;
		this.material = material;
	}
	
	public Furniture (String colour){
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "\nColour: " + colour + "\nMaterial: " + material;
	}	
}
