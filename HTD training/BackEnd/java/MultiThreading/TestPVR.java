package com.cg.thread.creatingthread;

public class TestPVR {
      public static void main(String[] args) {
		System.out.println("main started......");
		PVR p = new PVR();
		
		User u = new User(p);
		u.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		p.leaveMe();
		
		System.out.println("main ended......");
	}
}
