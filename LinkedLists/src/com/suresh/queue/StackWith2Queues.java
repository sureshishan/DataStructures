package com.suresh.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWith2Queues {

	public static void main(String[] args) {
		StackWithTwoQueues<Integer> stack = new StackWithTwoQueues<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());

	}

}

class StackWithTwoQueues<T> {

	Queue<T> Q1 = new LinkedList<>();
	Queue<T> Q2 = new LinkedList<>();

	public void push(T data) {
		if (Q1.isEmpty()) {
			Q2.offer(data);
		} else {
			Q1.offer(data);
		}
	}

	public T pop() {
		int size, i = 0;
		if (Q1.isEmpty()) {
			size = Q2.size();
			while (i < size - 1) {
				Q1.offer(Q2.poll());
				i++;
			}
			return Q2.poll();
		} else {
			size = Q1.size();
			while (i < size - 1) {
				Q2.offer(Q1.poll());
			}
			return Q1.poll();
		}
	}
}
