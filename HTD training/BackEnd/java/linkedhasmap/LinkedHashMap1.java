package com.cpgmni.map.linkedhasmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
     public static void main(String[] args) {
    	 LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
    	 l1.put("BTM", 560078);
    	 l1.put("RAJAJI NAGAR", 680078);
    	 l1.put("BTR", 583078);
    	 l1.put(null, null);
    	 l1.put(null,765545);
    	 Set<Map.Entry<String,Integer>> s1=l1.entrySet();
    	 for (Map.Entry<String, Integer> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println(e1.getClass());
			System.out.println("-------------");
		}
	}
}
