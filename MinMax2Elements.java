package com.wipro.arrays;
import java.util.*;
public class MinMax2Elements {
	public static void main(String[] args) {
		int[] a= {5,2,7,3,1,6};
		 Arrays.sort(a);
		System.out.println("the firt min value "+a[0]);
		System.out.println("the second min value "+ a[1]);
		System.out.println("the second max value "+ a[a.length-2]);
		System.out.println("the first max value "+a[a.length-1]);
	
		
	}
	

}
