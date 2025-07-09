package com.app.demo4;

class Employee implements Comparable<Employee> {
	
	int empid;
	String name;
	double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [ Empid: " + empid + ", Name: " + name + ", Salary: " + salary + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empid - o.empid ;
	}

}
