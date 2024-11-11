package com.sunbeam;

public class LinearQueue {

	private int arr[];
	private int front, rear;
	private final int SIZE;

	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}

	public void push(int value) {
		arr[rear] = value;
		rear++;
	}

	public int pop() {
		int temp = arr[front];
		front++;
		return temp;
	}

	public int peek() {
		return arr[front];
	}

	boolean isFull() {
		return rear == SIZE;
	}

	boolean isEmpty() {
		return rear == front;
	}

}
