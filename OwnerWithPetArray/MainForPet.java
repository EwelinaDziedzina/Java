package OwnerWithPetArray;

public class MainForPet {

	public static void main(String[] args) {
	
		
		/*Pet p1 = new Pet("Rocky", "Husky", 3, "Black", Pet.MALE);
		System.out.println(p1);
		
		Pet p2 = new Pet ("Suzanne", "Labrador", 2, "Brown", Pet.FEMALE);
		System.out.println(p2);*/
		
		Owner o1 = new Owner ("John Smith", "Dublin 2", "0156987145", new Pet [] {p1, p2});
		System.out.println(o1);

	}

}
