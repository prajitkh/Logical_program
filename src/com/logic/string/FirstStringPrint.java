package com.logic.string;

import java.util.HashSet;

public class FirstStringPrint {

	public static void main(String[] args) {

		String s1 = "prajitttttttt";
		String s2 = "sujit";

		String ss = "";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					ss += s1.charAt(i);

				}
			}
		}
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(ss);
		System.out.println(hashSet);
	}
}
