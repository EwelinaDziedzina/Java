package arrayLists;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Trainees {
	
	
	
	String name;
	String address;
	LocalDate birthday;
	

	public Trainees(){
	}
	
	public Trainees(String name, String address, LocalDate birthday) {
		
		this.name = name;
		this.address = address;
		this.birthday = birthday;
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
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public boolean equals (Object obj) {
		
		Trainees other = (Trainees)obj;
		
		if(this.name.equals(other.name) && 
		   this.address.equals(other.address) && 
		   this.birthday.equals(other.birthday)){
			return true;
		}else{
			return false;
		}
	}	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
			return "\nName: " + name +
					"\nAddress: " + address + 
					"\nDate of birth: " + birthday.format(formatter);
		}
		
	}

