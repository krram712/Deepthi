package com.sampleProject.assignments;

public class Assignment6 {
	public static boolean isPalindrome(String str) {
		String reverse = "";
		boolean sol = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			sol = true;
		}
		return sol;
	}

	public static boolean isWordPresent(String sentense, String word) {
		String[] s = sentense.split(" ");
		for (String temp : s) {
			if (temp.equalsIgnoreCase(word)) {
				return true;
			}
		}
		return false;
	}
}
