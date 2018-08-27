package com.suresh.ds.doublelinkedlist;

public class DoublyLinkedList {

	// Properties
	private DLLNode head;
	// private DLLNode tail;
	private int length;

	public DoublyLinkedList() {

		length = 0;
	}

	public void insertAtTheBegin(int data) {
		DLLNode newNode = new DLLNode(data);

		newNode.setNext(head);
		newNode.setPrev(null);

		if (head != null) {
			head.setPrev(newNode);
		}

		head = newNode;

		length++;
	}

	public int getLength() {
		return length;
	}

	public void display() {
		if (head == null) {
			return;
		}
		DLLNode node = head;
		while (node != null) {
			System.out.print(node.getData() + "->");
			node = node.getNext();
		}
	}

	public void AtTheEnd(int data) {
		DLLNode newNode = new DLLNode(data);

		DLLNode last = head;

		newNode.setNext(null);

		if (head == null) {
			newNode.setPrev(null);
			head = newNode;
			return;

		}
		while (last.getNext() != null) {
			last = last.getNext();
		}
		
		last.setNext(newNode);
		newNode.setPrev(last);
		
		length++;
	}

}
