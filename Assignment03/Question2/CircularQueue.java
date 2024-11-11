package Question2;

public class CircularQueue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	private int count;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		count = 0;
	}

	public void push(int value) {
		// 1. reposition rear (inc)
		rear = (rear + 1) % SIZE;
		// 2. add value at rear index
		arr[rear] = value;
		count++;
	}

	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		// 1. reposition front (inc)
		front = (front + 1) % SIZE;
		// 2. if front and rear are equal, move them back to -1
		if (front == rear)
			front = rear = -1;
		count--;
		return temp;
	}

	public int peek() {
		// 1. read/return data of front end
		return arr[(front + 1) % SIZE];
	}

	public boolean isEmpty() {
		return count ==0;
	}

	public boolean isFull() {
		return count == SIZE;
	}

}
