package com.app.demo3;


class Date{
	int day;
	int month;
	public void setDay(int day) {
		if(day <=0 || day > 30) 
		throw new  RuntimeException();
		this.day = day;
	
}
	
	public  void setMonth(int month) throws Exception {
		if(month <= 0 || month > 12)
	    throw new Exception();
		this.month = month;
}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + "]";
	}
	
	
}
public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		d1.setDay(80);
		try {
			d1.setMonth(30);
			System.out.println(d1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
