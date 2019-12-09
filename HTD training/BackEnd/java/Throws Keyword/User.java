package throwskeyword;

public class User {
      public static void main(String[] args) {
    	 System.out.println("main started");
		IRCTC i1=new IRCTC();
		Paytm p1=new Paytm(i1);
		p1.bookTicket();
		System.out.println("main ended");
	}
}
