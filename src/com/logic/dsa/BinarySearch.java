package com.logic.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 9 };

		int hi = arr.length - 1;
		int fi = 0;
		int search = 4;

		int mi = (hi + fi) / 2;

		while (fi <= hi) {
			if (arr[mi] == search) {

				System.out.println("element is " + mi + "   position");
				break;
			} else if (arr[mi] < search) {
				fi = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (hi + fi) / 2;
		}
		if (fi > hi) {
			System.out.println("element not found");
		}
	}

}
