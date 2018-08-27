package com.suresh.ds.singlelinkedlist;

public class LinkedList {

	private int length;

	/* It holds the head of the list */
	private ListNode head;

	/* This class has Default Constructor */
	LinkedList() {
		length = 0;
	}

	/* Return the first node in the List */
	public ListNode getHead() {
		return head;
	}

	/* Function to check if the list is empty */
	public boolean isEmpty() {
		return head == null;
	}

	/* Function to get the size of the list */
	public int getLength() {
		return length;
	}

	/* Insert the node at the beginning of the list */
	public void insertAtTheBegin(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	public void insertAtTheEnd(ListNode node) {
		if (head == null) {
			head = node;
		} else {
			ListNode p, q;
			for (p = head; (q = p.getNext()) != null; p = q)
				;
			p.setNext(node);
		}
		length++;
	}

	public void insert(int position, int data) {
		/* Fix the position */
		if (position < 0) {
			position = 0;
		}
		if (position > length) {
			position = length;
		}
		/* If the list is empty make it be the only element */
		if (head == null) {
			head = new ListNode(data);
		} else if (position == 0) {
			ListNode temp = new ListNode(data);
			temp.setNext(head);
			head = temp;
		} // find the correct position and insert
		else {
			ListNode temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			ListNode node = new ListNode(data);
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
		length++;
	}

	public ListNode removeAtTheBegin() {
		ListNode node = head;
		if (node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		length--;
		return node;
	}

	public ListNode removeFromTheEnd() {

		if (head == null) {
			return null;
		}
		ListNode p = head, q = null, next = head.getNext();
		if (next == null) {
			head = null;
			return p;
		}
		while ((next = p.getNext()) != null) {
			q = p;
			p = next;
		}
		q.setNext(null);
		length--;
		return p;
	}

	public void remove(int position) {
		if (position < 0) {
			position = 0;
		}
		if (position > length) {
			position = length;
		}
		if (position == 0) {
			ListNode node = head;
			head = head.getNext();
			node.setNext(null);
		} else {
			ListNode temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		length--;
	}

	public void clearList() {
		head = null;
		length = 0;
	}

	public int getPosition(int data) {
		ListNode temp = head;
		int pos = 0;
		while (temp != null) {
			if (temp.getData() == data) {
				return pos;
			}
			pos++;
			temp = temp.getNext();
		}
		return 0;
	}

	public void diaplay() {
		System.out.println("\nSinle Linked List =");
		if (length == 0) {
			System.out.println("List is empty.");
			return;
		}

		ListNode node = head;
		while (node != null) {
			System.out.print(node.getData() + "->");
			node = node.getNext();
		}
	}
	
	public void removeMatched(ListNode node){
		if(head == null){
			return;
		}
		if(node.equals(head)){
			head = head.getNext();
			return;
		}
		ListNode p = head, q = null;
		while((q = p.getNext()) != null){
			if(q.equals(node)){
				p.setNext(q.getNext());
				return;
			}
			p = q;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		ListNode listNode = (ListNode) obj;
		//listNode.getData()
		return this.equals(listNode);
	}

}
