package com.logic;

public class Swapping {
	public static void main(String[] args) {
		String name = "prajit khawshi, pune";
		String[] s1 = name.split(" ");
		System.out.println(s1.length);
		for (int i = s1.length - 1; i >= 0; i--) {

			System.out.print(s1[i] + " ");
		}

	}
}