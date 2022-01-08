package week3.day1;

public class Car extends Vehicle{
	
	public String color;

	// fuel
	
	public void fuelType() {
		System.out.println("Fuel Type");
	}
	
	public void applyBrake() {
		System.out.println("Apply Brake from Car (ABS)");
	}
	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.fuelType();
		car.applyBrake();
		car.soundHorn();
		
		Vehicle veh = new Vehicle();
		veh.applyBrake();

		/*
		 * Vehicle veh = new Vehicle(); veh.applyBrake(); veh.soundHorn();
		 */

	}
	
}
