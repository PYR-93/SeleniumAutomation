package com.Polymorphism.java;

public class LoginPage {

	public static void main(String[] args) {
		
		
		LoginPage L1=new LoginPage();
		// TODO Auto-generated method stub
		
		L1.loginpage(20, 70);

	}
/* Method overloading or static binding or compile time polymorphism 
 * is possible with sam method name but atleast one different parameters 
 *  
 *  
 *  
 *  */
	public void loginpage(String Username, int password) {

		System.out.println(Username + " " + password);

	}

	public void loginpage(byte age, int password) {

		System.out.println(age + " " + password);

	}

	public void loginpage(int phonenum, int password) {

		System.out.println(phonenum + " " + password);

	}

}
