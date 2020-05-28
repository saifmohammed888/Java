package com.core.java.structural.bridge;

public class Application {

	public static void main(String[] args) {
		Shapes redCircle = new Circle(100, 100, 10,new RedCircle());
		redCircle.draw();
		Shapes greenCircle = new Circle(100, 100, 10,new GreenCircle());
		greenCircle.draw();
	}
}
