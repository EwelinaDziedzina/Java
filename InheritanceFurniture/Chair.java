package InheritanceFurniture;

public class Chair extends Furniture {
	 
	private String type;
	private boolean ifGasLift;
	
	
	public Chair(){
	}
	
	public Chair(String type, boolean ifGasLift, String material, String colour) {
		super(material, colour);
		this.type = type;
		this.ifGasLift = ifGasLift;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIfGasLift() {
		return ifGasLift;
	}

	public void setIfGasLift(boolean ifGasLift) {
		this.ifGasLift = ifGasLift;
	}

	@Override
	public String toString() {
		return "\nChair type: " + type + "\nHas Gas Lift: " + (ifGasLift ? "Yes" : "No") +
				"\nMaterial: " + getMaterial()+ "\nColour: " + getColour();
	}
}