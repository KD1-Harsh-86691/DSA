package Question2;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addNode(8);
		l1.addNode(3);
		l1.addNode(10);
		l1.addNode(2);
		l1.addNode(6);
		l1.addNode(4);
		l1.addNode(7);
		l1.addNode(15);
		l1.addNode(14);
		l1.addNode(9);

//		l1.deleteNode(7); //IF WE DO THIS WE GET KEY NOT FOUND

		LinkedList.Node n = l1.recursionSearch(7);
		if (n != null)
			System.out.println("Key Found...");
		else {
			System.out.println("Key Not Found...");

		}
	}

}
