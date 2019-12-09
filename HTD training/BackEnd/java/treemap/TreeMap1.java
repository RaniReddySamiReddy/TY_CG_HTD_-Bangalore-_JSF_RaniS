package com.cpgmni.map.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class TreeMap1 {
	 public static void main(String[] args) {
			TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
			t1.put(8, "Rani");
			t1.put(2, "soni");
			t1.put(10, "vani");
			t1.put(6, "nani");
			Set<Map.Entry<Integer,String>> s1 = t1.entrySet();
			for (Map.Entry<Integer, String> e1 : s1) {
				System.out.println(e1.getKey());
				System.out.println(e1.getValue());
				System.out.println("------------------");
                }
			System.out.println(t1.get(8));
			System.out.println("---------------");
			System.out.println(t1.remove(2));
			System.out.println("---------------");
			System.out.println(t1);
			System.out.println("---------------");
			System.out.println(t1.containsKey(2));
			System.out.println("---------------");
			System.out.println(t1.keySet());
			System.out.println(t1);
			System.out.println("---------------");
			System.out.println(t1.entrySet());
			System.out.println("---------------");
			
			
			
	 }
}
