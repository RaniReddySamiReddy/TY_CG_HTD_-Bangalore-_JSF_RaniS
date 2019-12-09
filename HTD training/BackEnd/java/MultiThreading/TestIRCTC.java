package com.cg.thread.creatingthread;

public class TestIRCTC {
      public static void main(String[] args) {
		System.out.println("main started.....");
		IRCTC i1 = new IRCTC();
		
		UserIRCTC u1 = new UserIRCTC(i1);
		u1.start();
		
		UserIRCTC u2 = new UserIRCTC(i);
		u2.start();
		
	}
}
