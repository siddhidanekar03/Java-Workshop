package com.app.demo3;

import java.util.PriorityQueue;
import java.util.Queue;

public class program02 {
	
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(30);
		q.add(10);
		q.add(40);
		q.add(20);

		System.out.println("Element at peek - " + q.peek());
		q.poll();
		System.out.println("After remove element at peek - " + q.peek());

	}

}
