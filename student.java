package package3;
import java.util.Scanner;

public class student {
	private int rollno;
	private String name;
	private int marks;
	
	public student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Rollno: ");
		int rollno = sc.nextInt();
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		System.out.println("Enter Student Marks: ");
		int marks = sc.nextInt();
	    this.rollno = rollno;
	    this.name = name;
	     this.marks = marks;
	}

	public void display() {
		System.out.println("Student Rollno: "+ rollno);
		System.out.println("Student Name: "+ name);
		System.out.println("Student Marks: "+ marks);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(1, "Anil", 80);
		student s2 = new student(2, "Sunil", 40);
		student s3 = new student(3, "Rahil", 90);
		s1.accept();
		s1.display();
		s2.display();
		s3.display();
		
	}

}
