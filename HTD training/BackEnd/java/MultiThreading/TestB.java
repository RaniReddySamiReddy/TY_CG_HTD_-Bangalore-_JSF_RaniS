package com.cg.thread.creatingthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {
     public static void main(String[] args) {
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		a1.add(24);
		a1.add(36);
		a1.add(25);
		a1.add(37);
		a1.add(85);
		System.out.println("-----EVEN NUMBERS by using filter------");
		List<Integer> l1 = a1.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println("-----ODD NUMBERS by using filter------");
		List<Integer> l2 = a1.stream().filter(i -> i%2 !=0).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("-----TO MODIFY THE DATA using map------");
		List<Integer> l3 = a1.stream().map(i -> i*100).collect(Collectors.toList());
		System.out.println(l3);
		
		Optional<Integer> o = a1.stream().max((i,j) -> i.compareTo(j));
		System.out.println(o);
		
	}
}
