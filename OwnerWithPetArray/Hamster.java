package OwnerWithPetArray;

public class Hamster extends Pet implements Mammal{
	
	
	
	
	Hamster(){
	}
	
	Hamster (String name, String breed, int age, String colour, boolean isFemale){
		super(name, breed, age, colour, isFemale);
	}
		
	public String getTypeOfAnimal(){
		return "Hamster";
	}
	
	public void sleep(){
		System.out.println("Hammster is sleeping");
	}
	
	public void walk(){
		System.out.println("Let the hammster out");
	}

}
