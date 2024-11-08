//QUESTION 2 TOTAL COMPARISIONS USING LINEAR SEARCH

package com.sunbeam;

import java.util.Scanner;

public class Question2 {

	public static int linearSearch(int arr[], int key) {
		int comps = 0;
		for (int i = 0; i < arr.length; i++) {
			comps++;
			if (key == arr[i]) {
				return comps;
			}

		}
		System.out.println("Using Linear Search No of comps : " + comps);
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 12, 57, 34, 76, 47, 45, 54 };
		System.out.print("Enter Key to be Search - ");
		int key = sc.nextInt();

		int lcomps = linearSearch(arr, key);
		if (lcomps == -1) {
			System.out.println("KEY NOT FOUND..");

		} else
			System.out.println("TOTAL COMPARISIONS IN LINEAR SEARCH -  " + lcomps);

		sc.close();
	}

}
