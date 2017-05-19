package sheet5CreatingClasses;

public class Ex2DogMain {

	public static void main(String[] args) {
		
		
		System.out.printf("%-12s%-12s%-12s\n", "Breed:", "Colour:", "Owner's name:");
		
		Ex2Dog d1 = new Ex2Dog();
		d1.setBreed("Labrador");
		d1.setColour("Brown");
		d1.setOwnersName("Mary Jones");
		System.out.println(d1);
		
		Ex2Dog d2 = new Ex2Dog("Bulldog", "Black", "Stephen Flynn");
		System.out.printf("%-12s%-12s%-12s\n", d2.getBreed(), d2.getColour(), d2.getOwnersName());
		
		Ex2Dog d3 = new Ex2Dog("Boxer", "Black/White", "Jonatan Caroll");
		System.out.println(d3);
	}

}
