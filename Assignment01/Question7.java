package com.sunbeam;

import java.util.Scanner;

public class Question7 {
	public static int checkRank(int[] arr, int ele) {
		int rank = 0;
		for (int i : arr) {
			if (i <= ele)
				rank++;
		}
		return rank;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.print("ENTER ELEMENT : ");
		int ele = sc.nextInt();

		int rank = checkRank(arr, ele);
		System.out.println("RANK -  " + rank);
	}

}
