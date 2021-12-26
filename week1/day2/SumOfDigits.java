package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 246; // 2+4+6 ->12
		
		int sum = 0; // in addition - initial value should be 0
		
		while(input > 0) {
			int rem = input % 10;
			
			sum = sum + rem; // 0+6+4
			
			input = input / 10; // 246 / 10 -> 24
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}
