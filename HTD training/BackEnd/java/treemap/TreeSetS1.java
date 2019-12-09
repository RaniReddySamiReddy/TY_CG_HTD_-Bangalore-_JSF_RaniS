package com.cpgmni.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetS1 {
    public static void main(String[] args) {
		TreeMap <String,ArrayList<Student>>t1=new TreeMap<String,ArrayList<Student>>();
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(20,"divya"));
		a1.add(new Student(20,"shravya"));
		a1.add(new Student(20,"kavya"));
		t1.put("eng 1st yr", a1);
		System.out.println("enginnering 1st yr");
		Set<Map.Entry<String, ArrayList<Student>>> s1=t1.entrySet();
		for (Map.Entry<String, ArrayList<Student>> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------------------");
		}
	}
}
