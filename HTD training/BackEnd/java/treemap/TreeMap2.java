package com.cpgmni.map.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	 public static void main(String[] args) {
		 StudentAge sa=new StudentAge();
		 System.out.println("----------------------");
			TreeMap<Student,String> h1=new TreeMap<Student,String>(sa);//we can pass reference sa or else new StudentAge() over here
			h1.put(new Student(3,"rani"),"1st standard");
			h1.put(new Student(5, "soni"),"2st standard");
			h1.put(new Student(10, "vani"),"4st standard");
			h1.put(new Student(6, "nani"),"3st standard");
			Set<Map.Entry<Student,String>> s1 = h1.entrySet();
			for (Map.Entry<Student, String> e1 : s1) {
				System.out.println(e1.getKey());
				System.out.println(e1.getValue());
				System.out.println("------------------");
			}
			System.out.println(new Student(3,"Rani"));
     }
	 }
