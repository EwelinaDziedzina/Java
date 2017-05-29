package InheritanceFurniture;

public class MainForFurniture {

	public static void main(String[] args) {
		
		Furniture f = new Furniture ("Wood", "Brown");
		System.out.println(f);
		
		Table t = new Table("White", "Glass", true, "Round");
		System.out.println(t);
		
		Bed b = new Bed("Purple", "Double", Bed.HeadBoard.Yes);
		System.out.println(b);
		
		Chair ch = new Chair("Dinning chair", true, "Wood", "Brown");
		System.out.println(ch);

	}
	
}