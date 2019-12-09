class Rectangle
{
static int areaOfRectangle(int l,int b)
{
int areaOfRect= l*b;
return areaOfRect;
}
static int perimeterOfRect(int l,int b)
{
int perimeterOfRect = 2*(l+b);
return perimeterOfRect;
}
public static void main(String arr[])
{
int area=areaOfRectangle(6,7);
int perimeter=perimeterOfRect(5,7);
System.out.println("area of Rect is "+area);
System.out.println("perimeter of Rect is "+perimeter);
}
}