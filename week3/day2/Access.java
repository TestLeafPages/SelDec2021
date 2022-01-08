package week3.day2;

import week3.day1.Car;

public class Access extends Car{
	
	/*
	 * public  - Anywhere within project (inside or outside package)
	 * protected - inside package / outside (extends)
	 * default - inside package
	 * private - inside class
	 */

	
	public static void main(String[] args) {
	//	Car car = new Car();
		
		Access access = new Access();
		access.fuelType();
		
	}
}
