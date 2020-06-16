package com.wipro.patterns;

public class Pattern9 {
	public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<5;i++)
			{
			for(j=4;j>i;j--)
			{
			
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}

}
