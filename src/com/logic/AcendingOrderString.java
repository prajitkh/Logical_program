package com.logic;

import java.util.HashSet;

public class AcendingOrderString {
	public static void main(String[] args) {

		int a[] = { 3, 3, 9, 5, 6, 7 };
		int[] ab = { 5, 6, 7, 9, 3 };

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < ab.length; j++) {
				if (a[i] == ab[j]) {
					set.add(a[i]);
				}

			}

		}
		System.out.println(set);
	}
}