package OwnerWithPetArray;

public class Cat extends Pet implements Mammal {
	

	

	private int numOfLives;
	
	
	Cat(){
	}
	
	Cat (String name, String breed, int age, String colour, boolean isFemale, int numOfLives){
		super(name, breed, age, colour, isFemale);
		this.numOfLives = numOfLives;
	}
	
	
	public int getNumOfLives() {
		return numOfLives;
	}

	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}
	
	public void justLostALife(){
		numOfLives -=1 ;
	}
	
	public String getTypeOfAnimal(){
		return "Cat";
	}
	
	public void sleep(){
		System.out.println("Cat is sleeping");
	}
	
	public void walk(){
		System.out.println("Let the cat out");
	}

	@Override
	public String toString() {
		return super.toString() + "\nNum Of Lives: " + numOfLives;
	}
}
