package com.logic.array;

import java.util.Arrays;

public class SecondHigestNumber {

	public static void main(String[] args) {

		int arr[] = { 4, 6, 7, 2, 3, 5, 6, 7, 8, 9, 10, 1213 };

		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}
}
