package com.app.demo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program05 {
	
	public static void main (String[]  args) {
		Scanner sc = new Scanner (System.in);
	
	int n;
	int d ;
	try {
		System.out.print("Enter the numerator: ");
		n= sc.nextInt();
		System.out.print("Enter the denominator: ");
		d= sc.nextInt();
	 int result = n / d;
	    System.out.println("Result: " + result);
	} finally {
		System.out.println("Inside finally");//to close the resource
		sc.close();
	}
	System.out.println("Program Finished!!!");
	}
	

	
}
