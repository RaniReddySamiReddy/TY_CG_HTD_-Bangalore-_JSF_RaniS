class Elseif
{
public static void main(String arr[])
{
int a=1;
int b=2;
int c=3;
int d=4;

if(a>b&&a>c&&a>d)
{
System.out.println("a is greater");
}
else if(b>c&&b>d)
{
System.out.println("b is greater");
}
else if(c>d)
{
System.out.println("c is greater");
}
else
{
System.out.println("d is greater");
}
}
}