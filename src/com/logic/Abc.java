package com.logic;

public class Abc {

	public static void main(String[] args) {
		String name = "prajitppppp";
		char[] c = name.toCharArray();

		int j, i;
		int count = 1;
		int lock = -1;
		int num[] = new int[c.length];

		for (i = 0; i < c.length; i++) {
			count = 1;

			for (j = i + 1; j < name.length(); j++) {

				if (c[i] == c[j]) {
					count++;
					num[j] = lock;

				}
				// System.out.println(count);

			}
			if (num[i] != lock) {
				num[i] = count;
				System.out.println(c[i] + " " + num[i]);

			}
		}

	}
}
