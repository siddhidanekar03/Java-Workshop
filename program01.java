package com.app.demo3;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

interface Acceptable{
	
	void accept();//public abstract
	
	default void display() {
		System.out.println("aceeptable :: display");
	}
	
	static <T> void sort(List<T> l1) {
		
	}
}

//interface Displayable{
//void display() ;
//}
   
class Employee implements Acceptable{

	@Override
	public void accept() {
		System.out.println("Employee :: Accept");
		
	}
	@Override
	public void display() {
		System.out.println("Employee::Display");
	}
	
}

class Time implements Acceptable{

	@Override
	public void accept() {
		System.out.println("Time :: Accept");
		
	}
	
	
}

class Product implements Acceptable{

	@Override
	public void accept() {
		System.out.println("Product :: Accept");
		
	}
	@Override
	public void display() {
		System.out.println("Product :: Display");
	}
	
}

public class program01 {

	public static void main(String[] args) {
		Acceptable a;
		//a = new Employee();
		a = new Time();
		//a = new Product();
		
	a.accept();
	a.display();

	}

}
