package com.Super;

public class Child extends Parent{
	
	
	String Name = "Yogi";

	int Age = 30;
	
	public Child() {
		super();
		super.Walk();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child C = new Child();
		C.Walk();
		
		
		
		
		
	}

	public void Walk() {
		System.out.println("Child is walking");
		System.out.println(super.Age);
		System.out.println(super.Name);
		super.Walk();
	}
	
}
