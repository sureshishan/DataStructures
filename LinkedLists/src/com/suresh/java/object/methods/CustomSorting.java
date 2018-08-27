package com.suresh.java.object.methods;

import java.util.Comparator;

public class CustomSorting implements Comparator<Passenger> {

	@Override
	public int compare(Passenger o1, Passenger o2) {
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
	}

}
