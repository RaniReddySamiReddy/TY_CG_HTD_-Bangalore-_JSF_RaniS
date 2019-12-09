package com.cg.thread.creatingthread;

public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("main started........");
		Thread2 t2 = new Thread2();
		
		Thread t1 = new Thread(t2);
		t1.start();
		System.out.println("main ended.......");
	}
}
