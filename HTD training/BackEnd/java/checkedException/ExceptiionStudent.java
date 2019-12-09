package checkedException;

public class ExceptiionStudent {
     public static void main(String[] args) {
    	 Student s1=new Student();
    	 System.out.println("main started");
		try {
			Object o1=s1.clone();
			System.out.println("Object is cloned");
			Class c1=Class.forName("checkedException.Student");
		} catch (ClassNotFoundException e) {
			System.out.println("class is not found");
		} catch (CloneNotSupportedException e) {
			System.out.println("clone is not supported");
		}
		System.out.println("main ended");
	}
}
