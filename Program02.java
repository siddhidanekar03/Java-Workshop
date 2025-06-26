package com.demo4;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] arr = new Employee[5];
		
		arr[0] = new Salesman();
		arr[1] = new Manager();
		arr[2] = new Salesman();
		arr[3] = new Manager();
		arr[4] = new Salesman();
		
	for(int i =0 ; i < 5; i++) {
		System.out.println(arr[i]);
		
	}
		

	}

}
