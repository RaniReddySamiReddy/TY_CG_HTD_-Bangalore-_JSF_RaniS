package collectioninterface;
import java.util.Collection;
import java.util.ArrayList;

public class Collection1 {
     public static void main(String[] args) {
		Collection c1= new ArrayList();
		
		//adding an element inside the collection
		c1.add(12);
		System.out.println(c1);
		
		//removing an element inside the collection
		c1.remove(12);
		System.out.println(c1);
		
		//checking the size of an array
		System.out.println(c1.size());
		
		//checking the collection is empty or not
		System.out.println(c1.isEmpty());
		
		//checking the value is present or not
		System.out.println(c1.contains(12));
		
		//adding string value inside the collection
		//c1.add("Rani");
		//System.out.println(c1);
	}
}
