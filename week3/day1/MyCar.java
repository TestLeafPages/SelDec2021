package week3.day1;

public class MyCar extends Car{
	// Multiple Inheritance is not supported in Java - Ambiguity issue / Diamond Problem
	
	/*
	 * MyCar extends Car extends Vehicle
	 */
	
	public void color() {
		
	}
	
	/*
	 * public void applyBrake() {
	 * System.out.println("Apply Brake from Car (ABS) from My Car"); }
	 */

	public static void main(String[] args) {
		Car car = new Car();
		MyCar myCar = new MyCar();
		myCar.color();
		myCar.applyBrake();
		car.fuelType();
		car.applyBrake();
		car.soundHorn();
		
		car.applyBrake();
		
		Vehicle veh = new Vehicle();
		veh.applyBrake();

		/*
		 * Vehicle veh = new Vehicle(); veh.applyBrake(); veh.soundHorn();
		 */

	}
}
