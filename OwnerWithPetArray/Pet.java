package OwnerWithPetArray;

public abstract class Pet {


	
	private String name;
	private String breed;
	private int age;
	private String colour;
	private boolean isFemale;
	
	
	/*public static final String FEMALE = "Female";
	public static final String MALE = "Male";*/
	
	public static final boolean FEMALE = true;
	public static final boolean MALE = false;
	
	
	public Pet (){
	}
	
	public Pet(String name, String breed, int age, String colour, boolean isFemale) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public abstract String getTypeOfAnimal();
	
	@Override
	public String toString() {
		return "\nType of animal: " + getTypeOfAnimal() +
				"\nPet name: " + name + 
				"\nBreed: " + breed + 
				"\nAge: " + age + 
				"\nColour: " + colour + 
				"\nGender: " + (isFemale?"Female":"Male");
	}
}	
