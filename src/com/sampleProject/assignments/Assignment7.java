package com.sampleProject.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment7 {
	public static void swapStrings() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("raghu");
		arr.add("deepthi");
		System.out.println("Before swapping the ArrayList is : ");
		System.out.println(arr);
		 Collections.swap(arr, 0, 1);
		 System.out.println("After Swap the ArrayList");
	        System.out.println(arr);
	}
	
	public static void removeArray() {
		ArrayList<String> rem =new ArrayList<String>();
		rem.add("ram");
		rem.add("raghu");
		rem.add("deepthi");
		System.out.println("Before removing the Arraylist is : " +rem);
		rem.remove(1);
		System.out.println("After removing the Index : " +rem);
		rem.remove("deepthi");
		System.out.println("After removing the String" +rem);
	}

}
