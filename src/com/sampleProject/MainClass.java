package com.sampleProject;

import com.sampleProject.assignments.Assignment5;
import com.sampleProject.assignments.Assignment6;

public class MainClass {

	public static void main(String[] args) {
		// StudentData d=new StudentData();
		// Student s1=d.getStudentDetails();
		// System.out.println(s1);
		String str = "RaghuRam";
		Assignment5 assignment5 = new Assignment5();
		assignment5.findVowelCount(str);

		String str2 = "RaghuRam";
		Assignment5 assignment = new Assignment5();
		assignment.reverseString(str2);

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = assignment5.findLargeSmallNbr(arr);
		System.out.println("maximum is : " + arr1[1]);
		System.out.println("minimum is : " + arr1[0]);

		String str3 = "madam";

		boolean res = Assignment6.isPalindrome(str3);
		System.out.println(str3 + " is palindrome ?:" + res);

		String s = "35";
		int i = Integer.parseInt(s);
		System.out.println(s);

		String s1 = "iam learning java";
		String str4 = "java";
		boolean res1 = Assignment6.isWordPresent(s1, str4);

		System.out.println("the given string contains in the sentense : " + res1);
	}

}
