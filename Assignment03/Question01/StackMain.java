package com.sunbeam;

import java.util.Arrays;

public class StackMain {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };

		Stack s = new Stack(arr.length);

		for (int i = 0; i < arr.length; i++) {
			s.push(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}
		System.out.println(Arrays.toString(arr));

//      Another way to print in reverse 
//		for (int i = 0; i < arr.length; i++) {
//		System.out.print(" " +s.pop());
//	}

	}
}
