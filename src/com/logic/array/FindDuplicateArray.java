package com.logic.array;

import java.util.ArrayList;

public class FindDuplicateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 4, 6 };
		int cc = -1;
		ArrayList<Integer> hashSet = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cc = arr[i];
					hashSet.add(arr[i]);
					break;
				}

			}
		}
		if (cc != -1) {
			System.out.println(hashSet);
		} else {
			System.out.println(-1);
		}

	}

}
