package com.logic;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int i;
		int arr[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		Arrays.sort(arr);
		int num = 0;
		for (i = 0; i < arr.length; i++) {
			num += arr[i];

		}
		System.out.println(num);
	}

}
