package finallyblock;

public class GoogleMap {
     void findLocation(String loc)
     {
    	 try {
    		 System.out.println(loc.length());
    	 }catch(NullPointerException n) {
    	 System.out.println("plz fill location name");
    	 throw n;
     }
}
}
