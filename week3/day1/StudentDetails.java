package week3.day1;

public class StudentDetails {

	// Overloading
	public void getStudentDetails(String name) {

	}
	
	public void getStudentDetails(int id) {
		System.out.println("Details of "+id);
	}

	public void getStudentDetails(int id, int age, String name) {
		System.out.println("With Age"+id+" "+ age+" "+name);
	}

	public void getStudentDetails(int id, String name) {
		System.out.println("Details of "+id+" - "+ name);
	}
	
	public void getStudentDetails(String name, int id) {

	}
	
	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		student.getStudentDetails(100);
		student.getStudentDetails(100, "Haja");
		student.getStudentDetails(102, 30, "ABC");
	}
}
