package com.sunbeam;

import java.util.Scanner;

public class Question5 {

	public static boolean isPresent(int key, int occurance, int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (key == i)
				count++;
		}
		if (count >= occurance)
			return true;
		return false;
	}

	public static int checkIndex(int[] arr, int key, int occurance) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				count++;
			if (arr[i] == key && count == occurance)
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 34, 54, 44, 76, 98, 54, 66, 76, 88, 91 };

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		System.out.print("Enter the nth occurance of the key you want to search : ");
		int occurance = sc.nextInt();

		boolean flag = isPresent(key, occurance, arr);

		if (flag) {
			int index = checkIndex(arr, key, occurance);
			System.out.println("KEY " + key);
			System.out.println("OCURANCE OF THE KEY" + occurance);
			System.out.println("INDEX OF KEY " + index);
		} else {
			System.out.println("Key is not present, equal to or more than the occurance specified!!!");
		}

		sc.close();
	}
}
