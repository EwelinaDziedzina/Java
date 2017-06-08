package Exceptions;

public class Clock {
	
	private int hours;
	private int seconds;
	private int minutes;
	
	
	Clock(){	
	}
	
	Clock (int hours, int minutes, int seconds) throws InvalidTimeException {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	
	public void setHours(int hours)throws InvalidTimeException{
		if (hours >= 0 && hours <=24){
		this.hours = hours;
		}else{
			throw new InvalidTimeException("That's defenitely not a correct time");
		}
	}
	
	public int getHours(){
		return hours;
	}
	
	public void setMinutes(int minutes)throws InvalidTimeException{
		if(minutes >= 0 && minutes <= 59){
		this.minutes = minutes;
		}else{
			throw new InvalidTimeException("That's defenitely not a correct time");
		}
	}
	
	public int getMinutes(){
		return minutes;
	}
	
	public void setSeconds(int seconds) throws InvalidTimeException{
		if (seconds >= 0 && seconds<=59){
		this.seconds = seconds;
	}else{
		throw new InvalidTimeException("That's defenitely not a correct time");
		}
	}
	
	public int getSeconds(){
		return seconds;
	}
	
	public void resetTime(){
		hours = minutes = seconds = 0;	
	}
	
	public void increaseSeconds(int a){
		if ((seconds + a) < 60){
			seconds = seconds + a;
		}else{
			//minutes = minutes + ((seconds + a) / 60 );
			increaseMinutes((seconds + a) / 60);
			seconds = (seconds + a) % 60;
		}
	}
	
	public void increaseMinutes(int a){
		if ((minutes + a) < 60){
			minutes = minutes + a;
		}else{
			increaseHours ((minutes + a) / 60);
			minutes = (minutes + a) % 60;		
		}
	}
	
	public void increaseHours(int a){
		if ((hours + a) < 24)
			hours = hours + a;
		else{
			hours = (hours + a) % 24;
		}
	}	
		
		
	public void increaseTime(int h, int m, int s){
	 
		if ((seconds + s) < 60){
			seconds = seconds + s;
		}else{
			minutes = minutes + ((seconds + s)/60);	
			seconds = (seconds + s) % 60;

		}
		if ((minutes + m) < 60){
			minutes = minutes + m;
		}else{
			hours = hours + ((minutes + m) / 60);
			minutes = (minutes + m) % 60;
		}
		if ((hours + h) < 24)
			hours = hours + h;
		else{
			hours = (hours + h)%24;			
		}
	}
	
	
	public String toString(){
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
}	
	
