// IMPLEMENTING STACK USING LINKED LIST
package Question2;

public class LinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}

	public void pop() {
		if (isEmpty())
			return;
		head = head.next;
	}

	public void displayStack() {
		Node trav = head;
		while (trav != null) {
			System.out.println("" + trav.data);
			trav = trav.next;
		}
	}
}
