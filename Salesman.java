package com.demo1;

import java.util.Scanner;

public class Salesman extends Employee{
   int noOfproducts;
   double commission;
   public Salesman() {
	   
   }
   
   public Salesman(int empid, double salary,int noOfproducts, double commission) {
	super(empid, salary);
	this.noOfproducts = noOfproducts;
	this.commission = commission;
   }
   
   @Override
	   public void accept(Scanner sc) {
			super.accept(sc);
			System.out.println("Enter the commission: ");
			commission = sc.nextDouble();
			System.out.println("Enter No of Products: ");
			noOfproducts = sc.nextInt();
			}
	   @Override
		public void display() {
			super.display();
			System.out.println("Commision: " + commission);
			System.out.println("no of Products: " + noOfproducts);
		}
	   
	   public void calculateTotalComission() {
		System.out.println("Total Commission: " + (noOfproducts * commission));
	   }
   
   
}
