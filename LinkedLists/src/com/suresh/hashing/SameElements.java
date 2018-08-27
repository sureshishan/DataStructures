package com.suresh.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameElements {

	public static void main(String[] args) {
		Integer arr[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
		if (areSame(arr)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean areSame1(Integer arr[]) {
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		return (set.size() == 1);
	}
	
	public static boolean areSame(Integer arr[]) {

		Integer first = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != first){
				return false;
			}
		}
		return true;
	}
}
