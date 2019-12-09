package staticAndnonstatic;

public class TestPerson
{
public static void main(String args[])
{
Person p1 = new Person();
Person.age=22;
p1.name = "Ravi";
p1.personDetails();
}
}
