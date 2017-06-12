package Exceptions;

public class InvalidWeekdayException extends Exception{
	
	InvalidWeekdayException(){
	};
	
	InvalidWeekdayException(String message){
		super(message);
	}
}
