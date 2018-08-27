package com.suresh.hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckTwoArraysHaveSameElements {

	public static void main(String[] args) {
		int A[] = { 2, 5, 6, 8, 10, 2, 2 };
		int B[] = { 2, 6, 10, 2, 2, 5, 8 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i]) != null) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		Collection<Integer> values = map.values();
		System.out.println(values);
		for (Integer key : keySet) {
			System.out.println("Key:" + key + "," +" Value:" + map.get(key));
		}
		
		for (int i = 0; i < B.length; i++) {
			if(map.get(B[i]) != null){
				map.put(B[i], map.get(B[i]) - 1);
			}
		}
		
		System.out.println(map);
	}

}
