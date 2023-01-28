package com.logic.string;

public class StringeReverse {

	public static void main(String[] args) {

		String name = "Nimap infotech jjjnb";
//hcetofni pamiN

		String[] ss1 = name.split(" ");
		String ss = "";
		for (int i = ss1.length - 1; i >= 0; i--) {
			if (i != ss1.length - 1) {
				ss += ' ';
			}
			for (int j = ss1[i].length() - 1; j >= 0; j--) {
				ss += ss1[i].charAt(j);
			}
		}
		System.out.println(ss);

	}
}
