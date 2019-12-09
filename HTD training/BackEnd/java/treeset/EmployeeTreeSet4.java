package treeset;

public class EmployeeTreeSet4 implements Comparable{
int age;
double sal;
String name;
public EmployeeTreeSet4(int age, double sal, String name) {
	super();
	this.age = age;
	this.sal = sal;
	this.name = name;
}
public int compareTo(EmployeeTreeSet4 o) {
	if(this.age>o.age)
	return 1;
	else if(this.age<o.age)
	return -1;
	else
	return 0;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
}
