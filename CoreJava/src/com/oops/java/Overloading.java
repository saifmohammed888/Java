package com.oops.java;

public class Overloading {

	public static void main(String[] args) {
		Overloading overloadObject = new Overloading();

		int total = overloadObject.sum(10, 20);
		int total1 = overloadObject.sum(10, 20, 30);
		double total4 = overloadObject.sum(20.5, 10);
		double total2 = overloadObject.sum(1.2, 1.2);

		System.out.println(total4);
		System.out.println(total2);
		System.out.println(total1);
		System.out.println(total);
	}

	// Method1 with order of parameters
	double sum(float a, int b) {
		return a + b;
	}

	// Method2 with 2 parameters
	int sum(int a, int b) {
		return a + b;
	}

	// Method3 with 3 parameters
	int sum(int a, int b, int c) {
		return a + b + c;
	}

	// Method4 with different type parameters
	double sum(double a, double b) {
		return a + b;
	}
}
