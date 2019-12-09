package treeset;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(82);
		t1.add(17);
		t1.add(22);
		t1.add(57);
		t1.add(12);
		t1.add(60);
		t1.add(60);
		//t1.add("rani");---->it will classCastException bcz it takes only homogenous data.
		t1.remove(60);
        System.out.println(t1);
        for(Object o:t1)
        {
        	System.out.println(o);
        }
	}
}
