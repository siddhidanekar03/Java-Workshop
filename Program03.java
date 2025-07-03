package com.app.demo1;

public class Program03 {
	
	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = "sun";
		String s3 = s2 + "beam";//because it creates new object
		
		
		System.out.println("s1 - " + s1 );
		System.out.println("s2 - " + s2);
		System.out.println("s1==s2 " + (s1==s3));
		
	}

}
