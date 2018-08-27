package com.suresh.stack;

import java.util.Stack;

public class InfixToPostfix {

	// Driver method
	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(exp));
	}

	static String infixToPostfix(String exp) {

		// Initializing empty string for result
		String result = "";

		// Initializing Empty stack
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {

			// If the scanned character is operand or digit, add it to output
			if (Character.isLetterOrDigit(exp.charAt(i))) {
				result += exp.charAt(i);
			}

			// If the scanned character is '(' push it to the stack
			else if (exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));
			}
			// If the scanned character is ')' pop and out from the stack till
			// ')' encountered
			else if (exp.charAt(i) == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}
				if (!stack.isEmpty() && stack.peek() != '(') {
					System.out.println("Invalid Expression");
				} else {
					stack.pop();
				}
			} else { // An operator encountered
				while (!stack.isEmpty() && prec(exp.charAt(i)) <= prec(stack.peek())) {
					result += stack.pop();
				}
				stack.push(exp.charAt(i));
			}

		}
		while (!stack.empty()) {
			result += stack.pop();
		}
		
		return result;
		
	}

	static int prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

}
