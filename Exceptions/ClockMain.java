package Exceptions;



public class ClockMain {
	
	public static void main(String[] args) {
		
	
		try {
		Clock	c1 = new Clock(55, 59, 59);
		System.out.println(c1);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
		
		
	
		/*c1.increaseTime(0, 0, 1);
		System.out.println(c1);
		
	
		
		
		Clock c2 = new Clock(23, 59, 59);
		System.out.println(c2);
		
		c2.increaseSeconds(1);
		System.out.println(c2);
		*/
	
	}	
}
