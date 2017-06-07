package TraineesAndApprentices;

public class Electrician extends Trainee implements Apprentice{

	private String employerName;
	private int phase;







	public void setPhase (int phase) {
		if (phase >= 1 && phase <=6){
			this.phase = phase;
		}else{
			System.out.println("Invalid phase");
		}
	}
	public int getPhase() {
		return phase;

	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerName () {
		return employerName;
	}



}
