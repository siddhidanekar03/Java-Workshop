package com.app.demo2;

public class program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sunbeam";
		String s2 = "sunbeam";
		
		StringBuffer sb1 = new StringBuffer("sunbeam");
		StringBuffer sb2 = new StringBuffer("sunbeam");
		
		System.out.println("s1==s2 - " + (s1==s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));
		
		System.out.println("s1==s2 - " + (s1==s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));	
		
		System.out.println("sb1==sb2 - " + (sb1==sb2));
		System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2)));//equals method is object class method it doesn't override	
		
		
		
}

}
