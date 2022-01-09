package week3.day2;

public class MyBank extends ABCBank{
	
	public static void main(String[] args) {
		// You cannot create for an interface
	//	RBI bank = new SBI();
		RBI bank = new SBI();
		bank.minimumBalance();
	//	bank.educationalLoan();
		bank.maxLoanAmount();
		MyBank myBank = new MyBank();
		myBank.educationLoal();
	}

	public void maxLoanAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void educationLoal() {
		// TODO Auto-generated method stub
		
	}

}
