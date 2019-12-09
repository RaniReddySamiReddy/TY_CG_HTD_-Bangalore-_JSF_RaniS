package com.cg.thread.creatingthread;

public class PVR {
     synchronized void confirmTicket() {
    	  for (int i = 0; i < 4; i++) {
			System.out.println(i);
// it will be in sleep state for 500 milliseconds
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
			//its in wait state so we need too use synchronized to avoid exception
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
      }
     synchronized void leaveMe() {
    	 System.out.println("notify called");
    	 notify();
     }
}
