package com.core.java.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shapes circle) {
		 super(circle);	
	}
	
	public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }

	private void setRedBorder(Shapes decoratedShape){
	      System.out.println("Border Color: Red");
	}
	
}
