package com.logic.array;

import java.util.LinkedHashSet;

public class DescedingOrder {
	public static void main(String[] args) {

		int arr[] = { 9, 12, 7, 22, 5, 22 };

		int arr2[] = new int[arr.length];
		int temp = 0;
		int count;

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

	}
}