package com.wipro.patterns;

public class Pattern21 {
	public static void main(String[] args) {
		int i,j,n=5;
		int k=0;
		for(i=0;i<n;i++)
		{
			for(j=2*(n-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=i;j>0;j--)
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}


}
