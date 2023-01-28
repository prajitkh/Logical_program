package com.logic.string;

public class ReverseString {
	public static void main(String[] args) {

//		String ss = "prajit !!! khawshi! k";
//		ss = ss.replaceAll("[^\\w\\s]", "");
//		for (int i = ss.length() - 1; i >= 0; i--) {
//			System.out.print(ss.charAt(i) + "");
//		}
//	}

		String name = "prajit khawshi manikwada ";

		String[] c = name.split(" ");
		String var = "";

		for (int i = 0; i < c.length; i++) {
			for (int j = c[i].length() - 1; j >= 0; j--) {
				var += c[i].charAt(j);
			}
			var += " ";
		}

		System.out.println(var + " ");

	}

}