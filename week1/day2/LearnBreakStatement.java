package week1.day2;

public class LearnBreakStatement {

	public static void main(String[] args) {
		
		//print 3 in words -> Three
		
		//break -> stop the loop execution and go out of the loop ; exit loop
		
		for (int i = 1; i <= 5; i++) {
			
			if(i==3) {
				System.out.println("Three");
				break;
				
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("end of program");

	}

}
