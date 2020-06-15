package com.wipro.arrays;

	public class MaxMinAarray {
	public static void main(String[] args) {
		int[] myList=new int [] {5,2,7,3,1};
		int max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	int min = myList[0];
    for (int i = 1; i < myList.length; i++) {
       if (myList[i] < min) max = myList[i];
    }
    System.out.println("Min is " + min);  
   System.out.println("Max is "+max);

}
	}
