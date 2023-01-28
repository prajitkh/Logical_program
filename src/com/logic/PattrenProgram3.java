package com.logic;

public class PattrenProgram3 {

	public static void main(String[] args) {

		int a[] = { 6, 8, 6, 4, 3, 6 };

		// ArrayList<Integer> list = new ArrayList<>();
		int ar[] = new int[a.length];
		int i, j;
		int lock = -1;
		for (i = 0; i < a.length; i++) {
			int count = 1;

			for (j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					ar[j] = lock;
				}

			}

		}
	}
}
