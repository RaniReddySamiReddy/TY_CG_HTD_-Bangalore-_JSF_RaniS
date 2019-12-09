package staticAndnonstatic;

public class TestPerson1 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.name ="Mansi";
		p1.age = 23;
		p1.personDetails();
		Person1 p2 = new Person1();
		p2.initialize(23, "Rani");
		p2.personDetails();
				
				
	}

}
