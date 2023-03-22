package com.logic.array;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int var = 0;
		int var1 = 0;
		int arr[] = { 1, 24, 22, 4, 566, 2, 66, 23, 5, 3, 2, 11, 21 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > var) {
				var = arr[i];

			}
			if (arr[i] != var && arr[i] > var1) {
				var1 = arr[i];
			}
		}
		System.out.println("second hghest number is " + var1);

	}
}