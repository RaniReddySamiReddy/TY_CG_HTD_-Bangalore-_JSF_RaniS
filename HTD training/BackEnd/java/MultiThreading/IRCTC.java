package com.cg.thread.creatingthread;

public class IRCTC {
   synchronized void confirmTicket() {
	   for (int i = 0; i < 4; i++) {
	   System.out.println(i);
	}
	   try {
		wait();
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
   }
//	   try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
	synchronized void leaveMe() {
		System.out.println("called notifyAll");
		notify();
	}  
	   
   }

