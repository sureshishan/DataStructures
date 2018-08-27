package com.suresh.java.object.methods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ObjectClassMethods {

	public static void main(String[] args) {

		/*
		 * Integer a = 10; Integer b = 10; System.out.println(a == b);
		 * System.out.println(a.hashCode()); System.out.println(b.hashCode());
		 * 
		 * String str1 = "Suresh"; String str2 = "Suresh";
		 * System.out.println(str1.hashCode());
		 * System.out.println(str2.hashCode());
		 * System.out.println(str1.equals(str2));
		 * System.out.println(str1.hashCode() == str2.hashCode());
		 */

		Person p1 = new Person(1, "Suresh");
		// Person p2 = p1;

		Person p2 = new Person(1, "Suresh");
		Person p3 = new Person(1, "Ramesh");

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		// System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p2));

		// System.out.println(p1);

		Map<Person, Integer> map = new HashMap<>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		System.out.println(map);

		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);

		System.out.println(set);
	}

}

class Person {

	@Override
	public String toString() {
		// return "Person [id=" + id + ", name=" + name + "]";
		return "id:" + this.id + "," + "name:" + this.name;
	}

	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

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

	/*
	 * @Override public int hashCode() { return this.id; }
	 */

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.id == p.id && this.name.equals(p.name);
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}