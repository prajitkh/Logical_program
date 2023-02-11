package com.logic.string;

public class ReverseString3 {
	public static void main(String[] args) {
		String var = "Coding is awesome";
		String[] ss = var.split(" ");
		String temp = "";
		for (int i = 0; i < ss.length; i++) {
			for (int j = ss[i].length() - 1; j >= 0; j--) {
				temp += ss[i].charAt(j);
			}
			temp += " ";

		}
		System.out.println(temp + " ");
	}

}
