package InheritanceShape;

public class Shape {

	private Colour colour;

	Shape(){
	}

	Shape(Colour colour){
		this.colour = colour;		
	
	
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}

	public void draw(){
	System.out.println("Drawing a Shape");
	}

	@Override
	public String toString() {
		return "Colour: " + colour.toString().toLowerCase();
	
	
	} 

	
	
}
