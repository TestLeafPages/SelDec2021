package week1.day1;

//shortcut for execution -> cntrl+F11
public class Mobile {

	String mobileModel = "MI Note5";
	int mobileWeight = 100;
	boolean isFullCharge = true;
	double mobileCost = 12000.56;
	
	
	public void makeCall() {
		System.out.println("Call connected");

	}

	public void sendMsg() {
		System.out.println("Message sent");

	}

	public static void main(String[] args) {

		Mobile mob = new Mobile();
				
		mob.makeCall();
		mob.sendMsg();
		
			
		System.out.println(mob.mobileWeight);
		System.out.println(mob.mobileModel);
		System.out.println(mob.isFullCharge);
		System.out.println(mob.mobileCost);
		
		
		
		
		
		
		
		
		

	}

}
