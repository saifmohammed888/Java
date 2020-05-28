package com.core.java.structural.bridge;

public class RedCircle implements DrawShapes {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing a Red circle of radius "+radius+" at positions "+x+" "+y);
	}

}
