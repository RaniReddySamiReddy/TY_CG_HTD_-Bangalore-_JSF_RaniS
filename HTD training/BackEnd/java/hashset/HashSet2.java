package hashset;

import java.util.HashSet;

public class HashSet2 {
     public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(22,"Raghu"));
		hs.add(new Student(21,"Rani"));
		hs.add(new Student(23,"Gautam"));
		hs.add(new Student(26,"Ajay"));
		hs.add(new Student(26,"Ajay"));
		for (Student student : hs) {
			System.out.println(student.studName+" and age is"+student.studAge);
		}
		Student s1=new Student(12,"rani");
		Student s2=new Student(12,"rani");
		System.out.println(s1.equals(s2));
	}
}
