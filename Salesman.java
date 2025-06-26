package com.demo3;
import java.util.Scanner;

public class Salesman extends Employee {
	
	double commission;
	int noOfproducts;
	
	public Salesman() {
		
	}
	
	public Salesman(int empid, int noOfproducts, double salary, double commission) {
		super(empid, salary);
		this.commission = commission;
		this.noOfproducts = noOfproducts;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the commission: ");
		commission = sc.nextDouble();
		System.out.println("Enter No of Products: ");
		noOfproducts = sc.nextInt();
		}
	public void display() {
		super.display();
		System.out.println("Total Commission: " + (noOfproducts * commission));
	}
	
	

}
