package com.skilling.java.core;

public class OperatorClass {

	public static void main(String[] args) {
		OperatorClass opObject = new OperatorClass();
		opObject.arithmeticOperator();
		opObject.unaryOperator();
		opObject.assignmentOperator();
		opObject.relationalOperator();
		opObject.logicalOperator();
		opObject.terniaryOperator();
		opObject.bitwiseOperator();
		opObject.shiftOperator();
		opObject.shiftOperator();

	}

	private void shiftOperator() {
		int a = 0x0005;

		System.out.println("Left shift a<<2 is like multiplying by 2 :" + (a << 2));
		System.out.println("Left shift a>>2 is like dividing by 2 :" + (a >> 2));
	}

	private void bitwiseOperator() {
		int a = 0x0005;
		int b = 0x0007;

		System.out.println("Bitwise AND value of a and b " + (a & b));
		System.out.println("Bitwise OR value of a and b " + (a | b));
		System.out.println("Bitwise XOR value of a and b " + (a ^ b));
		System.out.println("Bitwise Complement value of a " + (~a));
	}

	private void terniaryOperator() {

		String name = ((10 > 20) ? "Mohammed Saif" : "Saif");
		System.out.println("Terniary Operator getting name " + name);
	}

	private void logicalOperator() {

		String name = "Mohammed Saif";
		int age = 24;

		if (name.equalsIgnoreCase("Mohammed Saif") && age == 24) {
			System.out.println("Logical operator AND");
		}

		if (name.contains("Saif") || age == 24) {
			System.out.println("Logical Operator OR");
		}
	}

	private void assignmentOperator() {
		int i = 10;
		System.out.println("Value assigned to i: " + i);

	}

	private void unaryOperator() {

		// unary ++
		int i = 0;
		System.out.println("Pre Increment :" + (++i));

		System.out.println("Post Increment: " + (i++));

		// Unary --
		System.out.println("Pre Decrement " + (--i));

		System.out.println("Post Decrement " + (i--));
	}

	private void arithmeticOperator() {

		// Addition
		System.out.println("Adding 10 and 15	=" + (10 + 15));

		// Subtraction
		System.out.println("Subtracting 20 and 15	=" + (20 - 15));

		// Multiplication
		System.out.println("Multiplying 20 and 19	=" + (20 * 19));

		// Division
		System.out.println("Dividing 100 and 10	=" + (100 / 10));

	}

	private void relationalOperator() {
		int i = 10;
		int j = 20;

		if (j < j) {
			System.out.println("Relational Operator Greater than and less than");
		}

		if (i == 10) {
			System.out.println("Relatinal Operator Equal to");
		}
	}
}
