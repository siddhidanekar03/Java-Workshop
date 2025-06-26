package package3;

public class program1 {
//     public static void add(int num1, int num2)// number of parameters
	//{
//    	 System.out.println("Addition: "+ (num1 + num2));
//     }
//     public static void add(int num1, int num2, int num3) {
//    	 System.out.println("Addition: "+ (num1 + num2 + num3));
//     }
//	public static void square(int num1)//type pf parameter
//	{
//		System.out.println("Square: "+(num1 * num1));
//	}
//	public static void square(double num1)//type pf parameter
//	{
//		System.out.println("Square: "+(num1 * num1));
//	}
     public static void division(int n, double d) {
    	System.out.println("Division: " + (n / d));
     }
     public static void division(double n, int d) {
     	System.out.println("Division: " + (n / d));
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		add(10,20);
//		add(10, 20, 30);
		
//		square(5);
//		square(25.5);
		
		division(10,5.5);
		division(10.2,5);
		

	}

}
