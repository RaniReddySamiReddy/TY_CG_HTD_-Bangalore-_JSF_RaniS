package throwskeyword;

public class IRCTC {
    void confirmTicket () throws ClassNotFoundException 
    {
    	 try {
			Class.forName("throwskeyword.Paytm");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket is confirmed");
			throw e;
		}System.out.println("ticket is not confirmed");
		
    }
}
