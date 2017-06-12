package Exceptions;

public class MainForWeekday {

	public static void main(String[] args) {

		
		Weekday w1 = new Weekday();
		try{
		w1.setWeekday("Frida");
		System.out.println(w1);
		}
		catch(InvalidWeekdayException e){
			System.out.println(e.getMessage());
		}
	}
}
