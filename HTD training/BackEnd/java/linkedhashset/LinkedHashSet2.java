package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
   	 LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
   	 lh.add(12);
   	 lh.add(13);
   	 lh.add(14);
   	 lh.add(12);
   	 lh.add(null);
   	 Iterator<Integer> itr=lh.iterator();
	   while(itr.hasNext())
	    {
	    System.out.println(itr.next());	 
	    }
	}
}
