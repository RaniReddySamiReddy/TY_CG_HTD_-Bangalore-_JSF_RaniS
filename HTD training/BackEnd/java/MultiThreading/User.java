package com.cg.thread.creatingthread;

public class User extends Thread{
      PVR p;
      User(PVR p){
    	  this.p=p;
      }
    public void run() {
    	p.confirmTicket();
    }
}
