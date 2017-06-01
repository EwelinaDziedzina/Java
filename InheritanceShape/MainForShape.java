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
		c1.draw();
		c1.setColour(Colour.BLUE);
		System.out.println(c1);
		
		Triangle t1 = new Triangle();
		t1.draw();
		t1.setColour(Colour.PINK);
		System.out.println(t1);
		
		Circle c2 = new Circle();
		c2.setColour(Colour.RED);
		c2.setRadius(12);
		System.out.println(c2);
		
		Triangle t2 = new Triangle(Colour.GREEN);
		System.out.println(t2);
		
		
		
		Shape [] allShapes = {r, r1, c1, t1, c2, t2};
		
		System.out.println("\n*****************ARRAY**************");
		for(Shape one : allShapes){
			System.out.println(one);
		}
		
		System.out.println();
		
		System.out.println("All colours:");
		for (Shape one : allShapes){
			one.draw();
		System.out.println( one.getColour());
		}
		
		System.out.println("********** ONLY CIRCLES **************");
		for (Shape one : allShapes){
			if(one instanceof Circle){
				System.out.println("Circle, radius: " + ((Circle)one).getRadius() + " cm");
			}
		}	
		System.out.println();
		System.out.println("********* ONLY RECTANGLES **********");
		for (Shape one : allShapes){
			if(one instanceof Rectangle){
				System.out.printf("Rectangle, area: %.2f cm2\n", ((Rectangle)one).getArea());
			}
		}	
		
		System.out.println();
		System.out.println("******** ONLY TRIANGLES AND CIRCLES ********");
		for (Shape one : allShapes){
			if(one instanceof Triangle){
				System.out.println("Triangle, colour: " + ((Triangle)one).getColour());
			}
			if(one instanceof Circle){
				System.out.println("Circle, colour: " + ((Circle)one).getColour());
			}
			
		}
		
		System.out.println();
		System.out.println("******** ONLY TRIANGLES ********");
		for(int i = 0; i<allShapes.length; i++){
			if (allShapes[i] instanceof Triangle){
			System.out.printf("Triangle, colour: %s\n", ((Triangle)allShapes[i]).getColour());
			}
		}
	}
}
