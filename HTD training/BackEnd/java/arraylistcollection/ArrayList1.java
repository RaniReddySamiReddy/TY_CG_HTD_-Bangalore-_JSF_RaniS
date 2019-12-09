package arraylistcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
      public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(13);
		a1.add(14);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		System.out.println("-----------FOR LOOP---------");
		for (int i = 0; i <a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("-----------FOREACHLOOP--------");
		for(Integer i1 : a1)
		{
			System.out.println(i1);
		}
		System.out.println("-------ITERATOR()-------------");
		Iterator<Integer>itr =a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----LISTITERATOR()-----------");
		ListIterator<Integer> itr1 = a1.listIterator(a1.size());
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(23);
		a2.add(24);
		System.out.println(a2);
		a2.remove(new Integer(23));
		System.out.println(a2);
	}
}
