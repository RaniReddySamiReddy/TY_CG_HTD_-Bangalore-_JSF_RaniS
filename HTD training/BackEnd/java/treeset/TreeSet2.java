package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
     public static void main(String[] args) {
		TreeSet<StudentTreeSet2> t1=new TreeSet();
		t1.add(new StudentTreeSet2(22,"rohini"));
		t1.add(new StudentTreeSet2(23,"mansi"));
		t1.add(new StudentTreeSet2(22,"rohini"));
		t1.add(new StudentTreeSet2(41,"subbu"));
		
		Iterator<StudentTreeSet2> itr=t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
