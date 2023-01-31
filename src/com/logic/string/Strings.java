package com.logic.string;

public class Strings {
	public static void main(String[] args) {

		String s = "Prajit Khawshi Pune";
		String s1[] = s.split("\\s");
		int i, j;
		String n = "";
		String temp = "";
		for (i = s1.length - 1; i >= 0; i--) {
			temp = "";
			for (j = 0; j < s1[i].length(); j++) {
				if (j == 0) {
					temp += s1[i].charAt(j);
					n += s1[i].charAt(s1[i].length() - 1);
				} else if (j == s1[i].length() - 1) {
					n += temp;
				} else
					n += s1[i].charAt(j);
			}
			n += " ";
		}
		System.out.println(n);
	}
}