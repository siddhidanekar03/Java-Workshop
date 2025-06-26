package package3;
import java.util.Scanner;

public class employee {
	 private int empid;
	 private String name;
	 private double salary;
	 
	 public employee() {
		 System.out.println("Parameterless Constructor->");
		 this.empid=0;
		 this.name = "";
		 this.salary= 0;
	 }
	 
	 public employee(int empid, String name, double salary) {
		 System.out.println("Parameterized Constructor ->");
		 this.empid = empid;
		 this.name = name;
		 this.salary = salary;
		 
	 }
	  public void setEmployee(int empid) {
		  if(empid < 0)
			  return;
		  this.empid = empid;
	  }
	  public int getEmployee() {
		  return empid;
	  }
	  
	  public void accept() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter empid: ");
		  int empid = sc.nextInt();
		  System.out.println("Enter Employee name: ");
		  String name = sc.next();
		  System.out.println("Enter Employee salary: ");
		  double salary = sc.nextDouble();
		  
		  this.empid=empid;
		  this.name = name;
		  this.salary = salary;
	  }
	  
	  public void display() {
		  System.out.println("Employee Id: "+ empid);
		  System.out.println("Employee Name: "+ name);
		  System.out.println("Employee Salary: "+ salary);
		  
	  }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1 = new employee();
		employee e2 = new employee(13,"Neha",50000);
		e1.accept();
		e1.display();
	    e2.display();
	
//		e1.setEmployee(2);
//		System.out.println(e1.empid);
//		System.out.println(e1.getEmployee());

	}

}
