package com.wipro.patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int i,j;
		int k=0;
		for(i=0;i<5;i++)
			{
			for(j=0;j<i;j++)
			{
			  k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
