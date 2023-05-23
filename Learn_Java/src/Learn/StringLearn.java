package Learn;

public class StringLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	String str1 = "PYR"; 
	String str2 = "PYR";
	String str3 = "PYR";  // Here it is done implicitly , but with the below way it always create new instance in heap memory
	String str4 = new String("PYR"); // Here we are explicitly mentioning to create object with PYR
	
	
	System.out.println(str1==str2);
	
	/*
	Here When an string is 
	
	
	*/
	
	System.out.println(str1==str4);
	
	System.out.println(str1.equals(str4));
	
	
	}

}
