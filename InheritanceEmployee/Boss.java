package InheritanceEmployee;

import java.time.LocalDate;

public class Boss extends Employee {
	
	
	

	private double weeklySalary;
	
	public Boss (){
	}
	
	public Boss(String firstName, String lastName, LocalDate dateOfBirth, double weeklySalary){
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		this.weeklySalary = weeklySalary;
	}
	
	
	public void setWeeklySalary(double weeklySalary){
		
	}
	
	public double getWeeklySalary(){
		return weeklySalary;
	}
	
	public double getEarnings(){
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return 	"\nEmployee ID: " + employeeID +
				"\nPosition: Boss" +
				super.toString()+
				String.format("\nEarnings: €%.2f", getEarnings());
				
			
	}
	
}
