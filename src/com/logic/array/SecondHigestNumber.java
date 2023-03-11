package com.logic.array;

public class SecondHigestNumber {

	public static void main(String[] args) {

		int arr[] = { 4, 6, 7, 2, 3, 5, 6, 7, 8, 67, 76, 34, 98, 32, 99 };
		int n;
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					n = arr[j];
					arr[j] = arr[i];
					arr[i] = n;
				}

			}
		}
		System.out.println(arr[3]);

	}
}
