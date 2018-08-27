package com.suresh.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= 5; i++) {
			queue.add(i);
		}

		System.out.println(queue);

		Queue<Integer> reverseQ = reverseQueueElements(queue);
		System.out.println(reverseQ);
	}

	static Queue<Integer> reverseQueueElements(Queue<Integer> queue) {

		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.push(queue.remove());
		}

		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		return queue;
	}

}
