package com.app.dkte;



class InvalidDateException extends RuntimeException{
	public InvalidDateException() {
		
	}
	
	public InvalidDateException(String message) {
		super(message);
	}
	
}
class Date{
	private int day, month;
	
	public void setDay(int day) {
		if(day <= 0 || day >31) 
			throw new InvalidDateException("The day should be between 1 to 31");
		this.day = day;
	}
	
	public void setMonth(int month) {
		if(month <= 0 || month >12)
			throw new InvalidDateException("The month should be between 1 to 12");
		this.month = month;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + "]";
	}
	
}

public class Program01 {
	public static void main(String[] args) {
	Date d1 = new Date();
	d1.setDay(44);
	d1.setMonth(12);
	System.out.println(d1);
	}
	

}
