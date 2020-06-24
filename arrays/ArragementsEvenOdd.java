package com.wipro.arrays;

public class ArragementsEvenOdd {
    public static void main(String[] args) {
		int a[]=new int[] {0,1,1,0,0,1,1};
		int i;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}	 
	
}