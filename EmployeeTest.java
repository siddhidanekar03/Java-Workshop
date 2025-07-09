package com.app.demo4;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2, "Anil", 30000));
		emp.add(new Employee(1, "Ziva", 50000));
		emp.add(new Employee(4, "Vamika", 10000));
		emp.add(new Employee(5, "Akash", 20000));
		emp.add(new Employee(3, "Sameer", 40000));
		
		int choice;
		
		
		do {
			System.out.println("0. Exit ");
			System.out.println("1. Display All Employees");
			System.out.println("2. Display All Employees sorted on Empid");
			System.out.println("3. Display All Employees sorted on Name ");
			System.out.println("4. Display All Employees sorted on Salary");
			System.out.println("5. Display All Employees sorted on Empid in descending");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1: emp.forEach(e -> System.out.println(e));
				break;
				
			case 2: Collections.sort(emp );
				emp.forEach(e -> System.out.println(e));
			break;
			
			case 3:emp.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
				emp.forEach(e -> System.out.println(e));
			break;
			
			case 4: emp.sort((e1, e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
				emp.forEach(e -> System.out.println(e));
			break;
			
			case 5: emp.sort((e1, e2)-> Double.compare(e2.getSalary(), e1.getSalary()));
				emp.forEach(e -> System.out.println(e));
			break;
				
				

			default: System.out.println("Wrong Choice!");
				break;
			}
	
		}while(choice !=0);
		
		

	}

}
