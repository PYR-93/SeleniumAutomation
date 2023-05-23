package Learn;

public class ForLoop_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;

		for (i = 0; i <= 10; i++) {

			System.out.println("The value of 1st loop 'i' is " + i);

		}

		// Other way of usig
		System.out.println("The value of 'i' is " + i);
		for (; i <= 10; i++) {
			System.out.println("The value of 2nd loop'i' is " + i);
		}

		// other way is to have 2 semoicolans its mandattory
		for (;;) {
			break;
		}
	}

}
