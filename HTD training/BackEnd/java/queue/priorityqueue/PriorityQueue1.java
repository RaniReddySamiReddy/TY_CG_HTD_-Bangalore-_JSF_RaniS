package com.cpgmni.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
    	Queue p1=new PriorityQueue();
    	p1.offer(12);
    	p1.offer(13);
    	p1.offer(14);
    	p1.offer(15);
    	p1.offer(16);
    	p1.offer(17);
    	System.out.println(p1);
    	p1.poll();
    	System.out.println(p1);
    	System.out.println("----------");
    	Queue q1=new PriorityQueue();
    	q1.offer(45);
    	q1.offer(98);
    	q1.offer(57);
    	q1.offer(15);
    	q1.offer(65);
    	q1.offer(70);
    	//q1.offer(null);------>it will give nullpointer exception
    	q1.element();
    	System.out.println(q1);
    	System.out.println("----------------------");
    	System.out.println(q1.peek());
    	q1.remove();
    	System.out.println(q1);
    	System.out.println("----------------------");
    	for (Object object : q1) {
			System.out.println(object);
		}
	}
}
