package com.suresh.hashing;

import java.util.HashMap;
import java.util.Map;

public class SymmetricPairs {

	public static void main(String[] args) {
		int arr[][] = new int[5][2];
		int a[][] = { { 11, 20 }, { 30, 40 }, { 5, 10 }, { 40, 30 }, { 10, 5 } };
		arr[0][0] = 11;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 5;
		arr[2][1] = 10;
		arr[3][0] = 40;
		arr[3][1] = 30;
		arr[4][0] = 10;
		arr[4][1] = 5;

		// findSymmetricPairs(arr);
		findSymmetricPairs(a);
	}

	public static void findSymmetricPairs(int arr[][]) {
		Map<Integer, Integer> map = new HashMap<>();

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			int first = arr[i][0];
			int second = arr[i][1];

			Integer value = map.get(second);

			if (value != null && value == first) {
				System.out.println("(" + second + "," + first + ")");
			} else {
				map.put(first, second);
			}
		}
	}
}
