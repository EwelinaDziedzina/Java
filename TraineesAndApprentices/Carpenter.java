package TraineesAndApprentices;

import java.time.LocalDate;

public class Carpenter extends Trainee implements Apprentice{
	
	
	private String employersName;
	private int phase;
	
	
	
	public Carpenter(){
	};
	
	public Carpenter(String name, LocalDate dateOfBirth, String pps, String employersName, int phase) {
		super(name, dateOfBirth, pps);
		this.employersName = employersName;
		setPhase(phase);
	}


	public void setPhase(int phase) {
		if (phase >=1 && phase <=6){
			this.phase = phase;
		}else{
			System.out.println("Invalid phase");
		}
	}

	public int getPhase() {
		return phase;
	}

	public void setEmployersName(String employersName) {
		this.employersName = employersName;
	}

	public String getEmployersName() {
		return employersName;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nEmployers Name: " + employersName + 
				"\nPhase: " + phase;
	}


	
	
	
	

}
