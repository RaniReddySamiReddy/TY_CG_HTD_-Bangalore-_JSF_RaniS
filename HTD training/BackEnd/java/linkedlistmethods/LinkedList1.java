package linkedlistmethods;

import java.util.LinkedList;

public class LinkedList1 {
       public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(65);
        System.out.println(l1);
        l1.addFirst(45);
        System.out.println(l1);
        l1.addLast(89);
        System.out.println(l1);
        System.out.println("==========remove()=========");
        l1.remove();
        System.out.println(l1);
        System.out.println("=====removeFirst()=========");
	    l1.removeFirst();
	    l1.removeLast();
	    System.out.println(l1);
	    
	    LinkedList l2=new LinkedList();
	    l2.add(23);
	    l2.add(45);
	    l2.add(48);
	    l2.add(45);
	    l2.add(89);
	    l2.add(12);
	    System.out.println(l2);
	    l2.removeFirstOccurrence(45);
	    l2.removeLastOccurrence(45);
	    System.out.println(l2);
	    System.out.println(l2.getFirst());
	    System.out.println(l2.getLast());
       
       }
}
