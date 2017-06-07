package OwnerWithPetArray;



public class Owner {
	
	
	
	private String name;
	private String address;
	private String phoneNo;
	private Pet [] pet;
	
	
	public Owner(){
	}
	
	public Owner(String name, String address, String phoneNo, Pet[] pet) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.pet = pet;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Pet[] getPet() {
		return pet;
	}
	public void setPet(Pet[] pet) {
		this.pet = pet;
	}
	
	
	@Override
	public String toString() {
		String text = "\nOwner name: " + name + 
					"\nAddress: " + address + 
					"\nPhoneNo: " + phoneNo; 
				
		 for(Pet one : pet)
			 text += "\n" + one;
		 
		 return text;
	}		
}
