package com.wipro.patterns;

public class Pattern13 {
	public static void main(String[] args) {
		int i,j;
		int k=4;
		for(i=0;i<5;i++)
			{
			for(j=3;j>i;j--)
			{
			    k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}


}
