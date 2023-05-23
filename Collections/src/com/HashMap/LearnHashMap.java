package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LearnHashMap {

	public static void main(String[] args) {

		
		HashMap<String, String> hm1 = new HashMap<>();
//		To add Key and value pair use put method
		hm1.put("QA", "www.qa.com");
		hm1.put("Sandbox", "www.Sandbox.com");
		hm1.put("Prod", "www.Prod.com");
		hm1.put("UAT", "www.UAT.com");
		
		System.out.println(hm1.keySet());
		
//		to remove use 
		hm1.remove("QA");
		
		
		System.out.println(hm1.keySet());
		Set S = hm1.keySet();
//		To Iterate 
		for (String K: hm1.keySet()) {
			
			System.out.println("The Key is "+K+" The value is "+hm1.get(K));
			
		}
		
		Iterator<String> ITR = S.iterator();
		while (ITR.hasNext()) {
			String key = ITR.next();
			System.out.println("The Key is "+key+" The value is "+hm1.get(key));
		}
		

	}

}
