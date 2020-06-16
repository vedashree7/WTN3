package com.wipro.patterns;

public class Pattern23 {
	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print( n-i+1);
			}
			System.out.println();		
		}
	
				
	}

}
