package Learn;

public class OperatorsLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number1 = 20;
		int Number2 = 20; // '=' is an assignment operator
		int Number3 = 20;

		// Arithmetic operators

		System.out.println((Number1 + Number2)); // Add

		System.out.println((Number1 - Number2)); // Sub
		System.out.println((Number1 * Number2)); // Multiply
		System.out.println((Number1 % Number2)); // Remainder
		System.out.println((Number1 / Number2)); // Divide

		// Unary Operators like ( + - ++ -- !)
		// ++ Means increment by1
		// -- Means decrement by -1
		// ! Negate the value of boolean

		int num1 = +30;
		int num2 = -40;
		int num3 = 70;
		num3++;
		num2--;
		boolean B = true;
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(!B);

		// Equiality and relational Operators (== >= <= < > !=)
		if (num1 == num2) {
			System.out.println("Both numbers are equal");

		} else if (num1 > num2) {
			System.out.println("Number is greater");

		} else {
			System.out.println("Not euqal");
		}

	}

}
