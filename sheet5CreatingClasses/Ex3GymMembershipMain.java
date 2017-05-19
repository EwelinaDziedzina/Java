package sheet5CreatingClasses;

public class Ex3GymMembershipMain {

	public static void main(String[] args) {
		
		
		System.out.printf("%-12s%-15s%-12s\n", "ID", "Payment Freq", "Payment");
		
		Ex3GymMembership g1 = new Ex3GymMembership();
		g1.setPayFrequency(12);	
		g1.setMemCost(320);
			
		System.out.println(g1);
		
		Ex3GymMembership g2 = new Ex3GymMembership(12, 500);	
		System.out.println(g2);
		
		System.out.println();
		
		Ex3GymMembership g3 = new Ex3GymMembership(12, 600);
		System.out.println("ID:"+ Ex3GymMembership.memNo);
		System.out.println("Payment frequency: " + g3.getPayFrequency()+
							"\nPayment: "+g3.getMemCost());
		
		
	}

}
