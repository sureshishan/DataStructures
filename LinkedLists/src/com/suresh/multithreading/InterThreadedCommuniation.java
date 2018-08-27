package com.suresh.multithreading;

import java.util.LinkedList;
import java.util.List;

public class InterThreadedCommuniation {

	public static void main(String[] args) {
		PC pc = new PC();

		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		producer.start();
		consumer.start();
	}

}

class PC {
	List<Integer> list = new LinkedList<>();
	int capacity = 2;

	public void produce() throws InterruptedException {

		int value = 0;
		while (true) {
			synchronized (this) {
				// Producer should wait while list is full
				if (list.size() == capacity) {
					wait();
				}

				System.out.println("Producer produced -" + value);

				// Insert the jobs into the list
				list.add(value);

				// Notifies the consumer thread.
				notify();

				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {

		while (true) {
			synchronized (this) {

				// Consumer waits while the list is empty
				while (list.size() == 0) {
					wait();
				}

				int value = list.remove(0);

				System.out.println("Consumed value:" + value);

				notify();

				Thread.sleep(1000);

			}
		}
	}
}
