package com.logic.array;

import java.util.Arrays;

public class Anagram {

	static boolean anagram(String name, String name2) {

		char c[] = name.toCharArray();
		char cc[] = name2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(cc);

		return Arrays.equals(c, cc);
	}

	public static void main(String[] args) {

		String name = "PRAJIT";
		String name2 = "RPAJIT";

		System.out.println(anagram(name, name2));

	}
}
