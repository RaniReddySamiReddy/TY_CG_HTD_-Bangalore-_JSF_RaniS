package staticAndnonstatic;

public class TestA {
	public static void main(String[] args) {
	//FirstGen fn = new FirstGen();
	//fn.call();
	//fn.msg();
	//SecondGen sn = new SecondGen();
	//sn.call();
	//sn.msg();
	//sn.radio();
	//ThirdGen tn = new ThirdGen();
	//tn.call();
	//tn.msg();
	//tn.radio();
	//tn.camera();
		FirstGen fn = new ThirdGen();
		fn.call();
		fn.msg();
		SecondGen sn = new ThirdGen();
	    sn.call();
		sn.msg();
		sn.radio();
		FirstGen tn = new SecondGen();
	    tn.call();
		tn.msg();
		
	}
}
