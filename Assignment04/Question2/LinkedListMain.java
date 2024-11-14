package Question2;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.push(12);
		l1.push(24);
		l1.push(26);

		l1.pop();

		l1.displayStack();

		LinkedList1 l2 = new LinkedList1();
		l2.enQueue(200);
		l2.enQueue(300);
		l2.enQueue(400);

		l2.deQueue();

		l2.displayQueue();
	}

}
