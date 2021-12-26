package week1.day1;

//syso -> cntrl+space, the enter
//method -> cntrl+space, then enter
//main -> cntrl+space, then enter

//accessSpecifier keyword ClassName
public class Car {
	String carModel = "xcent";

	
	public static void main(String[] args) {
		// ClassName objectName = new ClassName()
		Car myCar = new Car();

		// use the object to call the method
		myCar.applyBrake();
		myCar.driveCar();
		
		System.out.println(myCar.carModel);

	}
	
	//accessSpecifier returnType methodName() {}	
		public void driveCar() {
			String driverName = "Hari";
			System.out.println("first method - drive car");
			System.out.println(carModel);
			System.out.println(driverName);
		}
		
		public void applyBrake() {
			System.out.println("applied brake");
			System.out.println(carModel);
			
		}

}
