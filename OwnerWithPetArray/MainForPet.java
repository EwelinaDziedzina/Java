package OwnerWithPetArray;

public class MainForPet {

	public static void main(String[] args) {
	
		
		/*Pet p1 = new Pet("Rocky", "Husky", 3, "Black", Pet.MALE);
		System.out.println(p1);
		
		Pet p2 = new Pet ("Suzanne", "Labrador", 2, "Brown", Pet.FEMALE);
		System.out.println(p2);*/
		
		
		
		Snake s1 = new Snake("Johnny", "Cobra", 1, "Green", Snake.MALE);
		System.out.println(s1);
		
		Cat c1 = new Cat ("Pimki", "Persian", 2, "White", Cat.FEMALE, 7);
		System.out.println(c1);
		
		c1.justLostALife();
		
		Dog d1 = new Dog ("Sam", "Labrador", 1, "Brown", Dog.MALE, Dog.IS_MICRO_CHIPPED, "ABT21875");
		System.out.println(d1);
		
		Hamster h1 =  new Hamster ("Lusy", "Best", 1, "Brown", Hamster.FEMALE);
		System.out.println(h1);
		
		Dog d2 = new Dog ("Nidra", "Husky", 3, "Grey", Dog.FEMALE, Dog.IS_MICRO_CHIPPED, "DRT376543");
		System.out.println(d2);
		
		
		Owner o1 = new Owner ("John Smith", "Dublin 2", "0156987145", new Pet [] {s1, c1, d1, h1, d2});
		System.out.println(o1);
		
		Pet [] allPets = o1.getPet();
			//{s1, c1, d1, h1, d2};
		
		
		
		System.out.println("\n************MICROCHIPS**************");
		for(int i = 0; i<allPets.length; i++){
			if (allPets[i] instanceof Dog)
				System.out.println("Microchip: " + ((Dog)allPets[i]).getMicroChipNumber());
		}
		
		System.out.println();
		
		for (int i = 0; i<allPets.length; i++){
			if(allPets[i] instanceof Mammal)
				((Mammal)allPets[i]).walk();
		}
		
	}
}
