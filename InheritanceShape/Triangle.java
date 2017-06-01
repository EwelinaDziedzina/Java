package InheritanceShape;

public class Triangle extends Shape {
	
	
	Triangle(){
	}
	
	Triangle(Colour colour){
		super(colour);
	}
	
	public void draw(){
		System.out.println("\nDrawing a Triangle");
	}
	
	//toString from Shape class
}
