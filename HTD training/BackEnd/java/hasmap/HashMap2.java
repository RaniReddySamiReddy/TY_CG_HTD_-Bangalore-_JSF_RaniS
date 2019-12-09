package com.cpgmni.map.hasmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
		HashMap<Integer,Student> h1 = new HashMap<Integer,Student>();
		h1.put(56,new Student(23,"Rani"));
		h1.put(16,new Student(33,"soni"));
		h1.put(26,new Student(53,"nani"));
		h1.put(null, null);
		h1.put(56, new Student(89,"Rani"));
		Collection<Student> c1=h1.values();
		for(Student s1:c1)
		{
			System.out.println(s1);
		}
		System.out.println(h1.containsKey(56));
		System.out.println(h1.containsValue(new Student(26,"nani")));
		System.out.println(h1.size());
	}
}
