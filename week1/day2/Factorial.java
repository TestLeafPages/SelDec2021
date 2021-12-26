package week1.day2;

//Factorial of 5 -> 1*2*3*4*5 = 120

public class Factorial {
	

	public static void main(String[] args) {
		int input = 5;
		
		int fact = 1; //initial value for the result 
		
		for (int i = 1; i <= input; i++) {
			
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		
		
		
		
		
		
		

	}

}
