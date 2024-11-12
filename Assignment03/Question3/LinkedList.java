//ASSIGN03 QUES03
package com.sunbeam;

public class LinkedList {

	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private int count;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return count;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		count++;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
		count++;
	}
	
	public int findPosition(int value) {
		Node trav = head;
		int index = 0;
		while(trav.next != null) {
			index++;
			if(trav.data == value) break;
			trav = trav.next;
		}
		return index;
	}
	
	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else if(pos <= 1) {
			addFirst(value);
			return;
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}
	
	public void addAfterPosition(int value, int pos) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else if(pos >= count-1) {
			addLast(value);
			return;
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos ; i++) 
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void display() {
		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
		System.out.println("SIZE : "+ count);
	}
	
}
