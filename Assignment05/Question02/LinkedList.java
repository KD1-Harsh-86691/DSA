package Question2;

public class LinkedList {
	static class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public LinkedList() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void deleteAll() {
		root = null;
	}

	private void addNode(int value, Node trav) {
		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			} else {
				addNode(value, trav.left);
			}
		} else {
			if (trav.right == null) {
				trav.right = new Node(value);
				return;
			} else {
				addNode(value, trav.right);
			}
		}
	}
    
    public void addNode(int value) {
    	if(root==null)
    		root=new Node(value);
    	else
    		addNode(value,root);
    }

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(" " + root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	private Node recursionSearch(Node trav, int key) {
		if (trav == null)
			return null;
		if (key == trav.data)
			return trav;
		else if (key < trav.data)
			return recursionSearch(trav.left, key);
		else
			return recursionSearch(trav.right, key);
	}

	public Node recursionSearch(int key) {
		return recursionSearch(root, key);
	}

	public Node[] binarySearchWithParent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (key == trav.data)
				break;
			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		if (trav == null)
			parent = null;
		return new Node[] { trav, parent };
	}

	public void deleteNode(int key) {
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		if (temp == null)
			return;
		if (temp.left != null && temp.right != null) {
			Node pred = temp.left;
			parent = temp;
			while (pred.right != null) {
				parent = pred;
				pred = pred.right;
			}
			temp.data = pred.data;
			temp = pred;
		}
		if (temp.left == null) {
			if (temp == root)
				root = temp.right;
			else if (temp == parent.left)
				parent.left = temp.right;
			else if (temp == parent.right)
				parent.right = temp.right;
		} else {
			if (temp == root)
				root = temp.left;
			else if (temp == parent.left)
				parent.left = temp.left;
			else if (temp == parent.right)
				parent.right = temp.left;
		}
	}
}

