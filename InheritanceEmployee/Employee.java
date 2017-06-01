package InheritanceEmployee;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

 abstract public class Employee {
	

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public static int employeeID = 10000;
	
	
	public Employee(){
		employeeID ++;
	}
	
	public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public abstract double getEarnings();

	@Override
	public String toString() {
		return "\nName: " + firstName +" " + lastName + "\nDate Of Birth: " + String.format("%d/%02d/%d", 
				dateOfBirth.get(ChronoField.DAY_OF_MONTH),
				dateOfBirth.get(ChronoField.MONTH_OF_YEAR),
				dateOfBirth.get(ChronoField.YEAR));
	}
	

}
