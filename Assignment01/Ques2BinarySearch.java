//QUESTION 2 TOTAL COMPARISIONS USING BINARY SEARCH

package com.sunbeam;

import java.util.Scanner;

public class Ques2BinarySearch {

	public static int binarySearch(int arr1[], int key) {
		int left = 0, right = arr1.length - 1, mid;
		int bcomps = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			bcomps++;
			if (key == arr1[mid])
				return bcomps;
			else if (key < arr1[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		System.out.print("Enter Key to be Search - ");
		int key = sc.nextInt();

		int comps = binarySearch(arr1, key);
		if (comps == -1) {
			System.out.println("KEY  NOT FOUND..");
		} else
			System.out.println("IN BINARY SEARCH TOTAL NO OF COMPARISIONS IS : " + comps);

		sc.close();
	}

}
