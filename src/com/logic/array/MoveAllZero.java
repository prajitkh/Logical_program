package com.logic.array;

import java.util.ArrayList;

public class MoveAllZero {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int sss[] = new int[arr.length];
		int count = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arrayList.add(arr[i]);
			}

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				arrayList.add(arr[j]);
			}

		}
		System.out.println(arrayList);
	}

}