package arraylistcollection;

import java.util.ArrayList;

public class ArrayList2 {
     public static void main(String[] args) {
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		System.out.println("----add method");
		a1.add(12);
		a1.add(87);
		a1.add(32);
		a1.add(45);
		a1.add(96);
		a1.add(12);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println("================");
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains(32));
		
		ArrayList<Integer> a2 = new ArrayList();
		a2.add(43);
		a2.add(24);
		a2.add(67);
		a2.add(85);
		a2.add(45);
		System.out.println("----remove method");
		a2.remove(0);
		System.out.println(a2);
		System.out.println("=================");
		a1.addAll(1,a2);
		System.out.println(a1);
		a1.containsAll(a2);
        System.out.println(a1);
        a1.retainAll(a2);
		System.out.println(a1);
		a2.removeAll(a1);
		System.out.println(a2);
		a1.clear();
		System.out.println(a1);
		
	}
}
