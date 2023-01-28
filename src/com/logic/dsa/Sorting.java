package com.logic.dsa;

public class Sorting {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 7, 9, 10, 12, 44, 54 };
		int i, j;
		for (i = 0; i < arr.length; i++) {
			int temp = 0;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(arr[i]);
		}
	}

}
