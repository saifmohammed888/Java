package com.core.java.structural.decorator;

public class Application {

	public static void main(String[] args) {

		  Shapes circle = new Circle();

	      Shapes redCircle = new RedShapeDecorator(new Circle());

	      Shapes redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();    
	}
}
