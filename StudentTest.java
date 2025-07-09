package com.app.demo5;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.app.demo5.Student;


public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> l = new ArrayList<Student>();
		int choice;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add student details In Collection");
			System.out.println("2. Display Students using iterator");
			System.out.println("3. Search the Student on rollno and Display");
			System.out.println("4  Display All Students sorted on Rollno ");
			System.out.println("5. Display All Students sorted on Name ");
			System.out.println("6. Display All Students sorted on Marks ");
			
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1: Student s = new Student();
					s.accept(sc);
					l.add(s);	
				break;
				
			case 2: Iterator<Student> itr  = l.iterator();
	    	 while(itr.hasNext()) {
	    		 System.out.println(itr.next());
	    	 }
	     	break;
		
			case 3: System.out.println("Enter rollno to search");
			int search = sc.nextInt();
			boolean found = false;
			
			for(Student s1 : l ) {
				if(search == s1.getRollno()) {
					System.out.println("Student Found");
					System.out.println(s1.toString());
					found = true;
				}
			}
			if(!found) {
				System.out.println("Student Not Found");
			}
			break;
			
			case 4: Collections.sort(l);
					l.forEach(e -> System.out.println(e));
					break;
					
			case 5: l.sort((l1, l2) -> l1.getName().compareTo(l2.getName()));;
			l.forEach(e -> System.out.println(e));
			break;
					
			case 6: l.sort((l1, l2) -> Double.compare(l1.getMarks(), l2.getMarks()));
			l.forEach(e -> System.out.println(e));
			break;
			

			default:System.out.println("Wrong Choice");
				break;
			}
			
		}while(choice !=0);
	
		
		
		

	}

}
