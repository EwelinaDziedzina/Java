package TraineesAndApprentices;

import java.time.LocalDate;

public class Trainee {
	
	
	

	private String name;
	private LocalDate dateOfBirth; 
	private String pps;
	
	
	public Trainee(String name, LocalDate dateOfBirth, String pps) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pps = pps;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPps() {
		return pps;
	}

	public void setPps(String pps) {
		this.pps = pps;
	}
	
	@Override
	public String toString() {
		return "\nTrainee Name: " + name + 
				"\nDateOfBirth: " + dateOfBirth + 
				"\nPPS: " + pps;
	}
}
