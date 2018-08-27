package com.suresh.stack;

import java.util.Stack;

public class PostfixEvaluation {

	public static void main(String[] args) {

		String exp = "123*+5-";
		System.out.println(postfixEvaluation(exp));
	}

	static int postfixEvaluation(String exp) {

		Stack<Integer> stack = new Stack<>();

		int result = 0;

		for (int i = 0; i < exp.length(); i++) {

			if (exp.charAt(i) == '+') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				result = op2 + op1;
				stack.push(result);

			} else if (exp.charAt(i) == '-') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				result = op2 - op1;
				stack.push(result);
			} else if (exp.charAt(i) == '*') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				result = op2 * op1;
				stack.push(result);
			} else if (exp.charAt(i) == '/') {
				int op1 = stack.pop();
				int op2 = stack.pop();
				result = op2 / op1;
				stack.push(result);
			} else {
				stack.push(Character.getNumericValue(exp.charAt(i)));
			}
		}

		return stack.pop();
	}

}
