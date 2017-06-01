package InheritanceEmployee;

import java.time.LocalDate;

public class HourlyWorker extends Employee {
	

	private double wage;
	private int hoursWorked;
	
	
	public HourlyWorker(){
	}
	
	
	public HourlyWorker(String firstName, String lastName, LocalDate dateOfBirth, double wage, int hoursWorked) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getEarnings(){
		
		if (hoursWorked<=40)
			return wage * hoursWorked;
		else
			return (wage*40) + (1.5 *  wage * ( hoursWorked -40));
	
		
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + employeeID +
				"\nPosition: Hourly Worker"+
				String.format("\nHours worked: %d\nWage: €%.2f", hoursWorked, wage) + 
				"\nOvertime: " + ((hoursWorked > 40) ? (hoursWorked - 40): 0) + "h" +
				String.format("\nOvertime per hour: €%.2f\nTotal earnings: €%.2f", wage*1.5, getEarnings());
				
	}

}
