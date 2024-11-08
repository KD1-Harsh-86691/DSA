package com.sunbeam;

import java.util.Scanner;

public class Question4 {

	public static int binarySearch(int arr[], int key) {
		int left = 0, right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid]) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		// FOR BINARY SEARCH ARRAY SHOULD BE SORTED (ASC OR IN DESC)
		int arr[] = { 99,88,77,66,55,44,33,22,11 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to be entered = ");
		int key = sc.nextInt();

		int index = binarySearch(arr, key);
		if (index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
		sc.close();
	}

}