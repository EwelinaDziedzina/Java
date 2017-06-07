package TraineesAndApprentices;

public interface Apprentice {
	
	int PHASE_ONE = 1;
	int PHASE_DWO = 2;
	int PHASE_THREE = 3;
	int PHASE_FOUR = 4;
	int PHASE_FIVE = 5;
	int PHASE_SIX = 6;
	
	public void setPhase(int phase);
	public int getPhase();
	public void setEmployerName(String employerName);
	public String getEmployerName();

}
