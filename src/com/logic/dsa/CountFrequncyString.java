package com.logic.dsa;

public class CountFrequncyString {
	public static void main(String[] args) {

		String name = "prajittr";
		int count = 0;
		int lock = -1;
		char c[] = name.toCharArray();
		int as[] = new int[c.length];

		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					as[j] = lock;
				}

			}
			if (as[i] > lock) {
				as[i] = count;
				System.out.println(c[i] + "  " + count);

			}
		}

	}
}
