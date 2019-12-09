package checkedException;

public class ExceptionA {
    public static void main(String[] args) {
		System.out.println("Main Started");
	try {
		Class c1=Class.forName("checkedException.Person");
		System.out.println("class is found");
           	} catch (ClassNotFoundException e) {
	System.out.println("class is not found");
	}
	System.out.println("Main Ended");
}
}

