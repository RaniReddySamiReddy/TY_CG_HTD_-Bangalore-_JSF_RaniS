package linkedlistmethods;

import java.util.LinkedList;

public class LinkedList4 {
       public static void main(String[] args) {
		  LinkedList l1= new LinkedList();
		  l1.add(12);
		  l1.add(13);
		  l1.add(14);
		  l1.add(15);
		  l1.push(67);
		  System.out.println(l1);
		  System.out.println("------");
		  l1.pop();
		  System.out.println(l1);
		  System.out.println(l1.element());
		  System.out.println(l1);
	}
}
