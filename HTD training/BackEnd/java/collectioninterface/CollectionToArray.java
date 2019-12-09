package collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionToArray {
      public static void main(String[] args) {
		Collection c= new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		Object a[]=c.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
}
