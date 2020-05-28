package com.core.java.structural.facade;

public class Application {

	public static void main(String[] args) {
		 ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawTriangle();	
	}

}
