package com.logic;

import java.util.Arrays;

public class Anagram {

	static boolean isAngaram(char[] st1, char[] st2) {
		int a = st1.length;
		int b = st2.length;

		if (a != b)
			return false;

		Arrays.sort(st1);
		Arrays.sort(st2);

//
//		for (int i = 0; i < a; i++)
//			if (st1[i] != st2[i])
//				return false;
		if (Arrays.equals(st1, st2))
			return true;
		return false;

	}

	public static void main(String[] args) {

		char st1[] = { 'r', 'p', 's' };
		char st2[] = { 'r', 'p', 's' };

		if (isAngaram(st1, st2))
			System.out.println("The two strings are" + 2 + " anagram of each other");
		else {
			System.out.println("sdf");
		}

	}

}
