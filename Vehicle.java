package com.dem01;

import java.util.Scanner;

public class Vehicle {
	String name;
	String number;
	
	public Vehicle() {
		
	}
	
	
	public void acceptVehicle(Scanner sc) {
		System.out.println("Enter the name of vehicle: ");
		name = sc.next();
		System.out.println("Enter the number of vehicle: ");
		number = sc.next();
		
		
	}
	
	public void displayVehicle() {
		System.out.println("The name of Vehicle: "+ name);
			System.out.println("The number of vehicle: " + number);
			}
	
	

}
