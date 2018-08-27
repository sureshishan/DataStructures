package com.suresh.ds.doublelinkedlist;

public class DLLNode {
	private int data;
	private DLLNode prev;
	private DLLNode next;
	
	
	/*public DLLNode(int data, DLLNode prev, DLLNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}*/
	
	public DLLNode(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public DLLNode getPrev(){
		return this.prev;
	}
	
	public void setPrev(DLLNode prev){
		this.prev = prev;
	}
	
	public DLLNode getNext(){
		return this.next;
	}
	public void setNext(DLLNode next){
		this.next = next;
	}
}
