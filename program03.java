package com.app.demo2;
import java.util.Comparator;
import java.util.Arrays;

public class program03 {

	public static void main(String[] args) {
		
		Integer arr[] = {30, 20, 40, 50, 10};
		
		//Anonymous inner class 
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
			
		};
		
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Arrays.sort(arr, comparator);
		System.out.println("After Sorting: " + Arrays.toString(arr));
		
		
		

	}

}
