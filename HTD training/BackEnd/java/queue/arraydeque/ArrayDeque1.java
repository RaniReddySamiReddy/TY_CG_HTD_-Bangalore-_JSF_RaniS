package com.cpgmni.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
     public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		a1.add(25);
		a1.add(2);
		a1.addFirst(95);
		a1.offerLast(76);
		a1.add(4);
		a1.add(35);
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayDeque a2=new ArrayDeque();
	}
}
