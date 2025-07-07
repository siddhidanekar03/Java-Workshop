package com.app.demo2;

import java.util.ArrayList;
import java.util.Collection;


class Employee{
	int empid;
	String Name;
	double salary;
	
	public Employee() {
		
	}

	public Employee(int empid, String name, double salary) {
		
		this.empid = empid;
		Name = name;
		this.salary = salary;
	}
	
	public Employee(int empid) {
		this.empid = empid;
	}

	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			if(this.empid == e.empid)
				return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	
	
	
}

public class program02 {
	
	

	public static void main(String[] args) {
		
		Collection<Employee> e = new ArrayList<>();
		e.add(new Employee(1, "Anil", 20000));
		e.add(new Employee(2, "Neha", 10000));
		e.add(new Employee(3, "Siya", 40000));
		e.add(new Employee(4, "Vansh", 30000));
		e.add(new Employee(5, "Ansh", 50000));
		e.add(new Employee(6, "Ram", 60000));
		
		
		System.out.println("Remove Employee: " + e.remove(new Employee(4)));
		
		System.out.println("Contains: " + e.contains(new Employee(3)));
		
		for(Employee emp : e ) {
			System.out.println(emp);
		}
	

	}

}
