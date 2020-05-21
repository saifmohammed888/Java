package com.core.java.collections;

import java.util.PriorityQueue;

public class PrirorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for(int i=1;i<11;i++) {
			que.add(i); 
		}
		
		//Peeking to get head of Queue
		System.out.println(que.peek());
		
		//Polling removing the head of Queue
		System.out.println(que.poll());
		System.out.println("Size of Que after poll "+que.size());
		
	}
}
