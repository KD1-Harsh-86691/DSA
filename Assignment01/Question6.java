package com.sunbeam;

public class Question6 {

	public static int check(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		int element = check(arr);
		if (element == -1) {
			System.out.println("NO NON-REPEATING ELEMENT PRESENT IN THE ARRAY!");
		} 
		else {
			System.out.println("FIRST NON REPEATING ELEMENT : " + element);
		}

	}

}
