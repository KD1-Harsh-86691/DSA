package com.sunbeam;

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		LinearQueue q = new LinearQueue(4);
		int choice;
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				if(q.isFull()) System.out.println("Queue is full...");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if(q.isEmpty()) System.out.println("Queue is empty...");
				else {
					System.out.println("Popped value : "+ q.pop());
				}
				break;
			case 3:
				if(q.isEmpty()) System.out.println("Queue is empty...");
				else {
					System.out.println("Peeked value : "+ q.peek());
				}
				break;
			case 4:
				System.out.println("Thankyou...");
				break;
			default :
				System.out.println("Wrong choice!!!");
			}
		}while( choice != 4);
		
		sc.close();

	}

}

