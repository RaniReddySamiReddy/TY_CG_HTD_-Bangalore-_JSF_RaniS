class Circle
{
static double areaOfCircle(int r)
{
double areaOfCircle = 3.142*r*r;
return areaOfCircle;
}
static double perimeterOfCircle(int r)
{
double perimeterOfCircle = 2* 3.142 * r;
return perimeterOfCircle;
}
public static void main(String arr[])
{
double area=areaOfCircle(6);
double perimeter=perimeterOfCircle(5);
System.out.println("area of circle is "+area);
System.out.println("perimeter of cicle is "+perimeter);
}
}