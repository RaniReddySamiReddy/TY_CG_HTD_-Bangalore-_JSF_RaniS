package staticAndnonstatic;

public class Person 
{
String name;
static int age;
 void personDetails()
{
System.out.println("name of the person "+ name + "  and age is "+ age);	
personDetailsStatic();
}
void personDetailsStatic()
{
System.out.println(age);
}
 
}
