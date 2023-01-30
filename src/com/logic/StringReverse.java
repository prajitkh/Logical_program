package com.logic;

public class StringReverse {
	public static void main(String[] args) {

		String var = "prajit khawshi at post manikwada";

		String ss[] = var.split(" ");
		String sss = "";
		int j;
//		for (int i = ss.length - 1; i >= 0; i--) {
//			System.err.println(ss[i]);
//			for (j = 0; j < ss[i].length(); j++) {
//				sss += ss[i].charAt(j);
//
//			}
//			sss += " ";
//
//		}
//		System.out.println(sss);
//	}

		for (int i = ss.length - 1; i >= 0; i--) {
			sss += ss[i] + " ";
		}
		System.out.println(sss);

	}

}
//manikwada post at khawshi prajit
