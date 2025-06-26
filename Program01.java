package com.demo1;
import java.util.Scanner;

public class Program01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e;
		e = new Manager();//upcasting storing object of subclass into superclass is known as upcasting
		e.accept(sc);
		e.display();
	}
}
