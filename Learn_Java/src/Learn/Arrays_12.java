package Learn;

public class Arrays_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = new int[10];
		int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);

			// Multi dimesional array

			// Multi dimension array
		}
		int[][] arrMulti = new int[2][3];

		int[][] arrMulti1 = { { 1, 2 }, { 3, 4, 5 } };
		
		System.out.println(arrMulti1[0][0]);
		System.out.println(arrMulti1[0][1]);

		System.out.println(arrMulti1[1][0]);
		System.out.println(arrMulti1[1][1]);
		System.out.println(arrMulti1[1][2]);

		for (int k = 0; k < arrMulti1.length; k++) {

			for (int L = 0; L < arrMulti1[k].length; L++) {
				System.out.println(arrMulti1[k][L]);

			}

		}

	}

}
