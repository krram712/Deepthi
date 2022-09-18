package com.sampleProject.assignments;

public class Assignment5 {
	public int findVowelCount(String str) {
		
		str=str.toLowerCase();
		int count=0;
		for(int i = 0;i<str.length();i++) {
			if (str.charAt(i)== 'a' || str.charAt(i)== 'e' ||  str.charAt(i)== 'i'
					||  str.charAt(i)== 'o' ||  str.charAt(i)== 'u'  ) {
				count ++;
			}
		}
		System.out.println("The number of vowels in the  given String  : " + count);
		return count;
	}

	public String reverseString(String str) {
		String reversestr = "";
		char ch;
		System.out.println("The original String is : " +str);
		for (int i = 0 ; i < str.length(); i++) {
			ch = str.charAt(i);
			reversestr = ch+reversestr;
			
		}
		System.out.println("The reverse String is : "+reversestr);
		return reversestr;
	}

	public int[] findLargeSmallNbr(int[] arr) {
		int mini = arr[0];
		int maxi = arr[1];
		for (int i=0; i<arr.length;i++) {
			if (arr[i]<mini) {
				mini=arr[i];
			}
			else if (arr[i]>maxi) {
				maxi = arr[i];
			}
		}
		int[] temp = new int[2];
		temp[0]=mini;
		temp[1]=maxi;
		return temp;
	}

}
