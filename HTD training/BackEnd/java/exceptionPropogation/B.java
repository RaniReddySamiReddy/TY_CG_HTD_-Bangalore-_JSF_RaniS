package exceptionpropogation;

public class B {
      static void n() {
    	  try {
    		  C.m();
    	  }catch(ArithmeticException a)
    	  {
    		  System.out.println(A.getmessage());
    	  }
      }
}
