package com.suresh.stack;

import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		String str = "ababababXbabababa";
		// System.out.println(isPalindrome(str));
		System.out.println(isPlindromeLinkedList(str));
	}

	static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		// char[] A = str.toCharArray();

		while (i < j && str.charAt(i) == str.charAt(j)) {
			i++;
			j--;
		}
		if (i == j) {
			return true;
		} else
			return false;
	}

	static boolean isPlindromeLinkedList(String str) {

		Stack<Character> stack = new Stack<>();
		char A[] = str.toCharArray();

		int i = 0;

		while (A[i] != 'X') {
			stack.push(A[i]);
			i++;
		}
		i++;
		while (i < A.length) {
			if(stack.isEmpty()){
				return false;
			}else{
				if(A[i] != stack.pop()){
					return false;
				}
			}
			i++;
		}

		return true;
	}

}
