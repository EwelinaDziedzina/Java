package OwnerWithPetArray;

public class Snake extends Pet{
	
	Snake(){
	}
	
	Snake(String name, String breed, int age, String colour, boolean isFemale){
		super(name, breed, age, colour, isFemale);
	}
		
	public String getTypeOfAnimal(){
		return "Snake";
	}

}
