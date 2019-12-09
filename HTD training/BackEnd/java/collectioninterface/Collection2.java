package collectioninterface;
import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
     public static void main(String[] args) {
		Collection c2=new ArrayList();
		
		c2.add("Ravi");
		System.out.println(c2);
		c2.add("Rani");
		System.out.println(c2);
		System.out.println(c2.contains("Ravi"));
		System.out.println(c2.remove("Ravi"));
		System.out.println(c2.isEmpty());
		
	}
}
