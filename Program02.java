package com.demo3;


class Test{
//final int num1 = 10; // field initializer
final int num1;
{
//	num1 = 10;
}

public Test() {
	num1 = 10;
}

}

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num1;
		num1 = 10;
//		num1 = 20; // NOT OK
		System.out.println(num1);
	}

}
