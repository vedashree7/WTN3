package com.wipro.patterns;

public class Pattern18 {
	public static void main(String[] args) {
		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=2*(n-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=i;j>0;j--)
			{
				System.out.print(n-j+" ");
			}
			System.out.println();
		}
	}

}
