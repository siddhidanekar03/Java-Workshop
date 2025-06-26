package package3;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = new int[5];
//	       Scanner sc = new Scanner(System.in);
//	       for(int i=0; i < arr.length; i++) {
//	    	   arr[i]=sc.nextInt();
//	       }
	       
//	       for(int i=0; i < arr.length; i++) {
//	    	   System.out.println("Array: "+ arr[i]);
//	    	   
//	       }
	       
//	       for(int element : arr) {
//	    	   System.out.println("Elements: "+ element);
//	       }
//	       
		
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();			}
		}
		
		for(int[] element : arr) {
			for(int e : element) {
				System.out.println("Element: " + e);
			}
		}

	}

}
