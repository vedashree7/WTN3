package com.wipro.patterns;

public class Pattern12 {
	public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<5;i++)
			{
			for(j=4;j>i;j--)
			{
			
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
