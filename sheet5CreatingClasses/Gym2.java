package sheet5CreatingClasses;

public class Gym2 {
	
	private String name;
	private int paymentFrequency;
	private int memNo;
	
	public static int  memCounter = 100;
	
	public static final int YEARLY = 1;
	public static final int MONTHLY = 2;
	public static final int PAY_AS_YOU_GO = 3;
	
	Gym2 () {
		
	}
	
	Gym2 (){
		
		
		
	}
	public void setName(String name){
		this.name = name;
	} 

	public void setPaymentFreq(int paymentFrequency){
		
		switch(paymentFrequency){
			case PAY_AS_YOU_GO:
			case MONTHLY:
			case YEARLY:
				this.paymentFrequency = paymentFrequency;
				break;
			default:
				System.out.println("Invalid payment frequency, setting to yearly.");
					this.paymentFrequency = YEARLY;		
		}
		
		
		
		
		
	}
	
	
}
