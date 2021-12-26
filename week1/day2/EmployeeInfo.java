package week1.day2;

public class EmployeeInfo {
	
	//pass name -> "Hari" ; empId -> 100
	
	public void getEmployeeDetails(String empName, int empId) {
		System.out.println(empName+" "+empId);
	}
	

	public void printCompanyAddress() {
		System.out.println("Chennai");

	}
	
	
	public String getCompanyAddress() {
		System.out.println("I am giving company address");
		
		return "Chennai";
	}
	
	

	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo();
		
		String name = "Hari";
		
		ei.getEmployeeDetails(name,100);
		
		//ei.printCompanyAddress();
		
		//System.out.println(ei.getCompanyAddress());
		
		//String address = ei.getCompanyAddress();
		//System.out.println(address);
		
	//	String companyAddress = ei.getCompanyAddress(); //cntrl+2 , press L
		
		
		//String address = ei.getCompanyAddress();
		//System.out.println(address);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
