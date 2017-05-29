package InheritanceShape;

public class Rectangle extends Shape{
	

	private double height;
	private double widht;
	private double area;
	
	
	public Rectangle(){
	}
	
	public Rectangle(Colour colour, double height, double widht) {
		super(colour);
		this.height = height;
		this.widht = widht;

		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidht() {
		return widht;
	}
	public void setWidht(double widht) {
		this.widht = widht;
	}
	public double getArea() {
		area = height * widht;
		return area;
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
	
	@Override
	public String toString() {
		return 
				super.toString()  + "\nHeight: " + height + 
				"\nWidht: " + widht + 
				String.format("\nArea: %.2f", getArea());
	}	
}
