package com.logic.array;

public class MoveAllZero {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
			if (arr[i] == 0) {
				count++;

			}
		}
	}

}
