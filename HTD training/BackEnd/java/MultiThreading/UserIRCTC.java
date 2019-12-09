package com.cg.thread.creatingthread;

public class UserIRCTC {
	IRCTC i;
	public UserIRCTC(IRCTC i) {
		super();
		this.i=i;
	}
	public void run() {
		i.confirmTicket();
	}

}
