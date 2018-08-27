package com.suresh.designpatterns;

class MySingleTon {
	private static MySingleTon instance;
	public int x = 10;

	private MySingleTon() {

	}

	static public synchronized MySingleTon getInstance() {
		if (instance == null) {
			instance = new MySingleTon();
		}
		return instance;
	}
}

// Driver class
public class SingleTon {

	public static void main(String[] args) {
		MySingleTon a = MySingleTon.getInstance();
		MySingleTon b = MySingleTon.getInstance();

		a.x = a.x + 10;

		System.out.println("Value of A:" + a.x);
		System.out.println("Value of B:" + b.x);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}
