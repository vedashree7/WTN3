package com.wipro.languagebasics;

public class ReverseofNo {
	public static void main(String[] args) {
		int n=4523;
		int rev=0,r;
		while(n!=0)		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;		
		}
		System.out.println(rev);
	}
}
