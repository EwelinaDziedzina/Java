package InheritanceShape;

public class Triangle extends Shape {
	
	
	Triangle(){
	}
	
	Triangle(Colour colour){
		super(colour);
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle");
	}

}
