package com.suresh.java.object.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 12, 34, 67, 34, 56 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String string[] = { "suresh", "Ishan", "Priyanka", "Chalamaiah", "suvernakumari", "Alekhya" };
		Arrays.sort(string);
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}

		List<String> strings = new ArrayList<>();

		strings = Arrays.asList(string);
		System.out.println(strings);

		Collections.sort(strings, new StringLengthComparator());
		System.out.println(strings);

		Passenger p1 = new Passenger(1, "Suresh");
		Passenger p2 = new Passenger(2, "Priyanka");
		Passenger p3 = new Passenger(3, "Ishan");

		List<Passenger> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);

		System.out.println(list);
		Collections.sort(list, new CustomSorting());
		System.out.println(list);

	}

}

class Passenger {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passenger(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + "]";
	}

}
