package week3.day1;

public class EmployeeDetails {
	
	int empId1;
	int empId2;
	static String employeeName;
	String companyName;
	String name;
	
	EmployeeDetails(){
		// Constructor Chaining
		this(1002, "Hari", "TL");
		System.out.println("I am in Default Constructor");
		empId1 = 100;
		employeeName = "Haja";
	}
	
	EmployeeDetails(int empId1, String employeeName, String companyName){
		System.out.println("I am in Parametrized Constructor");
		this.empId1 = empId1;
		this.employeeName = employeeName;
		this.companyName = companyName;
	}
	
	EmployeeDetails(String employeeName){
		this.employeeName = employeeName;
	}
	
	public static void getEmployeeDetails() {
		String name = "";
	//	System.out.println(empId1);
		System.out.println("Employee Details");
	}
	
	public void method2() {
		System.out.println("Method2");
	}

	
	public static void main(String[] args) {
		
		EmployeeDetails.getEmployeeDetails();
		
		  EmployeeDetails empDetails = new EmployeeDetails();
		  System.out.println(empDetails.employeeName);
	//	  empDetails.getEmployeeDetails(); empDetails.method2();
		 
		/*
		 * System.out.println(empDetails.empId1); System.out.println(empDetails.empId2);
		 * System.out.println(empDetails.employeeName);
		 */
		
		EmployeeDetails empDetails2 = new EmployeeDetails(1001, "Hari", "TestLeaf");
	//	System.out.println(empDetails2.companyName);
		System.out.println(empDetails.employeeName);
		System.out.println(empDetails2.employeeName);
	//	empDetails2.getEmployeeDetails();
		
	}
}
