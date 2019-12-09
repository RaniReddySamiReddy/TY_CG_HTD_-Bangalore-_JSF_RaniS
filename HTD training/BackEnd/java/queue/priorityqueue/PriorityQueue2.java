package com.cpgmni.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
    PriorityQueue<Student> p1=new PriorityQueue<Student>();
    p1.offer(new Student(22,"divya"));
    p1.offer(new Student(21,"mansi"));
    p1.offer(new Student(22,"divya"));
    
    for (Student student : p1) {
		System.out.println(student);
	}
    
}
}
