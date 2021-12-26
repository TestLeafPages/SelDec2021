package week1.day1;

import week1.day2.Calculator;

public class ExecuteCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int add = calc.add(100, 200);
		System.out.println(add);
		double sub = calc.sub(342.342, 234.234);
		System.out.println(sub);
	}
}
