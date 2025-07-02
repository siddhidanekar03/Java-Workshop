package com.app.dkte;

import java.util.Scanner;

enum ArithmeticOperation{
	EXIT, ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, SQUARE, SQUAREROOT
	}


	 
public class demo2 {
	private static ArithmeticOperation menu(Scanner sc) {
		ArithmeticOperation arr[] = ArithmeticOperation.values();
		for(ArithmeticOperation e : arr) 
			System.out.println(e.ordinal() + "." + e.name());
		
		System.out.println("Enter your choice: ");
		return arr[sc.nextInt()];
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArithmeticOperation choice;
		do {
			 choice = menu(sc);
		switch (choice) {
		case EXIT:System.out.println("Exit");
			
			break;
		case ADDITION:  System.out.println("Addition");
						System.out.println("Enter two numbers");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						System.out.println("Addition: " + (n1 + n2));
					break;
					
		case SUBTRACTION: 	System.out.println("Subraction");
								System.out.println("Enter two numbers");
								int s1 = sc.nextInt();
								int s2 = sc.nextInt();
								System.out.println("Subtraction: " + (s1 - s2));
								break;
	
					
		case MULTIPLICATION: System.out.println("Multiplication");
								System.out.println("Enter two numbers");
								int m1 = sc.nextInt();
								int m2 = sc.nextInt();
								System.out.println("Mutiplication: " + (m1 * m2));
								break;
		
		case DIVISION:  System.out.println("Division");
						System.out.println("Enter two numbers");
						int d1 = sc.nextInt();
						int d2 = sc.nextInt();
						System.out.println("Division: " + (d1 / d2));
			
						break;
			
		case SQUARE:   System.out.println("Square");
					   System.out.println("Entera number");
				       int n = sc.nextInt();
		
					   System.out.println("Square: " + (n * n));
					   break;
			
		case SQUAREROOT:System.out.println("SquareRoot");
		   				System.out.println("Entera number");
		   				double s = sc.nextInt();

		   				System.out.println("SquareRoot: " + Math.sqrt(s));
		   				break;
		

		default:System.out.println("Wrong Choice");
			break;
		}
		}while(choice != ArithmeticOperation.EXIT);
	}
	
	

}
