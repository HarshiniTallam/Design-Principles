package com.epam.design_principles;

public class Math {
	Math(){}
	void add(double x, double y) {
		System.out.println("The sum of "+x+" and "+y+" is: "+(x + y));
	}
	void sub(double x, double y) {
		System.out.println("The difference of "+x+" and "+y+" is: "+(x - y));
	}
	void mul(double x, double y) {
		System.out.println("The multiplication of "+x+" and "+y+" is: "+(x * y));
	}
	void div(double x, double y) {
		if(y == 0) {
			throw new ArithmeticException("Division by zero error"+"\n"+"please enter proper values"+"\n");
		} else {
			System.out.println("The division of "+x+" and "+y+" is: "+(x / y));
		}
	}
}
