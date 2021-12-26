package week1.day2;

public class LearnContinueStatement {

	public static void main(String[] args) {
		
		//print 3 in words -> Three
		
		//continue -> stop the current iteration and continue with the next iteration
		
		for (int i = 1; i <= 5; i++) {
			
			if(i==3) {
				System.out.println("Three");
				continue;
			}
			
			System.out.println(i);
			
		}

	}

}
