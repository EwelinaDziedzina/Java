package InheritanceFurniture;

public class Table extends Furniture {

	private boolean isExpandable;
	private String shape;
	
	Table(){
	}

	public Table(String colour, String material, boolean isExpandable, String shape) {
		super(colour, material);
		this.isExpandable = isExpandable;
		this.shape = shape;
	}

	public boolean isExpandable() {
		return isExpandable;
	}

	public void setExpandable(boolean isExpandable) {
		//isExpandable = true; 
		this.isExpandable = isExpandable;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return  "\nTable" + super.toString() + "\nExpandable: " + (isExpandable ? "Yes":"No") + 
				"\nShape: " + shape;
				
				
				//"\nTable"+"\nMaterial: " + getMaterial()+ "\nColour: "+ getColour() +
				//"\nExpandable: " + (isExpandable ? "Yes":"No") + "\nShape: " + shape;
	}
}