package com.suresh.stack;

import java.util.Stack;

public class StackAssendingOrder {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(4);
		stack.push(5);

		Stack<Integer> resultStack = sort(stack);

		int resultSize = resultStack.size();

		for (int i = 0; i < resultSize; i++) {
			System.out.println(resultStack.pop());
		}
	}

	static Stack<Integer> sort(Stack<Integer> stack) {

		Stack<Integer> resultStack = new Stack<>();
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!resultStack.isEmpty() && resultStack.peek() < temp) {
				stack.push(resultStack.pop());
			}
			resultStack.push(temp);
		}

		return resultStack;
	}

}
