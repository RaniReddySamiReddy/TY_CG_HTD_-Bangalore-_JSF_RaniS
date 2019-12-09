package staticAndnonstatic;

public class TestQspiders
{
public static void main(String[] args) 
{
Qspiders BTR = new Qspiders();
BTR.swipe();
BTR.swipe();
Qspiders BTM = new Qspiders();
BTM.swipe();
System.out.println(BTR.branchcount);
System.out.println(BTM.branchcount);
System.out.println(Qspiders.totalcount);
}
}
