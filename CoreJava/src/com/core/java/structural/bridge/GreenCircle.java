package com.core.java.structural.bridge;

public class GreenCircle implements DrawShapes{
	
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing a Green circle of radius "+radius+" at positions "+x+" "+y);
	}
}
