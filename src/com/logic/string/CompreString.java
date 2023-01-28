package com.logic.string;

import java.util.ArrayList;

public class CompreString {
	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		String[] var = s.split("\\.");
		String ss = "";
		ArrayList<String> arrayList = new ArrayList<>();
		for (String string : var) {
			arrayList.add(string);
		}
		System.out.println(arrayList);

		for (int i = var.length - 1; i >= 0; i--) {
			if (i == 0) {
				ss += var[i];

			} else {
				ss += var[i] + ".";
			}
		}

		System.out.println(ss);
	}
}
