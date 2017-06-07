package OwnerWithPetArray;

public class Dog extends Pet implements Mammal{
	

	

	private String microChipNumber;
	private boolean isMicroChipped;
	 
	
	public static boolean IS_MICRO_CHIPPED = true;
	public static boolean IS_NOT_MICRO_CHIPPED = false;
	
	
	
	Dog(){
	}
	
	Dog (String name, String breed, int age, String colour, boolean isFemale, boolean  isMicroChipped){
		super(name, breed, age, colour, isFemale);
		this.isMicroChipped = isMicroChipped;
	}
	
	Dog (String name, String breed, int age, String colour, boolean isFemale, boolean  isMicroChipped, String microChippNumber){
		super(name, breed, age, colour, isFemale);
		this.isMicroChipped = isMicroChipped;
		this.microChipNumber = microChippNumber;
	}
	
	public String getMicroChipNumber() {
		return microChipNumber;
	}

	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}

	public boolean isMicroChipped() {
		return isMicroChipped;
	}

	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}
	
	public String getTypeOfAnimal(){
		return "Dog";
	}
	
	public void sleep(){
		System.out.println("Dog is sleeping");
	}
	
	public void walk(){
		System.out.println("Walk the dog");
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nis MicroChipped: " +
				(isMicroChipped ? "Yes" : "No") + 
				"\nMicroChip Number: " + microChipNumber;
	}
}
