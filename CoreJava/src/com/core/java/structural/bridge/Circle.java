package com.core.java.structural.bridge;

public class Circle extends Shapes{

	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawShapes drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	@Override
	public void draw() {
	      drawShapes.drawCircle(radius,x,y);
	}
	
}
