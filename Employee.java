package com.demo2;
import java.util.Scanner;

public class Employee extends Person {
	int empid;
	double salary;
	
	public Employee() {
		System.out.println("Employee() ");
		System.out.println();
		
	}
	
	public Employee(int empid, String name, String email, double salary) {
		super(name, email);
		System.out.println("Employee(int,String,String,double)");
		this.empid = empid;
		this.salary = salary;
	}
	
	public void acceptEmployee(Scanner sc) {
		super.acceptPerson(sc);
		System.out.println("Enter Employee Id:  ");
		empid = sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		salary = sc.nextDouble();
	}
	
	public void displayEmployee() {
		super.displayPerson();
		System.out.println("Employee's Id: "+ empid);
		System.out.println("Employee's Salary: "+salary);
	}
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(1, "Siddhi","siddhi@gmail.com", 50000);
		e1.displayEmployee();
		
		Employee e2 = new Employee();
		e2.acceptEmployee(sc);
		e2.displayEmployee();
	}

}
