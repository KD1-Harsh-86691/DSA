package com.sunbeam;

public class BST {
	static class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	// Recursive function to add node into BST

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
		if (root == null)
			root = new Node(value);
		else
			addNode(value, root);
	}


	private void inOrder(Node trav) {
		// 1. stop if left or right sub tree is absent
		if (trav == null)
			return;
		// 3. go in left current node
		inOrder(trav.left);
		// 2. print / visit current node
		System.out.print(" " + trav.data);
		// 4. go in right of current node
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println();
	}

	public void deleteAll() {
		root = null;
	}
}
