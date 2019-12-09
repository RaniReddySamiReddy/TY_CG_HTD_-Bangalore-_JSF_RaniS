package linkedlistmethods;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListt {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		ListIterator ltr =l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
			l1.add(1);
			System.out.println(l1);
			l1.remove(new Integer(1));
			System.out.println(l1);
			System.out.println("------------for each loop--------");
			for(Object i1:l1)
			{
				System.out.println(l1);
			}
			System.out.println("--------for loop-------");
			for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));	
			}
		}
	}

