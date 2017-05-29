package InheritanceShape;

public class MainForShape {

	public static void main(String[] args) {
	
		Shape s = new Shape();
		s.draw();
		
		Rectangle r = new Rectangle(Colour.BLACK, 12.3, 14.0);
		r.draw();
		System.out.println(r);
		
		Rectangle r1 = new Rectangle (Colour.GREEN, 2.5, 5);
		System.out.println(r1);
		
		Circle c1 = new Circle (Colour.ORANGE, 6);
		c1.setColour(Colour.BLUE);
		System.out.println(c1);
		
	}

}
