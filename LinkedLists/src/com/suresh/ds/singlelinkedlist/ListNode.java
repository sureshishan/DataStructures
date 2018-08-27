package com.suresh.ds.singlelinkedlist;

public class ListNode {
	
	private int data;
	private ListNode next;
	
	/*ListNode(){
		data = 0;
	}*/
	
	ListNode(int data){
		this.data = data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(ListNode next){
		this.next = next;
	}
	
	public ListNode getNext(){
		return this.next;
	}

}
