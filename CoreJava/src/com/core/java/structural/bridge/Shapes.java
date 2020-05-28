package com.core.java.structural.bridge;

public abstract class Shapes {
	
	protected DrawShapes drawShapes;
	   
	protected Shapes(DrawShapes drawshape) {
		this.drawShapes = drawshape;
	}
	   
	public abstract void draw();	
}
