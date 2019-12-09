package com.cpgmni.map.linkedhasmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {
	public static void main(String[] args) {
   	 LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
   	 l1.put(12,new Employee(23000,"Divya"));
   	 l1.put(13,new Employee(53000,"Shravya"));
   	 l1.put(56,new Employee(73000,"Sirisha"));
   	 System.out.println(l1.get(56));
   	 System.out.println("-----------");
   	 Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
   	 for (Map.Entry<Integer,Employee> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println(e1.getClass());
			System.out.println("-------------");
}
   	 System.out.println("linkedhashmap is empty: "+l1.isEmpty());
   	 
   	 System.out.println("linkedhashmap contains this value: "+l1.containsKey(54));
}
}