package com.app.demo5;

import java.util.Scanner;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	double marks;
	
	public Student() {
		
	}
	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public double getMarks() {
		return marks;
	}
	
	public void accept(Scanner sc) {
	
			System.out.println("Enter rollno: ");
			this.rollno = sc.nextInt();
			System.out.println("Enter name: ");
			 this.name = sc.next();
			System.out.println("Enter marks: ");
			this.marks = sc.nextDouble();
			
		}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno - o.rollno;
	}
	
}
