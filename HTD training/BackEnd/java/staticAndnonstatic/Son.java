package staticAndnonstatic;

public class Son extends Father{
	Son()
	{
		super("rani",20);
		System.out.println("C");
	}
	
	
	Son(String name , int age){
		this();
		System.out.print("D");
		
		
	}
	}

