package com.wipro.patterns;

public class Pattern27 {
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
				System.out.print(n-j);
			}
			System.out.println();		
		}
	
				
	}

}
