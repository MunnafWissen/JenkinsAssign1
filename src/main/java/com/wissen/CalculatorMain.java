package com.wissen;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("addition of 5 and 8 is "+cal.add(5, 8));
		System.out.println("substraction of 5 and 8 is "+cal.sub(5, 8));
		System.out.println("multiplication of 5 and 8 is "+cal.mul(5, 8));
		System.out.println("Division of 5 and 8 is "+cal.div(5, 8));
		System.out.println("Thank you");
		
	}
}
