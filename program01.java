package com.app.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program01 {

	
	
	public static void main(String[] args) {
		List<String>l1 = new ArrayList<>();
		l1.add("Anil");
		l1.add("Siya");
		l1.add("Neha");
		l1.add("Ram");
		l1.add("Sham");
		
		System.out.println("Display: ");
		for(String s : l1) {
			System.out.println(s);
		}
		
//		System.out.println("Index of Ram: " + l1.indexOf("Ram"));
//		System.out.println("Element at index 3: " + l1.get(3));
//		System.out.println("Last index: "  + l1.lastIndexOf("Siya"));
		
		Collections.sort(l1);
		System.out.println("Display: ");
		for(String s : l1) {
			System.out.println(s);
		}

	}

}
