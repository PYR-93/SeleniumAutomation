package Learn;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=20,num2=30,num3=40;
		
		
		if (num1==num2) {
			System.out.println("Both equal");
		}
		else {
			System.out.println("Both noot equal");
		}
		
		/// Variable z = (Condition) True Expression : False expression
		
		String Str = (num1==num2) ? "Both equal":"Both noot equal";
		System.out.println(Str);

	}

}
