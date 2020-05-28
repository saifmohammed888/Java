package com.core.java.structural.decorator;

public abstract class ShapeDecorator implements Shapes {

	protected Shapes decoratedShape;
	
	public ShapeDecorator(Shapes decoratedShape) {
		this.decoratedShape=decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}	
}
	