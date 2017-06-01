package InheritanceEmployee;

import java.time.LocalDate;


public class CommissionWorker extends Employee {
	




	private double salary;
	private double commission;
	private int quantity;
	
	CommissionWorker(){
	}
	
	CommissionWorker(String firstName, String lastName, LocalDate dateOfBirth, double salary, double commission, int quantity){
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		this.salary = salary;
		this.commission = commission;
		this.quantity = quantity;
	}	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getEarnings(){
		return salary = salary + (commission*quantity);
		
	}

	@Override
	public String toString() {
		return "\nEmployee ID: " + employeeID +
				"\nPosition: Commission Worker"+
				super.toString() +
				String.format("\nSalary: €%.2f\nCommission: €%.2f\nQuantity: %d\nEarnings: €%.2f\n", 
				salary, commission, quantity,  getEarnings());
	}

}
