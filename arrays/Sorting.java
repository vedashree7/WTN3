package com.wipro.arrays;

import java.util.*;
public class Sorting {
	public static void main(String[] args) {
		int[] a=new int[] {5,1,7,6,8,2};
		int [] b=new int[a.length];
		int i;
		for(i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("unsorted array");
		{
			for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		}
		Arrays.sort(b);
		System.out.println();
		System.out.println("sorted array");
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		
	}

}
