package Exceptions;

public class Weekday {
	

	private String weekday;
	
	public static final String MONDAY = "Monday";
	public static final String TUESDAY = "Tuesday";
	public static final String WEDNESDAY = "Wednesday";
	public static final String THURSDAY = "Thursday";
	public static final String FRIDAY = "Friday";
	public static final String SATURDAY = "Saturday";
	public static final String SUNDAY = "Sunday";
	
	Weekday(){
	}
	
	Weekday(String weekday) throws InvalidWeekdayException{
		setWeekday(weekday);
	}
	
	public void setWeekday(String weekday)throws InvalidWeekdayException{
		
		switch (weekday) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			case SATURDAY:
			case SUNDAY:
				this.weekday = weekday;
			break;
			
			default: 
				throw new InvalidWeekdayException("Sorry you provided an invalid weekday");
		}
	}
	
	public String getWeekday(){
		return weekday;
	}
	
	@Override
	public String toString() {
		return "Weekday" + weekday;
	}
}
