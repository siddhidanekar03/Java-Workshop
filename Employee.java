package com.demo1;
import java.util.Scanner;

public class Employee {
	
	int empid;
	double salary;
	
	public Employee() {
		
	}
	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter the Employee id: ");
		empid = sc.nextInt();
		System.out.println("Enter the Employee Salary: ");
		salary = sc.nextDouble();
		}
	public void display() {
		System.out.println("Employee's Id" + empid);
		System.out.println("Employee's Salary: "+ salary);
	}
	
	


}
