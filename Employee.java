package com.app.dkte;
import java.util.Scanner;

public class Employee extends Person {
	int empid;
	String department;
	double salary;
	MyDate dateOfJoining;
	
	
	 public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public MyDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", department=" + department + ", salary=" + salary + ", dateOfJoining="
				+ dateOfJoining + "]";
	}


	 public void acceptEmployee(Scanner sc) {
		 System.out.println("Enter the Employee empid: ");
		 empid = sc.nextInt();
		 System.out.println("Enter the Department: ");
		 department = sc.next();
		 System.out.println("Enter the Salary: ");
		 salary = sc.nextDouble();
		 System.out.println("Enter the date of joining");
		 dateOfJoining.acceptDate(sc);
		 
		 
	 }

}
