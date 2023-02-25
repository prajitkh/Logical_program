package com.logic.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String string = "Race";
		String string2 = "Cxre";
		string = string.toLowerCase();
		string2 = string2.toLowerCase();
		if (string.length() == string2.length()) {

			char cc[] = string.toCharArray();
			char cc2[] = string2.toCharArray();

			Arrays.sort(cc);
			Arrays.sort(cc2);

			if (Arrays.equals(cc, cc2)) {

				System.out.println("the given is anaargam");
			} else {
				System.out.println("Not anagram");
			}

		} else {
			System.out.println("sss");
		}
	}
}
