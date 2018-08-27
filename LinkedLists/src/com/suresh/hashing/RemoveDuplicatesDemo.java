package com.suresh.hashing;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesDemo {

	public static void main(String[] args) {

		String str = "sureshbsuh";
		int len = str.length();

		// Method -1
		 removeDuplicates(str);
		//String result = removeDuplicates(str);
		//System.out.println(result);

		// Method -2

		// char[] s = { 's', 'u', 'r', 'e', 'h', 'r' };

		// int n = s.length;
		/*
		 * int i; for (i = 0; i < n; i++) { for (int j = i + 1; j < n;) { if
		 * (s[i] == s[j]) { s[j] = s[--n]; } else { j++; } } } s[i] = '\0'; for
		 * (int k = 0; k < s.length; k++) { System.out.println(s[k]); }
		 */

	}

	public static String removeDuplicates2(String str) {
		StringBuilder noDupes = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			String si = str.substring(i, i + 1);
			System.out.println(si);
			System.out.println("noDupes.indexOf(si):" + noDupes.indexOf(si));
			if (noDupes.indexOf(si) == -1) {
				noDupes.append(si);
			}
		}
		return noDupes.toString();
	}

	public static String removeDuplicates3(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
		StringBuilder si = new StringBuilder();
		String sa = String.valueOf(sorted.charAt(0));
		si.append(sa);
		for (int i = 1; i < sorted.length() - 1; i++) {
			if (sorted.charAt(i) != sorted.charAt(i + 1)) {
				si.append(sorted.charAt(i));
			}
		}
		return si.toString();
	}

	public static void removeDuplicates(String str) {

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}
		 	 	
		for (Character character : lhs) {
			System.out.print(character);
		}
	}
}
