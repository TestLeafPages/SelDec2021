package week1.day2;

//0,1,1,2,3,5,8,13,21,34...
public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		
		int num3;
		//Generate 8 numbers
		for (int i = 1; i <= 8; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			
			//swap the numbers
			num1 = num2; // num1 = 1
			num2 = num3; // num2 = 1
		}
		
	
		
		
		
		
		
		
		
		
		

	}

}
