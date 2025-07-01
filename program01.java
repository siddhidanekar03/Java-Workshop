package com.app.demo2;

public class program01 {
	
	public static void main (String[]  args) {
	
	int n= 10;
	int d = 0;
	try {
	int result = n / d;
	System.out.println("Result: " + result);
	}catch(ArithmeticException e){
		System.out.println("cannot divide by zero");
			
	}
	System.out.println("Program Finished!!!");
	}
	


}
