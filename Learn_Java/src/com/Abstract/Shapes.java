package com.Abstract;

public abstract class Shapes {

	public abstract void drawingShape();

	public abstract void colorShape();

	public abstract void moveShape();
	
	public void deleteShape(){
		System.out.println("Deleting shape");
	}

}

/*
 * The boody will not be present if the method is named as abstract
 * and if even single method is name as abstract then class also must be abstract
 * Abstract class can have normal methods as well
 */
