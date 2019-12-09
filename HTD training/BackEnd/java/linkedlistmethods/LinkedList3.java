package linkedlistmethods;

import java.util.LinkedList;

public class LinkedList3 {
      public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(56);
		l1.add(64);
		l1.add(85);
		System.out.println("------peek() and peekFirst() and peekLat()-----");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("-----poll() , pollFirst(), pollLast()-------");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("--------offer(), offerFirst(), offerLast()----------");
		
		LinkedList l2=new LinkedList();
		l2.add(23);
		l2.add(56);
		l2.add(65);
		l2.add(78);
		System.out.println(l2.offer(89));
		System.out.println(l2);
		System.out.println(l2.offerFirst(72));
		System.out.println(l2);
		System.out.println(l2.offerLast(12));
		System.out.println(l2);
	}
}
