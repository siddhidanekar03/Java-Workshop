package com.app.demo2;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class program01 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		System.out.println("Array Size: " + c1.size());
		System.out.println("Array contains 10: " + c1.contains(10));
		
//		for(Integer e : c1) {
//			System.out.println(e);
//		}
//		//c1.clear();
//		c1.remove(20);
//		System.out.println("Display: ");
//		
//		for(Integer e : c1) {
//			System.out.println(e);
//		}
//		
		///Using iterator
	     Iterator<Integer> itr  = c1.iterator();
	    	 while(itr.hasNext()) {
	    		 System.out.println(itr.next());
	    	 }
	     }
			
		

	

}
