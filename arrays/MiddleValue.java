package com.wipro.arrays;

public class MiddleValue {
	public static void main(String[] args) {
		int[] a=new int [] {2,3,5};
		int [] b=new int[] {4,5,6};
		
		System.out.println("{"+a[(a.length-1)/2]+","+b[(b.length-1)/2 ]+"}");
		
	}

}
