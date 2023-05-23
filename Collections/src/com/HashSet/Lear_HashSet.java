package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Lear_HashSet {

	public static void main(String[] args) {

		HashSet<Integer> hashDemo = new HashSet<Integer>();

		hashDemo.add(10);
		hashDemo.add(20);
		hashDemo.add(30);
		hashDemo.add(40);
		hashDemo.add(50);
		hashDemo.add(50); // Duplicate vvalue

		System.out.println(hashDemo);
		// Output -[50, 20, 40, 10, 30] Which is unindexed

		//To Remove we need to give object value
		hashDemo.remove(10);
		//Iterator concepts
		Iterator ITR = hashDemo.iterator();
		
		while (ITR.hasNext()) {
			System.out.println(ITR.next());
		}
		
		//For each
		for (Integer obj:hashDemo)
			
		{
			System.out.println(obj);
		}
		
		System.out.println(hashDemo.contains(20));
		
	}

}
