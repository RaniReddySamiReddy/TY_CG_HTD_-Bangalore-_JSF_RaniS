package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {
	public static void main(String[] args) {
	LinkedHashSet<TestLinkedHashSet3> lh=new LinkedHashSet<TestLinkedHashSet3>();
	lh.add(new TestLinkedHashSet3(22,"Ramu"));
	lh.add(new TestLinkedHashSet3(23,"Rony"));
	lh.add(new TestLinkedHashSet3(22,"Ramu"));
	lh.add(new TestLinkedHashSet3(21,"Gundu"));
	Iterator itr=lh.iterator();
	   while(itr.hasNext())
	    {
	    System.out.println(itr.next());	
	    }
	}
}
	
