package com.logic;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String name = "my name is Prajit";
		String[] s = name.split(" ");

		System.out.println(Arrays.toString(s));

		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}

	}
}
