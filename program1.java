package com.demo3;
import java.util.Scanner;
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 Manager m = new Manager(1, 10000, 2000);
		 m.display();
		 
		 Manager m2 = new Manager();
		 m2.accept(sc);
		 m2.display();
		 
		 
		 
	}

}
