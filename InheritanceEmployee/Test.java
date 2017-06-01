package InheritanceEmployee;

import java.time.LocalDate;

public class Test {
	
	public static void main (String [] args){
		
	Boss b1 = new Boss("John", "Smith", LocalDate.of(1998, 1, 12), 2000);
	System.out.println(b1);
	
	CommissionWorker cw1 = new CommissionWorker("Asen", "Evtimov", LocalDate.of(1982, 11, 5), 200, 30, 30);
	System.out.println(cw1);

	PieceWorker pw1 = new PieceWorker("Monica", "Johns", LocalDate.of(1988, 11, 5), 12.50, 100);
	System.out.println(pw1);
	
	HourlyWorker hw1 =  new HourlyWorker("John", "Smith", LocalDate.of(1985, 11, 5), 12.30, 42);
	System.out.println(hw1);
	
	
	Employee [] workers = {b1, cw1, pw1, hw1};
	
	
	System.out.println("\nQuantity:");
	for(Employee one : workers){
		if (one instanceof PieceWorker){
		System.out.println(((PieceWorker)one).getQuantity());
		}
	}
	

	}
}
