package com.suresh.multithreading;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Sender sender = new Sender();

		MyThread t1 = new MyThread("Hi", sender);
		
		MyThread t2 = new MyThread("Bye", sender);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Main thread completed.");

	}

}

class MyThread extends Thread {

	private String message;
	private Sender sender;

	public MyThread(String message, Sender sender) {
		this.message = message;
		this.sender = sender;
	}
	
	public void run(){
		//synchronized (sender) {
			sender.send(message);
	//	}
	}

}

class Sender {
	public synchronized void send(String msg) {
		System.out.println("Sending\t" + msg);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(msg + " sent");
	}
}
