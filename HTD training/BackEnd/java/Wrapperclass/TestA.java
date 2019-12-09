package wrapperclass;

public class TestA {
     public static void main(String[] args) {
		int i1=10;
		//boxing
		Integer i2=new Integer(i1);
		//Unboxing
		int i3=i2.intValue();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		
		double d1=54.67;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		
		byte b1=4;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
	}
}
