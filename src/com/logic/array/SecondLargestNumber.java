package com.logic.array;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 22, 4, 566, 2, 66, 23 };
		int ss = arr.length;
		Arrays.sort(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		System.out.println(arr[ss - 2]);

	}

}
