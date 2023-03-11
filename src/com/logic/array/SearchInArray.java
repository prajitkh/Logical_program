package com.logic.array;

import java.util.Arrays;

public class SearchInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 7, 6, 8, 4, 5, 98, 67, 12, 14, 43 };
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= arr.length - 3; i--) {
			System.out.println(arr[i]);
		}
	}

}
