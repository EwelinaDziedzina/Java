package sheet5CreatingClasses;

public class Ex3GymMembership {
	
	
	private double memCost;
	private int payFrequency;
	public static int memNo;
	
	Ex3GymMembership(){
		 memNo++;
	}
	
	Ex3GymMembership(int payFrequency, double memCost){
		this();
		setPayFrequency(payFrequency);
		setMemCost(memCost);
		
		
		
	}
	public void setPayFrequency(int payFrequency){
		if(payFrequency == 1 || payFrequency == 12)
		this.payFrequency = payFrequency;	
		else
			System.out.println("Payment frequency should be 1 or 12");	
		
	}
	public void setMemCost(double memCost){
		if (this.payFrequency == 1)
			this.memCost = memCost;	
		else if (this.payFrequency == 12)
			this.memCost = memCost/12.0;
		
		}	
	public int getPayFrequency(){
		return payFrequency;	
	}
	public double getMemCost(){
		return memCost;
	}
	public String toString(){
		return String.format("%-12d%-15d%-12.2f", memNo, payFrequency, memCost);
	}
	
}

		
	
	

