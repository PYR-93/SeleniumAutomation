package com.Constructors;

public class ConstructorsLearn {
	
	/*
	 * The constructor doesnot have any return type
	 * Default constructor is implicitly called 
	 * if not constructor is mentioned expicitly
	 * 
	 * */
	public ConstructorsLearn() {
		System.out.println("Default constructor");
	}
	
	public ConstructorsLearn(int i) {
		System.out.println("1 arg constructor");
	}
	public ConstructorsLearn(int i, int j) {
		System.out.println("2 args constructor");
	}
	public ConstructorsLearn(String s) {
		System.out.println("String constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorsLearn CO = new ConstructorsLearn();
		ConstructorsLearn CO1 = new ConstructorsLearn("String");

	}

}
