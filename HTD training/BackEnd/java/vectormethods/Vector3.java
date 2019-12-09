package vectormethods;

import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(23);
		v1.addElement(56);
		v1.addElement(78);
		v1.add(100);
		System.out.println(v1);
		v1.removeElement(new Integer(23));
		System.out.println(v1);
		v1.remove(2);
		System.out.println(v1);
		//creating an "ARRAY" by using copyInto() method
		Object o[]=new Object[v1.size()];
		v1.copyInto(o);
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		v1.removeAllElements();
        System.out.println(v1);
        
        Vector v2=new Vector();
        v2.addElement(34);
		v2.addElement(56);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println("when we are set the size, less than capacity it gives output like this");
		v2.ensureCapacity(6);
		v2.setSize(4);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println("when we are set the size, more than capacity it gives output like (double the capacity)");
		v2.ensureCapacity(6);
		v2.setSize(10);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
	}
}