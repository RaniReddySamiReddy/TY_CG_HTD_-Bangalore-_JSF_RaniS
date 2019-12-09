package staticAndnonstatic;

public class Employee {
String empName;
int empAge;
double empSalary;
public Employee(String name, int age, double salary)
{
	empName= name;
	empAge= age;
	empSalary= salary;
}
void details()
{
	System.out.println("name is "+  empName  +"  age is "+empAge +"   salary is  "+empSalary);
}
}
