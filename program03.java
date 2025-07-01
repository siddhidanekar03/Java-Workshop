package com.app.demo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program03 {
	
	public static void main (String[]  args) {
		
	
	int n;
	int d ;
	try (Scanner sc = new Scanner (System.in)){//other way to close the resource
		System.out.print("Enter the numerator: ");
		n= sc.nextInt();
		System.out.print("Enter the denominator: ");
		d= sc.nextInt();
	 int result = n / d;
	    System.out.println("Result: " + result);
	} 
	System.out.println("Program Finished!!!");
	}
	

	
}
