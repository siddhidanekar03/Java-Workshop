package com.app.demo2;

import java.util.Stack;
import java.util.Vector;

public class program01 {

	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<Integer>();
//		for(int i =1; i<=10; i++)
//			v.add(i);
//			v.add(11);
//		System.out.println("Capacity: " + v.capacity());
//		System.out.println("Size: " + v.size());
		
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(60);
		System.out.println( "Pop : "+ s.pop());
		System.out.println("Element on top: " + s.peek());
		
		
}
}
