package com.app.dkte;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee [] emp = new Employee[10];
		int choice;
		int index = 0;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Search Employee by Id");
			System.out.println("4. Display Employees joined in given Year:");
			System.out.println("5. Find Employee with Maximum Salary:");
			System.out.println("6. Find Employee with Minimum Salary");
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
		
		
		switch (choice) {
		case 1: System.out.println("1. Add Employee");
			if(index < 10) {
				emp[index] = new Employee();
				emp[index].acceptEmployee(sc);
				index++;
			}else {
				System.out.println("Array is Full");
			}
			break;
			
		case 2: System.out.println("2. Display Employee");
		         for(Employee e1 : emp) {
		        	 if(e1 != null) {
		        		 System.out.println(e1.toString());
		        	 }
		         }
		         break;
		         
		case 3: System.out.println("3. Search Employee by Id");
				System.out.println("Enter Employee Id to search");
				int search = sc.nextInt();
				boolean found = false;
				for(Employee e1 : emp) {
					if(e1 != null && e1.getEmpid() == search) {
						System.out.println("Employee Found");
						e1.toString();
						found = true;
						break;
					}
					if(!found) {
						System.out.println("Employee not found");
					}
				}
				break;
				
		case 4: System.out.println("4. Display Employees joined in given Year:");
			     System.out.println("Enter the year: ");
			     int year = sc.nextInt();
			     boolean match = false;
			     for(Employee e1 : emp) {
			    	 if(e1 != null && e1.getDateOfJoining().getYear() == year) {
			    		 e1.toString();
			    		 match = true;
			    		 break;
			    		 }
			    	 if(!match) {
			    		 System.out.println("Not found");
			    	 }
			     }
			     break;
			     
		case 5: System.out.println("5. Find Employee with Maximum Salary:");
		           double maxSalary = Double.MIN_VALUE;
		           Employee maxEmp = null;
		            for (Employee e1 : emp) {
			        if (e1 != null && maxSalary < e1.getSalary()) {
				     maxSalary = e1.getSalary();
				     maxEmp = e1;
			       }
		     }
		        if (maxEmp != null) {
			        System.out.println("Employee with Maximum Salary: " + maxEmp);
		        }
		        else {
			         System.out.println("Employee Not found");
		        }
		break;
		
		case 6: System.out.println("6. Find Employee with Minimum Salary");
			    double minSalary = Double.MAX_VALUE;
			    Employee minEmp = null;
			    for(Employee e1 : emp) {
			    	if(e1 != null && minSalary > e1.getSalary()) {
			    		minSalary = e1.getSalary();
			    		minEmp = e1;
			    	}
			    }
			    
			    if(minEmp != null) {
			    	System.out.println("Employee with Minimum Salary: " + minEmp);
			    }else {
			    	System.out.println("Employee not found");
			    }
			    break;
		case 0 : System.out.println("Exit");
		break;
		             
		

		default:System.out.println("Wrong Choice");
			break;
		}
	}while(choice !=0 );
	}

}
