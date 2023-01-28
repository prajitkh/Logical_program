package com.logic;

public class Stingdsf {
	public static void main(String[] args) {

		String name = "Prajit khawshi";

		String n = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			n = n + name.charAt(i);
		}
		System.out.println(n);
	}
}
