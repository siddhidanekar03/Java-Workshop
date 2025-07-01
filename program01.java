package com.app.demo1;
import java.util.Scanner;

interface Acceptable{
	void accept(Scanner sc);
}

interface Displayable{
	void display();
}


class Date implements Acceptable,Displayable{
	int day;
	int month;
	int year;
	
	
public void accept(Scanner sc) {
	System.out.print("Enter the day: ");
	day = sc.nextInt();
	System.out.print("Enter the month: ");
	month = sc.nextInt();
	System.out.print("Enter the year: ");
	year = sc.nextInt();
	
}

public void  display() {
	System.out.println("Date: " + "(" + day + " / " + month + " / " + year + " )");
}

}


class Time implements Acceptable, Displayable{
	int hr, min;
	
	public void accept(Scanner sc) {
		System.out.println("Enter hour: ");
		hr = sc.nextInt();
		System.out.println("Enter Minutes: ");
		min = sc.nextInt();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Time: " + hr + " : " + min );
	}
}

class Employee implements Acceptable{
	int empid;
	String name;
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id: ");
		empid = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name = sc.next();
		
	}
	
	
	
	}
     public class program01{
	
	public static  void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	
	Acceptable a1;
    a1 = new Time();//upcasting
    a1.accept(sc);
    Displayable d1 = (Displayable)a1;//downcasting
    d1.display();
    
    Acceptable a2 = new Date();
    a2.accept(sc);
    Displayable d2 = (Displayable)a2;
    d2.display();
    	
    
    
 
    
    
    }









	
}
