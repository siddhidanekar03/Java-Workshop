package com.app.demo1;

public class program03 {
	
	int field1;
	static int field2;
	  public void method() {
		  int localField = 10;
		  class local{
			  int field3;
			  //static int field4;// not ok
			  
			  //static void method1() {}//not ok
			  void localMethod2() {
				  System.out.println(field1);
				  System.out.println(field2);
				  System.out.println(field3);
				  System.out.println(localField);
			  }
			  
		  }
	  }
	  
	 private static void method2() {
		  int localField = 10;
		  class local{
			  int field3;
			  //static int field4;// not ok
			  
			  //static void method1() {}//not ok
			  void localMethod2() {
				 // System.out.println(field1);//not ok
				  System.out.println(field2);
				  System.out.println(field3);
				  System.out.println(localField);
			  }
			  
		  }
	  }

	public static void main(String[] args) {
		

	}

}
