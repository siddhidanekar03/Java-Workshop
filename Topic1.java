package Practice;

public class Topic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		double num2 = num1;//widening
		
		System.out.println(num2);
		
		double num3 = 20.45;
		int num4 = (int)num3;//always use type casting
		System.out.println(num4);//Narrowing 
		
	}

}
