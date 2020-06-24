package com.wipro.arrays;

import java.util.Arrays;

public class Tenremove {
	static void moveZerosToEnd(int arr[], int n) {  
	    int count = 0; 
	    int temp; 
	    for (int i = 0; i < n; i++) { 
	    if ((arr[i] != 0)) { 
	        temp = arr[count]; 
	        arr[count] = arr[i]; 
	        arr[i] = temp; 
	        count = count + 1; 
	    }
	  }
	} 
	public static void main(String[] args) {
		int a[]=new int[]{5,10,6,99,20,88,10};
		int i;
		for(i=0;i<a.length;i++)
		{
		    if(a[i]==10)
		    a[i]=a[i]%10;
		}
	
	
	Arrays.sort(a);
	
	moveZerosToEnd(a, a.length); 
	System.out.println();
	for(i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+" ");
	} 
	}
	}


