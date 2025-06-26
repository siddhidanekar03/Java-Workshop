package com.demo1;
import java.util.Scanner;


public class Manager extends Employee {
	double bonus;
	public Manager() {
		
	}
     public Manager( int empid, double salary,double bonus) {
		super(empid, salary);//default beacause of object class means the fields of object class are inherited 
		this.bonus = bonus;
	}
     @Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Employee Bonus: ");
		bonus = sc.nextDouble();
		
		}
     @Override
	public void display() {
		super.display();
		System.out.println("Employee's Total Salary: "+ (salary + bonus));
		
	}
}
