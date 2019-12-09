package treeset;

public class StudentTreeSet2 implements Comparable<StudentTreeSet2>{
    int age;
    String name;
    
	public StudentTreeSet2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(StudentTreeSet2 o) {
		if(this.age>o.age)
		{
			return 1;
		}else if(this.age<o.age)
		{
			return -1;
		}else
		return 0;
	}

	@Override
	public String toString() {
		return "StudentTreeSet2 [age=" + age + ", name=" + name + "]";
	}
	

}
