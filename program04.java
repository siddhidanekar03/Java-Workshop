package com.app.demo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program04 {
	
	public static void main (String[]  args) {
		Scanner sc = new Scanner (System.in);
	
	int n;
	int d ;
	try {
		System.out.println("Enter the numerator: ");
		n= sc.nextInt();
		System.out.println("Enter the denominator: ");
		d= sc.nextInt();
	 int result = n / d;
	    System.out.println("Result: " + result);
	} catch(Exception e){
		e.printStackTrace();//to avoid crashing and printing next message
			
	}
	System.out.println("Program Finished!!!");
	}
	

	
}
