package hashset;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(null);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		hs.add(13);
		hs.add(null);
		for(Object object:hs)
		{
			System.out.println(object);
			System.out.println(hs.hashCode());
		}
	}
}
