package com.Abstract;

public class Circle extends Shapes{
	/*
	 * If any one want to inherit child class which is abstract then what ever 
	 * uniimpplemented methods which are abstract methods needs to be overriden
	
		*Here Circle calss is a concrete class 
		*Abstract methods should be overriden by first concrete class
		*Which inherits abstract class
		*/
	
	
	
	
	public static void main(String[] args) {
		
		Circle CI = new Circle();
		
		CI.colorShape();
		CI.drawingShape();
		CI.moveShape();
		CI.deleteShape();
		

	}

	@Override
	public void drawingShape() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Drawing Color");
		
	}

	@Override
	public void moveShape() {
		
		System.out.println("Moving Shape");
	}
	
	@Override
	public void deleteShape() {
		System.out.println("Am Deleting it");
	}

}
