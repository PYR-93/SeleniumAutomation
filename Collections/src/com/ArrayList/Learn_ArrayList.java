package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Learn_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList AR = new ArrayList();
		
		//Generics
		//ArrayList<String> AR = new ArrayList<String>();
		// To add into array List
		AR.add(10);
		AR.add(11);
		AR.add("Yogi");
		AR.add(true);

		System.out.println(AR.get(1));

		// To remove
		AR.remove(0);
		System.out.println("Removed a value from ArrayList");

		// To Fetch

		AR.get(2);
		System.out.println("Fetch a value from ArrayList");
		// To Iterate

		for (int i = 0; i < AR.size(); i++) {

			System.out.println(AR.get(i));
		}

		// To Iterate using for each

		for (Object obj : AR) {
			System.out.println(obj);
		}

		//To Iterate using Iterator
	Iterator I = AR.iterator();
	while (I.hasNext()) {
		System.out.println(I.next());
	}
		
	}

}
