package InheritanceEmployee;

import java.time.LocalDate;

public class PieceWorker extends Employee {
	
	private double wagePerPiece;
	private int quantity;
	
	
	
	public PieceWorker(){
	}
	
	public PieceWorker(String firstName, String lastName, LocalDate dateOfBirth, double wagePerPrice, int quantity){
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		
		this.wagePerPiece = wagePerPrice;
		this.quantity = quantity;
		
	}
	
	public double getWagePerPiece() {
		return wagePerPiece;
	}

	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getEarnings(){
		return wagePerPiece*quantity;
	}
	
	public String toString(){
		return 	"Employee ID: " + employeeID +
				"\nPosition: Piece Worker" +
				super.toString() +
				String.format("\nWage per Piece: €%.2f \nQuantity: %d\nErnings: €%.2f\n", 
						wagePerPiece, quantity, getEarnings() );
	}

}
