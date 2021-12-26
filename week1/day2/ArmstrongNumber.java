package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153; // (1*1*1)+(5*5*5)+(3*3*3) -> 153
		
		int orgNum = input;
		
		int sum = 0; // in addition - initial value should be 0
		
		while(input > 0) { 
			int rem = input % 10; 
			
			sum = sum + (rem*rem*rem); // 0+ (3*3*3)
			
			input = input / 10; // 153 / 10 -> 15
			
		}
		
		if(sum == orgNum) {
			System.out.println("Given number is armstrong");
		}else {
			System.out.println("Given number is not armstrong");
		}
		
		
		
		
		
		
		
		

	}

}
