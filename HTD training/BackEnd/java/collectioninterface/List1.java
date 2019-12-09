package collectioninterface;

import java.util.ArrayList;
import java.util.List;

public class List1 {
       public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(0,12);
		l1.add(1,22);
		l1.add(2, 33);
		l1.add(3,44);
		System.out.println(l1);
		l1.add(3,60);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf(60));
		System.out.println("--------------------------");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("--------------------------");
		List l2=new ArrayList();
		l2.add(15);
		l2.add(25);
		l2.add(35);
		
		List l3=new ArrayList();
		l3.add(45);
		l3.add(89);
		l3.add(66);
		System.out.println(l2);
		System.out.println(l3);
		l2.addAll(1,l3);
		System.out.println(l2);
		System.out.println("--------------------------");
		
		List l4=new ArrayList();
		l4.add(45);
		l4.add(55);
		l4.add(66);
		l4.set(1, 100000);
		System.out.println(l4);
		
		List l5=new ArrayList();
		l5.add(45);
		l5.add(55);
		l5.add(66);
		
		List l6=l5.subList(0, 2);
		System.out.println(l6);
	}
}
