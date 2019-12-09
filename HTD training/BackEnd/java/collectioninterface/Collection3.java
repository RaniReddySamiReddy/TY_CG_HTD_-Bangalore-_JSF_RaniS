package collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
      public static void main(String[] args) {
		Collection c1=new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        
        Collection c2=new ArrayList();
        c2.add(4);
        c2.add(2);
        c2.add(5);
        c2.add(3);
        System.out.println(c1);
        System.out.println("----------add all-----------");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println("------------------------------");
        Collection c3=new ArrayList();
        c3.add(11);
        c3.add(12);
        c3.add(13);
        c3.add(17);
        
        Collection c4=new ArrayList();
        c4.add(11);
        c4.add(21);
        c4.add(5);
        c4.add(13);
        System.out.println(c3);
        System.out.println("----------removeall-----------");
        c3.removeAll(c4);
        System.out.println(c3);
        System.out.println("-------retainall--------------");
        c3.retainAll(c4);
        System.out.println("--------containsall----------");
        c3.containsAll(c4);
        System.out.println(c3);
        System.out.println("-------clear------------------");
        c4.clear();
        System.out.println(c4);
        
	}
}
