package com.core.java.structural.facade;

public class ShapeMaker {

	private Shapes circle;
	private Shapes rectangle;
	private Shapes triangle;
	
	public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      triangle = new Triangle();
	}
	
	
	 public void drawCircle(){
	      circle.draw();
	 }
	   public void drawRectangle(){
	      rectangle.draw();
	 }
	   public void drawTriangle(){
		   triangle.draw();
	 }
}
