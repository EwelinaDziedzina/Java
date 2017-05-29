package InheritanceShape;

public class Circle extends Shape{
	
	private int radius;
	
	
	Circle(){
	}
	
	Circle(Colour colour, int radius){
		super(colour);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
	public String toString(){
		return super.toString() + "\nRadius: " + radius;
		
	}
}
