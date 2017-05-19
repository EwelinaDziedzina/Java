package sheet5CreatingClasses;

public class Ex2Dog {
	
	private String breed;
	private String colour;
	private String ownersName;
	
	
	public Ex2Dog(){
	} 
	public Ex2Dog(String breed, String colour, String ownersName){
		this.breed = breed;
		this.colour = colour;
		this.ownersName = ownersName;		
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public void setColour(String colour){
		this.colour = colour;		
	}
	public void setOwnersName(String ownersName){
		this.ownersName = ownersName;
	}
	public String getBreed(){
		return breed;
	}
	public String getColour(){
		return colour;
	}
	public String getOwnersName(){
		return ownersName;
	}
	public String toString(){
		return String.format("%-12s%-12s%-12s", breed, colour, ownersName);
	}

}
