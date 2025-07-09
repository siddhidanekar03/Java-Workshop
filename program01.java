package com.app.demo1;

class Outer{
	
	int field1;
	static int field2;
	
	//not static inner class
	class Inner{
		int field3;
		//static int field4; //not ok
		void innerMethod() {
			System.out.println(field1);
			System.out.println(field2);
			System.out.println(field3);
		}
		
		//static void innerMethod1() {}//not ok
		
		
	}
	
}

public class program01 {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner in =  outer.new Inner();
		
		
		
		
	}

}
