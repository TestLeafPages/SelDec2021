package week1.day1;

public class LearnIfCondition {

	public static void main(String[] args) {

		int age = 10;
		
		//to compare
		if(age >= 60) {
			System.out.println("Senior Citizen");
		}
		else if(age > 18 && age < 60) {
			System.out.println("adult");
		}else {
			System.out.println("minor");
		}

	}

}
