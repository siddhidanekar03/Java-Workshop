package com.app.demo1;

class Outer1{
	
	int field1;
	static int field2;
	
	// static inner class
	static class Inner{
		int field3;
		static int field4; 
		void innerMethod() {
			Outer1 o1 = new Outer1();
			//System.out.println(field1);//not ok
			System.out.println(field2);
			System.out.println(field3);
			System.out.println(field4);
			System.out.println(o1.field1);
		}
		
		static void innerMethod1() {
			Outer1 o1 = new Outer1();
			//System.out.println(field1);//not ok
			System.out.println(field2);
			//System.out.println(o1.field3); //not ok
			System.out.println(field4);
			System.out.println(o1.field1);
		}
		
		
	}
	
}

public class program02 {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner in =  outer.new Inner();
		
		
		
		
	}

}
