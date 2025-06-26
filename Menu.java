package com.sunbeam;
import java.util.Scanner;

public class Menu {
	int rollno;
	String name;
	double marks;
	
	public Menu() {
		
	}
	
	public Menu(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public static int menu(Scanner sc) {
		System.out.println("-----------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Display Student");
		System.out.println("3. Find Student");
		System.out.print("Enter your choice:- ");
		int choice = sc.nextInt();
		System.out.println("-----------------");
		return choice;
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter the Student Roll no. : ");
		this.rollno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Student Name : ");
		this.name = sc.nextLine();
		System.out.print("Enter the Student Marks : ");
		this.marks = sc.nextDouble();
	}
	public int getRollno() {
		return this.rollno;
	}
	
	
	public void display() {
		System.out.println("Roll no.: " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Marks: " + marks);
		System.out.println("--------");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu[] arr = new Menu[5];
		int index = 0;
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Add Student");
				if (index < 5) {
					arr[index] = new Menu();
					arr[index].accept(sc);
					index++;
				} else
					System.out.println("Course is full");
				break;
				
			case 2:
				System.out.println("Display Student Info");
				for (Menu s : arr)
					if (s != null)
						s.display();
				
				break;
				
			case 3:
				System.out.println("Find Student");
				System.out.println("Enter Roll no. to search: ");
				int search = sc.nextInt();
				boolean found = false;
				for (Menu s : arr) {
					if (s != null && s.getRollno() == search) {
						System.out.println("Student Found");
						s.display();
						found = true;
						break;
					}
				}
					if(!found){
						System.out.println("Not Found");
					}
					
				
			break;
			
			default:
				System.out.println("Wrong choice..");
				break;
			}
		}

	}

	

}
