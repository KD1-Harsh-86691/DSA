package com.sunbeam;

public class Question1 {

	public static int linearSearch(int arr[], int key) {
		int occurance = 0;
		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i]) {
				occurance = i;
			}
		}
		return occurance;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 54, 34, 76, 46, 45, 54 };
		int key = 54;

		int lastOccuranceIndex = linearSearch(arr, key);
		System.out.println("Last Occurance of " + key + " is " + lastOccuranceIndex);

	}

}
