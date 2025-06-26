package com.sunbeam;

public class Course {
	
	String studentName;
	 public Course(String studentName) {
		 this.studentName = studentName;
	 }
	 
	 public void display() {
		 System.out.println("Student Name: " + studentName);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course [][] studentList = new Course[2][];
		studentList[0] = new Course[6];
		studentList[1] = new Course[3];
		
		studentList[0][0] = new Course("Neha");
		studentList[0][1] = new Course("Shreya");
		studentList[0][2] = new Course("Kiran");
		studentList[0][3] = new Course("Kumar");
		studentList[0][4] = new Course("Anuja");
		studentList[0][5] = new Course("Karan");
		studentList[1][0] = new Course("Siddhi");
		studentList[1][1] = new Course("Vansh");
		studentList[1][2] = new Course("Geeta");
		
		for(int i=0; i< studentList.length;i++) {
			if(i==0) {
			System.out.println("The names of students in Data Science Course: ");{
				for(int j=0; j<studentList[i].length; j++) {
					
					studentList[i][j].display();
					
				}
				System.out.println("---------");
			}
			}
			else {
				System.out.println("The names of students in Computer Science Course: ");{
					for(int j=0; j<studentList[i].length; j++) {
						
						studentList[i][j].display();
						
					}
					System.out.println("---------");
				}
			}
		}
		
	}

}
