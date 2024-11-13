//NAME - HARSH DIXIT 86691 KD1


package Question1;

public class LinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;
	private int size;

	public LinkedList() {
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public int size() {
		return size;
	}

//---------------------------------------------------------

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		size++;
	}

//---------------------------------------------------------
	public void addLast(int value) {
		Node newnode = new Node(value);
		if (tail == null) {
			tail = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}
	
//---------------------------------------------------------
	public void addPosition(int value, int pos) {
		//0. validate the position
		if(pos < 1 || pos > size + 1)
			return;
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(size == 0) {
			tail = newnode;
			tail.next = tail;
		}
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else if(pos == size + 1) {
			addLast(value);
			return;
		}
		//3. if list is not empty
		else {
			//a. traverse till pos-1 node
			Node trav = tail.next;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos - 1 node
			trav.next = newnode;
		}
		size++;
	}
	
//---------------------------------------------------------

	public void deleteFirst() {
		if(size == 0)
			return;
		else if(size == 1)
			tail = null;
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
	
//---------------------------------------------------------
	
	public void deleteLast() {
		Node trav = tail.next;
		if(isEmpty()) return;
		else if(size == 1) {
			deleteFirst();
			return;
		}else {
			while(trav.next != tail) {
				trav = trav.next;
			}
		}
		tail = trav;
		tail.next = tail.next.next;
		size--;
	}
	
//---------------------------------------------------------
	
	public void deletePosition(int pos) {
		// validate position
		if(pos<=1) {
			deleteFirst();
			return;
		}else if(pos>= size+1) {
			deleteLast();
			return;
		}else {
			// Creating trav to traverse to the position node
			Node trav = tail.next;
			// traverse to pos - 1
			for(int i=0; i < pos-1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		size--;
	}	

//---------------------------------------------------------
	public void display() {
		if (isEmpty())
			return;
		Node trav = tail;
		System.out.print("List : ");
		do {
			System.out.print(" " + trav.next.data);
			trav = trav.next;
		} while (trav != tail); // 4. repeat till last node
		System.out.println();
		System.out.println("last node = " + tail.data);
	}
	
//---------------------------------------------------------
	
	public void deleteAll() {
		tail = null;
		size = 0;
	}
}
