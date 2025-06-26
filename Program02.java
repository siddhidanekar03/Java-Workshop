package com.demo1;
import java.util.Scanner;
public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		System.out.println("Press 1 for Employee");
		System.out.println("Press 2 for Manager");
		System.out.println("Press 3 for Salesman");
		
		System.out.println("Enter the choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			e = new Employee();
			break;
		case 2:
			e = new Manager();
			break;
		case 3:
			e = new Salesman();
		}
		
		e.accept(sc);
		e.display();
		//e.calculateTotalCommision();//It is not ok beacuse e is of employee (super class reference)
		//so its will only access the member that are inherited this is called object slicing
		
		//now we use downcasting and downcasting can only be done when there is upcasting
		if(e instanceof Salesman) {
			Salesman s = (Salesman) e;//we typecast the e by Salesman reference
			s.calculateTotalComission();//now it is possible
			//Converting the superclass reference into subclass reference
		}
		
		
		
		
	}

}
