package com.sampleProject;

import com.sampleProject.assignments.Assignment5;

public class MainClass {

	public static void main(String[] args) {
		//StudentData d=new StudentData();
		//Student s1=d.getStudentDetails();
		//System.out.println(s1);
		String str = "RaghuRam";
		Assignment5 assignment5 = new Assignment5();
		assignment5.findVowelCount(str);
		
		String str2 = "RaghuRam";
		Assignment5 assignment = new Assignment5();
		assignment.reverseString(str2);
		
		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = assignment5.findLargeSmallNbr(arr);
		System.out.println("maximum is : " +arr1[1]);	
		System.out.println("minimum is : " +arr1[0]);	
		
	}

}
