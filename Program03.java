package com.app.demo3;

import java.util.Arrays;

public class Program03 {

	public static void main(String[] args) {
		Integer[] arr = { 20, 40 ,50, 10, 30};
		
		//short implementation of functional interface
		// lambda expression
		
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Arrays.sort(arr, (Integer o1, Integer o2)->{
			return o1 - o2;
		});
		System.out.println("after Sorting: " + Arrays.toString(arr));
			
		}

	}


