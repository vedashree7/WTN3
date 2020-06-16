package com.wipro.patterns;

public class Pattern29 {	public static void main(String[] args) {
	int n=5;
	int i,j;
	int k=0;
	for(i=n;i>=1;i--)
	{
		for(j=n;j>i;j--)
		{
			System.out.print(" ");
		}
		for(j=i;j>1;j--)
		{
			
			k++;
			System.out.print(k);

		}
		System.out.println(" ");		
	}

			
}

}
