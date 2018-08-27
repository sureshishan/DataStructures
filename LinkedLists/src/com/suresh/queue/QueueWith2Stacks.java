package com.suresh.queue;

import java.util.Stack;

public class QueueWith2Stacks {

	public static void main(String[] args) {
		QueueWith2Satcks<Integer> inQueue = new QueueWith2Satcks<>();
		inQueue.enQueue(10);
		inQueue.enQueue(20);
		inQueue.enQueue(30);
		
		System.out.println(inQueue.deQueue());
		System.out.println(inQueue.deQueue());
		System.out.println(inQueue.deQueue());
	}

}

class QueueWith2Satcks<T> {
	Stack<T> stack1 = new Stack<>();
	Stack<T> stack2 = new Stack<>();

	public void enQueue(T data) {
		stack1.push(data);
	}

	public T deQueue() {

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}