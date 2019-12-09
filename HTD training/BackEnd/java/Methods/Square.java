class Square
{
static int areaOfSquare(int s)
{
int areaOfSquare= s*s;
return areaOfSquare;
}
static int perimeterOfSquare(int s)
{
int perimeterOfSquare = 4*s;
return perimeterOfSquare;
}
public static void main(String arr[])
{
int area=areaOfSquare(6);
int perimeter=perimeterOfSquare(5);
System.out.println("area of Square is "+area);
System.out.println("perimeter of Square is "+perimeter);
}
}