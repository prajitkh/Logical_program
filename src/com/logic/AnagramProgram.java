package com.logic;

import java.util.Arrays;

public class AnagramProgram {
	public static void main(String[] args) {

		String str1[] = { "ttt", "tea", "act" };
		String str2[] = { "ttt", "toe", "acts" };

		int num[] = new int[str1.length];

		int i, j, k, c;

		for (i = 0; i < str1.length; i++) {

			if (str1[i].length() == str2[i].length()) {

				c = 0;

				for (j = 0; j < str1[i].length(); j++) {

					for (k = 0; k < str2[i].length(); k++) {
						if (str1[i].charAt(j) == str2[i].charAt(k))
							c++;

					}
				}
				num[i] = str1[i].length() - c;

			} else {
				num[i] = -1;
			}
		}
		System.out.println(Arrays.toString(num));

	}
}
