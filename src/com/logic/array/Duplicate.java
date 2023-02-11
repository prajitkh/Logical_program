package com.logic.array;

import java.util.ArrayList;

public class Duplicate {
	public static void main(String[] args) {

		int arr[] = { 2, 4, 2, 3, 4, 4 };

		ArrayList<Integer> arrayList = new ArrayList<>();
		int c = -1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// if (c == -1) {
					arrayList.add(arr[i]);
					c = arr[i];
					break;
				}

			}

		}

		// }

		System.out.println(arrayList);

	}
}