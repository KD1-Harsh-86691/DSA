//IMPLEMENTING QUEUE USING LINKED LIST
package Question2;

public class LinkedList1 {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public LinkedList1() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void enQueue(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}

	public void deQueue() {
		if (isEmpty())
			return;
		else if (head.next == null)
			head = null;
		else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			//
			trav.next = null;
		}
	}

	public void displayQueue() {
		Node trav = head;
		System.out.print("Queue : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
