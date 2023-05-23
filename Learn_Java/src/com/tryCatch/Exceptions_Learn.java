package com.tryCatch;

public class Exceptions_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 0;
		try {
			System.out.println(i / j);
		}

		catch (Throwable E) {
			/*
			 * 
			 * // TODO: handle exception Here Throwable is a Parent class which handles both
			 * Erros and Exceptions Exception is a sub class of Throwable
			 */
			E.printStackTrace(); // -- this method will print exception

		}
		
		finally {
			System.out.println("Finally");
			/*This block will always be executed even ther are exceptions or not
			This is mainly used in automation to clean up the test data
			*/
		}
		System.out.println("Hiiii");

	}

}
