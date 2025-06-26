package com.demo3;

import java.util.Scanner;

public class Employee {
	 int empid;
	 double salary;
	 
	 public Employee() {
		 
	 }

	 public Employee(int empid, double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	 }
	 
	 public void accept(Scanner sc) {
		 System.out.println("Enter the Employee Id: ");
		 empid = sc.nextInt();
		 System.out.println("Enter the Employee Salary: ");
		 salary = sc.nextDouble();
		 
	 }
	 
	 public void display() {
		 System.out.println("Employee's Id: "+empid );
		 System.out.println("Employee;'s Salary: "+ salary);
	 }
}
