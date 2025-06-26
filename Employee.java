package com.dem01;
import java.util.Scanner;

public class Employee {
	
	int empid;
	String name;
	double salary;
	Date doj;
	Vehicle veh;
	
	public Employee() {
		doj = new Date();
	}
	public Employee(int empid, String name, double salary, int day, int month, int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		doj = new Date( day,  month,  year);
	}
	
	public void acceptEmployee(Scanner sc) {
		System.out.print("Enter the employee Id: ");
		empid = sc.nextInt();
		System.out.print("Enter the Employee Name: ");
		name = sc.next();
		System.out.print("Enter the Employee Salary: ");
		salary = sc.nextDouble();
		System.out.println("Enter the Date of joining: ");
		doj.acceptDate(sc);
		}
	
	public void addVehicle(Scanner sc) {
		veh = new Vehicle();
		veh.acceptVehicle(sc);
	}
	
	public void displayEmployee() {
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee's Name : "+ name);
		System.out.println("Employee's Salary: "+ salary);
		doj.displayDate();
		if(veh != null) {
			veh.displayVehicle();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.displayEmployee();
		
		Employee e2 = new Employee();
		e2.acceptEmployee(sc);
		e2.addVehicle(sc);
		e2.displayEmployee();
		

	}


	

}
