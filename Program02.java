package com.app.dkte;



class InvalidTimeException extends RuntimeException{
	public InvalidTimeException() {
		
	}
	
	public InvalidTimeException(String message) {
		super(message);
	}
	
}

class Time{
	private int hr, min;
	
	public void setHr(int hr ) {
		if(hr < 0 || hr > 23)
			throw new InvalidTimeException();
		this.hr = hr;
	}
	
	public void setMin(int min) {
		if(min<=0 || min > 59) 
			throw new InvalidTimeException();
		this.min = min;
	}

	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}
	
	
}


public class Program02 {
	public static void main(String[] args) {
	Time t1 = new Time();
	try {
	t1.setHr(24);
	t1.setMin(60);
	System.out.println(t1);
	}catch(InvalidTimeException e) {
		e.printStackTrace();
		
	}
	System.out.println("Program finished!!!");
	}
	

}
