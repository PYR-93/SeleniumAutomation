package com.Polymorphism.java;

public class MethodOverriding extends Animal {
//The purpose of this call is CAT Animal behaviour
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding CAT = new MethodOverriding();
		CAT.makeNoise();
		CAT.makeNoise(3);
		// All Animals will not make same noise so here we
		// need to override the method in such a way we get dsired output

	}

	public void makeNoise() {

		System.out.println("Meyow meyow");
	}

	public void makeNoise(int i) {

		System.out.println("Meyow meyow int i");
	}
	/*
	 * This is also know as Dynamic binding/Run time polymorphism/Methos ovverriding
	 * Is possible only through inheritance The method name and the signature of the
	 * method should be same same as is how it is declared in the parent class as it
	 * is we need to use *
	 * 
	 * 
	 */

}
