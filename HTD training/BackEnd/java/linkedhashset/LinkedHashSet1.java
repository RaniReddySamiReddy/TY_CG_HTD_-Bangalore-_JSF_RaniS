package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
     public static void main(String[] args) {
    	 LinkedHashSet lh=new LinkedHashSet();
    	 lh.add(12);
    	 lh.add(13);
    	 lh.add(14);
    	 lh.add(12);
    	 lh.add(null);
    	 
    	 Iterator itr=lh.iterator();
    	 while(itr.hasNext())
    	 {
    	   System.out.println(itr.next());	 
    	 }
	}
}
