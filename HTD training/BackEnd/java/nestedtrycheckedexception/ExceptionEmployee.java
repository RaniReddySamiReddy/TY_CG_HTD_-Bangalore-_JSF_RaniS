package nestedtrycheckedexception;

public class ExceptionEmployee {
      public static void main(String[] args) {
		System.out.println("Main started");
		Employee e1=new Employee();
		try {
			Object o1=e1.clone();
			  try {
				  Class c1=Class.forName("nestedtrycheckedexception.Employee");
				  System.out.println("class is found");
			  }catch(ClassNotFoundException e){
				  System.out.println("class is not found");
			  }
		} catch (CloneNotSupportedException e) {
			System.out.println("clone is not suported");
		}
		System.out.println("main ended");
	}
}
