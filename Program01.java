package com.demo4;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee e;//only reference
		//e = new Employee();//not ok beacuse only reference of abstract class is allowed
		//e = new Manager();//upcasting 
		e = new Salesman();
		e.accept(sc);
		e.display();
		e.calculateTotalSalary();
	  

	}

}
