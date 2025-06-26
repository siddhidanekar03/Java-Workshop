package Practice;
import java.util.Scanner;

public class Time {
	int hr;
	int min;
	
	void accept() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the hours:  ");
		 hr = sc.nextInt();
		System.out.println("Enter the mins: ");
		min = sc.nextInt();
		
		
	}
	void display() {
		System.out.println("Time: " + hr + " : " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		t1.accept();

	}
	
	public static void main1(String[]args) {
		Time t1;
		t1 = new Time();
		t1.accept();
		t1.display();
	}

}
