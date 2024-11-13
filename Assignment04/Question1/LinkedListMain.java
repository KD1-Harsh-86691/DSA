package Question1;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		l1.addLast(400);
		l1.addLast(4800);
		l1.addLast(4500);
		
		l1.addPosition(3444, 2);
		
		l1.deleteFirst();
		l1.deleteLast();
		l1.deletePosition(5);
		l1.display();
	}

}
