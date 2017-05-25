package sheet7EmployeeAndClockClasses;

public class ClockMain {

	public static void main(String[] args) {
		
		Clock c1 = new Clock(23, 59, 59);
		System.out.println(c1);
		
	
		c1.increaseTime(0, 0, 1);
		System.out.println(c1);
		
		/*c1.increaseSeconds(56);
		System.out.println(c1);
		c1.increaseMinutes(46);
		System.out.println(c1);
		c1.increaseHours(13);*/
		
		
		Clock c2 = new Clock(23, 59, 59);
		System.out.println(c2);
		
		c2.increaseSeconds(1);
		System.out.println(c2);
		
	
		
	
		
	
		
		
	}

}
